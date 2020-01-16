package ru.gbuac.controller.result;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.gbuac.model.Result;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = ResultRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class ResultRestController extends AbstractResultRestController {

    public static final String REST_URL = "/rest/profile/results";
    @Override
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable("id") int id) {
        return super.get(id);
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
}
