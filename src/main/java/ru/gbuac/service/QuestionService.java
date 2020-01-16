package ru.gbuac.service;

import ru.gbuac.model.Question;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

public interface QuestionService {

    Question get(int id) throws NotFoundException;

    List<Question> getAll(int id);

    Question save(Question question);

    Question update(Question question, int id) throws NotFoundException;

    void delete(int id) throws NotFoundException;
}
