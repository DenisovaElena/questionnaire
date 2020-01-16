package ru.gbuac.controller.catalog;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.gbuac.controller.answer.AbstractAnswerRestController;
import ru.gbuac.model.Catalog;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = CatalogRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class CatalogRestController extends AbstractCatalogRestController {

    public static final String REST_URL = "/rest/profile/catalogs";

    @Override
    @GetMapping(value = "/{id}")
    public Catalog get(@PathVariable("id") int id) {
        return super.get(id);
    }

    @Override
    @GetMapping
    public List<Catalog> getAll() {
        return super.getAll();
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") int id) {
        super.delete(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Catalog updateOrCreate(@Valid @RequestBody Catalog catalog) {
        if (catalog.isNew()) {
            return super.create(catalog);
        } else {
            return super.update(catalog, catalog.getId());
        }
    }
}
