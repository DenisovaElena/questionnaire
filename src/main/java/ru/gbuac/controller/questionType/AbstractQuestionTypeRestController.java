package ru.gbuac.controller.questionType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.gbuac.model.QuestionType;
import ru.gbuac.service.QuestionTypeService;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.assureIdConsistent;
import static ru.gbuac.util.ValidationUtil.checkNew;

public abstract class AbstractQuestionTypeRestController {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    protected QuestionTypeService questionTypeService;

    public QuestionType get(int id) {
        LOG.info("get " + id);
        return questionTypeService.get(id);
    }

    public List<QuestionType> getAll() {
        LOG.info("getAll");
        return questionTypeService.getAll();
    }

    public QuestionType create(QuestionType questionType) {
        LOG.info("create " + questionType);
        checkNew(questionType);
        return questionTypeService.save(questionType);
    }

    public QuestionType update(QuestionType questionType, int id) {
        LOG.info("update " + questionType);
        assureIdConsistent(questionType, id);
        return questionTypeService.update(questionType, id);
    }

    public void delete(int id) {
        LOG.info("delete " + id);
        questionTypeService.delete(id);
    }
}
