package org.contextmapper.generated.gateway.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link org.contextmapper.generated.gateway.domain.EvaluationQuestion} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class EvaluationQuestionDTO implements Serializable {

    private Long id;

    private Integer questionId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EvaluationQuestionDTO)) {
            return false;
        }

        EvaluationQuestionDTO evaluationQuestionDTO = (EvaluationQuestionDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, evaluationQuestionDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "EvaluationQuestionDTO{" +
            "id=" + getId() +
            ", questionId=" + getQuestionId() +
            "}";
    }
}
