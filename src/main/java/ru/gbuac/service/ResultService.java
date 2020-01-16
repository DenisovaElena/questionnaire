package ru.gbuac.service;

import ru.gbuac.model.Result;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

public interface ResultService {

    Result get(int id) throws NotFoundException;

    List<Result> getAll();

    Result save(Result result);

    Result update(Result result, int id) throws NotFoundException;

    void delete(int id) throws NotFoundException;
}
