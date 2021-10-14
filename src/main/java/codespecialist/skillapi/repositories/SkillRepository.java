package codespecialist.skillapi.repositories;

import codespecialist.skillapi.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
