package codespecialist.skillapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor // Auto-generate a default constructor with Lombok
@Embeddable
public class PersonSkillsKey implements Serializable {
    private Long skillId;
    private Long personId;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((skillId == null) ? 0 : skillId.hashCode());
        result = prime * result + ((personId == null) ? 0 : personId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        PersonSkillsKey other = (PersonSkillsKey) obj;
        return Objects.equals(getPersonId(), other.getPersonId()) && Objects.equals(getSkillId(), other.getSkillId());
    }
}
