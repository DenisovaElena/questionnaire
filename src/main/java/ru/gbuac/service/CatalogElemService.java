package ru.gbuac.service;

import ru.gbuac.model.CatalogElem;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

public interface CatalogElemService {

    CatalogElem get(int id) throws NotFoundException;

    List<CatalogElem> getAll();

    CatalogElem save(CatalogElem catalogElem);

    CatalogElem update(CatalogElem catalogElem, int id) throws NotFoundException;

    void delete(int id) throws NotFoundException;
}
