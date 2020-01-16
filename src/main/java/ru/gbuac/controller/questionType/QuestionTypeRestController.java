package ru.gbuac.controller.questionType;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.gbuac.model.QuestionType;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = QuestionTypeRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class QuestionTypeRestController extends AbstractQuestionTypeRestController {

    public static final String REST_URL = "/rest/profile/questionTypes";
    @Override
    @GetMapping(value = "/{id}")
    public QuestionType get(@PathVariable("id") int id) {
        return super.get(id);
    }

    @Override
    @GetMapping
    public List<QuestionType> getAll() {
        return super.getAll();
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") int id) {
        super.delete(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public QuestionType updateOrCreate(@Valid @RequestBody QuestionType questionType) {
        if (questionType.isNew()) {
            return super.create(questionType);
        } else {
            return super.update(questionType, questionType.getId());
        }
    }
}
