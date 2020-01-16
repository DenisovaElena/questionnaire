package ru.gbuac.service;

import ru.gbuac.model.QuestionType;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

public interface QuestionTypeService {

    QuestionType get(int id) throws NotFoundException;

    List<QuestionType> getAll(int id);

    QuestionType save(QuestionType questionType);

    QuestionType update(QuestionType questionType, int id) throws NotFoundException;

    void delete(int id) throws NotFoundException;
}
