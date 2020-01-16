package ru.gbuac.controller.answer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.gbuac.model.Answer;
import ru.gbuac.service.AnswerService;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.assureIdConsistent;
import static ru.gbuac.util.ValidationUtil.checkNew;

public abstract class AbstractAnswerRestController {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    protected AnswerService answerService;

    public Answer get(int id) {
        LOG.info("get " + id);
        return answerService.get(id);
    }

    public List<Answer> getAll() {
        LOG.info("getAll");
        return answerService.getAll();
    }

    public Answer create(Answer answer) {
        LOG.info("create " + answer);
        checkNew(answer);
        return answerService.save(answer);
    }

    public Answer update(Answer answer, int id) {
        LOG.info("update " + answer);
        assureIdConsistent(answer, id);
        return answerService.update(answer, id);
    }

    public void delete(int id) {
        LOG.info("delete " + id);
        answerService.delete(id);
    }
}
