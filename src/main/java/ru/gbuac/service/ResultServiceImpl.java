package ru.gbuac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.gbuac.dao.ResultRepository;
import ru.gbuac.model.Result;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.checkNotFoundWithId;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    ResultRepository resultRepository;

    @Override
    public Result get(int id) throws NotFoundException {
        return checkNotFoundWithId(resultRepository.findById(id).orElse(null), id);
    }

    @Override
    public List<Result> getAll() {
        return resultRepository.findAll();
    }

    @Override
    public Result save(Result result) {
        Assert.notNull(result, "result must not be null");
        return resultRepository.save(result);
    }

    @Override
    public Result update(Result result, int id) throws NotFoundException {
        Assert.notNull(result, "result must not be null");
        Result savedResult = checkNotFoundWithId(resultRepository.save(result), id);
        return savedResult;
    }

    @Override
    public void delete(int id) throws NotFoundException {
        resultRepository.delete(id);
    }
}
