package ru.gbuac.controller.question;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.gbuac.model.Question;
import ru.gbuac.service.QuestionService;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.assureIdConsistent;
import static ru.gbuac.util.ValidationUtil.checkNew;

public abstract class AbstractQuestionRestController {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    protected QuestionService questionService;

    public Question get(int id) {
        LOG.info("get " + id);
        return questionService.get(id);
    }

    public List<Question> getAll() {
        LOG.info("getAll");
        return questionService.getAll();
    }

    public Question create(Question question) {
        LOG.info("create " + question);
        checkNew(question);
        return questionService.save(question);
    }

    public Question update(Question question, int id) {
        LOG.info("update " + question);
        assureIdConsistent(question, id);
        return questionService.update(question, id);
    }

    public void delete(int id) {
        LOG.info("delete " + id);
        questionService.delete(id);
    }

    public List<Question> getAll(int questId) {
        LOG.info("getAll");
        return questionService.getAll(questId);
    }
}
