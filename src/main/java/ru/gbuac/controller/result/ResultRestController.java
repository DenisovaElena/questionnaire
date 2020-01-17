package ru.gbuac.controller.result;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.gbuac.model.Result;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = ResultRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class ResultRestController extends AbstractResultRestController {

    public static final String REST_URL = "/rest/profile/quests/{questId}/results";
    @Override
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable("id") int id, @PathVariable("questId") int questId) {
        return super.get(id, questId);
    }

    @Override
    @GetMapping
    public List<Result> getAll() {
        return super.getAll();
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") int id) {
        super.delete(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result updateOrCreate(@Valid @RequestBody Result result) {
        if (result.isNew()) {
            return super.create(result);
        } else {
            return super.update(result, result.getId());
        }
    }

    @Override
    @PostMapping(value = "/entire", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result saveEntireResult(@Valid @RequestBody Result result) {
        return super.saveEntireResult(result);
    }
}
