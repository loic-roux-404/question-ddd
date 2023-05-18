package org.contextmapper.generated.answercontext.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link org.contextmapper.generated.answercontext.domain.AnsweredTag} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class AnsweredTagDTO implements Serializable {

    private Long id;

    private Integer tagId;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnsweredTagDTO)) {
            return false;
        }

        AnsweredTagDTO answeredTagDTO = (AnsweredTagDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, answeredTagDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AnsweredTagDTO{" +
            "id=" + getId() +
            ", tagId=" + getTagId() +
            ", name='" + getName() + "'" +
            "}";
    }
}
