package ru.gbuac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.gbuac.dao.QuestRepository;
import ru.gbuac.model.Quest;
import ru.gbuac.model.Question;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.checkNotFoundWithId;

@Service
public class QuestServiceImpl implements QuestService {

    @Autowired
    QuestRepository questRepository;

    @Override
    public Quest get(int id) throws NotFoundException {
        return checkNotFoundWithId(questRepository.findById(id).orElse(null), id);
    }

    @Override
    public List<Quest> getAll() {
        return questRepository.findAll();
    }

    @Override
    public Quest save(Quest quest) {
        Assert.notNull(quest, "quest must not be null");
        return questRepository.save(quest);
    }

    @Override
    public Quest update(Quest quest, int id) throws NotFoundException {
        Assert.notNull(quest, "question must not be null");
        Quest savedQuest = checkNotFoundWithId(questRepository.save(quest), id);
        return savedQuest;
    }

    @Override
    public void delete(int id) throws NotFoundException {
        questRepository.delete(id);
    }
}
