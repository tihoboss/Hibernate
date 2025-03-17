package tiho.boss.sqll2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tiho.boss.sqll2.Persons;
import tiho.boss.sqll2.repository.Repository;

import java.util.List;

@RestController
public class Controller {
    private final Repository repository;

    @Autowired
    public Controller(final Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getInfo(@RequestParam("city") String city) {
        return repository.getPersonsByCity(city);
    }
}