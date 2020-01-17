package ru.gbuac.controller.quest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.gbuac.model.Quest;
import ru.gbuac.model.Question;
import ru.gbuac.service.AnswerService;
import ru.gbuac.service.QuestService;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.assureIdConsistent;
import static ru.gbuac.util.ValidationUtil.checkNew;

public abstract class AbstractQuestRestController {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    protected QuestService questService;

    public Quest get(int id) {
        LOG.info("get " + id);
        return questService.get(id);
    }

    public List<Quest> getAll() {
        LOG.info("getAllQuests");
        return questService.getAll();
    }

    public Quest create(Quest quest) {
        LOG.info("create " + quest);
        checkNew(quest);
        return questService.save(quest);
    }

    public Quest update(Quest quest, int id) {
        LOG.info("update " + quest);
        assureIdConsistent(quest, id);
        return questService.update(quest, id);
    }

    public void delete(int id) {
        LOG.info("delete " + id);
        questService.delete(id);
    }


}
