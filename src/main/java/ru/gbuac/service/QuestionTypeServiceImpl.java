package ru.gbuac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.gbuac.dao.QuestionTypeRepository;
import ru.gbuac.model.QuestionType;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.checkNotFoundWithId;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService{

    @Autowired
    QuestionTypeRepository questionTypeRepositoryRepository;

    @Override
    public QuestionType get(int id) throws NotFoundException {
        return checkNotFoundWithId(questionTypeRepositoryRepository.findById(id).orElse(null), id);
    }

    @Override
    public List<QuestionType> getAll() {
        return questionTypeRepositoryRepository.findAll();
    }

    @Override
    public QuestionType save(QuestionType questionType) {
        Assert.notNull(questionType, "questionType must not be null");
        return questionTypeRepositoryRepository.save(questionType);
    }

    @Override
    public QuestionType update(QuestionType questionType, int id) throws NotFoundException {
        Assert.notNull(questionType, "questionType must not be null");
        QuestionType savedQuestionType = checkNotFoundWithId(questionTypeRepositoryRepository.save(questionType), id);
        return savedQuestionType;
    }

    @Override
    public void delete(int id) throws NotFoundException {
        questionTypeRepositoryRepository.delete(id);
    }
}
