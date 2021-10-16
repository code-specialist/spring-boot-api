package codespecialist.skillapi.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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

    public PersonSkills(Person person, Skill skill) {
        this.person = person;
        this.skill = skill;
    }
}
