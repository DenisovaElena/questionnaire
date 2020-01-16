package ru.gbuac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.gbuac.dao.AnswerRepository;
import ru.gbuac.model.Answer;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.checkNotFoundWithId;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    AnswerRepository answerRepository;

    @Override
    public Answer get(int id) throws NotFoundException {
        return checkNotFoundWithId(answerRepository.findById(id).orElse(null), id);
    }

    @Override
    public List<Answer> getAll(int id) {
        return answerRepository.findAll();
    }

    @Override
    public Answer save(Answer answer) {
        Assert.notNull(answer, "answer must not be null");
        return answerRepository.save(answer);
    }

    @Override
    public Answer update(Answer answer, int id) throws NotFoundException {
        Assert.notNull(answer, "answer must not be null");
        Answer savedAnswer = checkNotFoundWithId(answerRepository.save(answer), id);
        return savedAnswer;
    }

    @Override
    public void delete(int id) throws NotFoundException {
        answerRepository.delete(id);
    }
}
