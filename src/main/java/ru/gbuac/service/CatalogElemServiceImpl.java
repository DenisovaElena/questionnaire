package ru.gbuac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.gbuac.dao.CatalogElemRepository;
import ru.gbuac.model.CatalogElem;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.checkNotFoundWithId;

@Service
public class CatalogElemServiceImpl implements CatalogElemService {

    @Autowired
    CatalogElemRepository catalogElemRepository;

    @Override
    public CatalogElem get(int id) throws NotFoundException {
        return checkNotFoundWithId(catalogElemRepository.findById(id).orElse(null), id);
    }

    @Override
    public List<CatalogElem> getAll() {
        return catalogElemRepository.findAll();
    }

    @Override
    public CatalogElem save(CatalogElem catalogElem) {
        Assert.notNull(catalogElem, "catalogelem must not be null");
        return catalogElemRepository.save(catalogElem);
    }

    @Override
    public CatalogElem update(CatalogElem catalogElem, int id) throws NotFoundException {
        Assert.notNull(catalogElem, "catalogelem must not be null");
        CatalogElem savedCatalogElem = checkNotFoundWithId(catalogElemRepository.save(catalogElem), id);
        return savedCatalogElem;
    }

    @Override
    public void delete(int id) throws NotFoundException {
        catalogElemRepository.delete(id);
    }
}
