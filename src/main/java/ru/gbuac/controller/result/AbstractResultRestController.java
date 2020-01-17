package ru.gbuac.controller.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.gbuac.model.Answer;
import ru.gbuac.model.Question;
import ru.gbuac.model.Result;
import ru.gbuac.service.AnswerService;
import ru.gbuac.service.QuestionService;
import ru.gbuac.service.ResultService;
;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.assureIdConsistent;
import static ru.gbuac.util.ValidationUtil.checkNew;

public abstract class AbstractResultRestController {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    protected ResultService resultService;

    @Autowired
    QuestionService questionService;

    @Autowired
    AnswerService answerService;

    public Result get(int id, int questId) {
        LOG.info("get " + id);
        return resultService.get(id, questId);
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

    public Result saveEntireResult(Result result) {
        LOG.info("updateEntireResult " + result);

        Result savedResult = null;
        if (result.isNew()) {
            savedResult = create(result);
        } else {
            Result returnedResult = resultService.get(result.getId(), result.getQuest().getId());
            returnedResult.setStatus(result.getStatus());
            savedResult = update(returnedResult, returnedResult.getId());
        }

        int id = savedResult.getId();
        int questId = result.getQuest().getId();
        Result requestResult = resultService.get(id, questId);

        for (Answer answer : result.getAnswers())
        {
            answer.setResult(requestResult);
            Question question = answer.getQuestion();
            answer.setQuestion(questionService.get(question.getId(), questId));
            answerService.save(answer);
        }

        return savedResult;

    }

}
