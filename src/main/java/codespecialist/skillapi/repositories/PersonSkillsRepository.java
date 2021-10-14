package codespecialist.skillapi.repositories;

import codespecialist.skillapi.models.PersonSkills;
import codespecialist.skillapi.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSkillsRepository extends JpaRepository<PersonSkills, Long> {
}
