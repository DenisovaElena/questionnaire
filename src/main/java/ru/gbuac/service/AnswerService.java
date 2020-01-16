package ru.gbuac.service;

import ru.gbuac.model.Answer;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

public interface AnswerService {

    Answer get(int id) throws NotFoundException;

    List<Answer> getAll();

    Answer save(Answer answer);

    Answer update(Answer answer, int id) throws NotFoundException;

    void delete(int id) throws NotFoundException;
}
