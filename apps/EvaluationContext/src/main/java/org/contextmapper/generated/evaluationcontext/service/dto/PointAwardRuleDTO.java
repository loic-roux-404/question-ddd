package org.contextmapper.generated.evaluationcontext.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link org.contextmapper.generated.evaluationcontext.domain.PointAwardRule} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class PointAwardRuleDTO implements Serializable {

    private Long id;

    private Integer scoreEvolution;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getScoreEvolution() {
        return scoreEvolution;
    }

    public void setScoreEvolution(Integer scoreEvolution) {
        this.scoreEvolution = scoreEvolution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PointAwardRuleDTO)) {
            return false;
        }

        PointAwardRuleDTO pointAwardRuleDTO = (PointAwardRuleDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, pointAwardRuleDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PointAwardRuleDTO{" +
            "id=" + getId() +
            ", scoreEvolution=" + getScoreEvolution() +
            "}";
    }
}
