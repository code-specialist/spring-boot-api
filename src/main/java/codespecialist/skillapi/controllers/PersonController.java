package codespecialist.skillapi.controllers;


import codespecialist.skillapi.models.Person;
import codespecialist.skillapi.models.PersonSkills;
import codespecialist.skillapi.models.Skill;
import codespecialist.skillapi.repositories.PersonRepository;
import codespecialist.skillapi.repositories.PersonSkillsRepository;
import codespecialist.skillapi.repositories.SkillRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private PersonSkillsRepository personSkillsRepository;

    // Returns all persons
    @GetMapping// http://127.0.0.1:8080/person
    public List<Person> list() {
        return personRepository.findAll();
    }

    // Returns a specific person
    @GetMapping("{id}") // http://127.0.0.1:8080/person/{id}
    public Person get(@PathVariable Long id) {
        return personRepository.getById(id);
    }

    // Adds a person. Expects the person as payload
    @PostMapping// http://127.0.0.1:8080/person
    public Person create(@RequestBody final Person person) {
        return personRepository.saveAndFlush(person);
    }

    // Adds a list of skills to a specific person
    @PostMapping("{id}/skills") // http://127.0.0.1:8080/person/{id}/skills
    public Person addSkills(@PathVariable Long id, @RequestBody List<Long> skill_ids) {
        Person person = personRepository.getById(id);
        for (Long skill_id : skill_ids) {
            Skill skill = skillRepository.getById(skill_id);
            personSkillsRepository.saveAndFlush(new PersonSkills(person, skill));
        }
        return personRepository.getById(id);
    }

    // Deletes a specific person
    @DeleteMapping("{id}") // http://127.0.0.1:8080/person/{id}
    public void delete(@PathVariable Long id) {
        personRepository.deleteById(id);
    }

    // Updates a persons content
    @PutMapping("{id}") // http://127.0.0.1:8080/person/{id}
    public Person update(@PathVariable Long id, @RequestBody Person person) {
        Person currentPerson = personRepository.getById(id);
        BeanUtils.copyProperties(person, currentPerson, "person_id");
        return personRepository.saveAndFlush(currentPerson);
    }
}
