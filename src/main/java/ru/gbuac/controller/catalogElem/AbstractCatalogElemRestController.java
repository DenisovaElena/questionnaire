package ru.gbuac.controller.catalogElem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.gbuac.model.CatalogElem;
import ru.gbuac.service.CatalogElemService;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.assureIdConsistent;
import static ru.gbuac.util.ValidationUtil.checkNew;

public abstract class AbstractCatalogElemRestController {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    protected CatalogElemService catalogElemService;

    public CatalogElem get(int id) {
        LOG.info("get " + id);
        return catalogElemService.get(id);
    }

    public List<CatalogElem> getAll() {
        LOG.info("getAll");
        return catalogElemService.getAll();
    }

    public CatalogElem create(CatalogElem catalogElem) {
        LOG.info("create " + catalogElem);
        checkNew(catalogElem);
        return catalogElemService.save(catalogElem);
    }

    public CatalogElem update(CatalogElem catalogElem, int id) {
        LOG.info("update " + catalogElem);
        assureIdConsistent(catalogElem, id);
        return catalogElemService.update(catalogElem, id);
    }

    public void delete(int id) {
        LOG.info("delete " + id);
        catalogElemService.delete(id);
    }
}
