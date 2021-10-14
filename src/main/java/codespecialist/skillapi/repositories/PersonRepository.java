package codespecialist.skillapi.repositories;

import codespecialist.skillapi.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
