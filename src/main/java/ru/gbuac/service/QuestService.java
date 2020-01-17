package ru.gbuac.service;

import ru.gbuac.model.Quest;
import ru.gbuac.model.Question;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

public interface QuestService {
    Quest get(int id) throws NotFoundException;

    List<Quest> getAll();

    Quest save(Quest quest);

    Quest update(Quest quest, int id) throws NotFoundException;

    void delete(int id) throws NotFoundException;

}
