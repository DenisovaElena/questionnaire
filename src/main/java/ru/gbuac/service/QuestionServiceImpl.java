package ru.gbuac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.gbuac.dao.QuestionRepository;
import ru.gbuac.model.Question;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.checkNotFoundWithId;

@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question get(int id) throws NotFoundException {
        return checkNotFoundWithId(questionRepository.findById(id).orElse(null), id);
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question save(Question question) {
        Assert.notNull(question, "question must not be null");
        return questionRepository.save(question);
    }

    @Override
    public Question update(Question question, int id) throws NotFoundException {
        Assert.notNull(question, "question must not be null");
        Question savedQuestion = checkNotFoundWithId(questionRepository.save(question), id);
        return savedQuestion;
    }

    @Override
    public void delete(int id) throws NotFoundException {
        questionRepository.delete(id);
    }


    @Override
    public List<Question> getAll(int questId) {
        return questionRepository.getAll(questId);
    }
}
