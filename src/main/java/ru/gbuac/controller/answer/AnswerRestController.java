package ru.gbuac.controller.answer;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.gbuac.model.Answer;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = AnswerRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class AnswerRestController extends AbstractAnswerRestController {

    public static final String REST_URL = "/rest/profile/answers";
    @Override
    @GetMapping(value = "/{id}")
    public Answer get(@PathVariable("id") int id) {
        return super.get(id);
    }

    @Override
    @GetMapping
    public List<Answer> getAll() {
        return super.getAll();
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") int id) {
        super.delete(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Answer updateOrCreate(@Valid @RequestBody Answer answer) {
        if (answer.isNew()) {
            return super.create(answer);
        } else {
            return super.update(answer, answer.getId());
        }
    }
}
