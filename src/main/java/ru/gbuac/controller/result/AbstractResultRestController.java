package ru.gbuac.controller.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.gbuac.model.Result;
import ru.gbuac.service.ResultService;
;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.assureIdConsistent;
import static ru.gbuac.util.ValidationUtil.checkNew;

public abstract class AbstractResultRestController {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    protected ResultService resultService;

    public Result get(int id) {
        LOG.info("get " + id);
        return resultService.get(id);
    }

    public List<Result> getAll() {
        LOG.info("getAll");
        return resultService.getAll();
    }

    public Result create(Result questionType) {
        LOG.info("create " + questionType);
        checkNew(questionType);
        return resultService.save(questionType);
    }

    public Result update(Result result, int id) {
        LOG.info("update " + result);
        assureIdConsistent(result, id);
        return resultService.update(result, id);
    }

    public void delete(int id) {
        LOG.info("delete " + id);
        resultService.delete(id);
    }
}
