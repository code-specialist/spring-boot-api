package codespecialist.skillapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Getter
@Setter
@Entity(name = "person_skills")
public class PersonSkills {
    @EmbeddedId
    private PersonSkillsKey id = new PersonSkillsKey();

    @ManyToOne
    @MapsId("personId")
    private Person person;

    @ManyToOne
    @MapsId("skillId")
    private Skill skill;
}
