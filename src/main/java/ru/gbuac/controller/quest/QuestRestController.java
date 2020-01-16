package ru.gbuac.controller.quest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.gbuac.model.Quest;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = QuestRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class QuestRestController extends AbstractQuestRestController {

    public static final String REST_URL = "/rest/profile/quests";
    @Override
    @GetMapping(value = "/{id}")
    public Quest get(@PathVariable("id") int id) {
        return super.get(id);
    }

    @Override
    @GetMapping
    public List<Quest> getAll() {
        return super.getAll();
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") int id) {
        super.delete(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Quest updateOrCreate(@Valid @RequestBody Quest quest) {
        if (quest.isNew()) {
            return super.create(quest);
        } else {
            return super.update(quest, quest.getId());
        }
    }
}
