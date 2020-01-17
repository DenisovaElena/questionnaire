package ru.gbuac.controller.catalogElem;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.gbuac.model.CatalogElem;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = CatalogElemRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class CatalogElemRestController extends AbstractCatalogElemRestController {

    public static final String REST_URL = "/rest/profile/catalogElems";

    @Override
    @GetMapping(value = "/{id}")
    public CatalogElem get(@PathVariable("id") int id) {
        return super.get(id);
    }

    @Override
    @GetMapping
    public List<CatalogElem> getAll() {
        return super.getAll();
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") int id) {
        super.delete(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CatalogElem updateOrCreate(@Valid @RequestBody CatalogElem catalogElem) {
        if (catalogElem.isNew()) {
            return super.create(catalogElem);
        } else {
            return super.update(catalogElem, catalogElem.getId());
        }
    }
}
