package tiho.boss.sqll2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tiho.boss.sqll2.Persons;
import tiho.boss.sqll2.repository.SRepository;

import java.util.List;

@RestController
public class Controller {
    private final SRepository repository;

    public Controller(SRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getInfo(@RequestParam("city") String city) {
        return repository.getPersonsByCity(city);
    }
}
