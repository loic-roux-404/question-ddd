package org.contextmapper.generated.statcontext.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link org.contextmapper.generated.statcontext.domain.TagStatsViewed} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class TagStatsViewedDTO implements Serializable {

    private Long id;

    private StatisticSubjectTagDTO tag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatisticSubjectTagDTO getTag() {
        return tag;
    }

    public void setTag(StatisticSubjectTagDTO tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TagStatsViewedDTO)) {
            return false;
        }

        TagStatsViewedDTO tagStatsViewedDTO = (TagStatsViewedDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, tagStatsViewedDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "TagStatsViewedDTO{" +
            "id=" + getId() +
            ", tag=" + getTag() +
            "}";
    }
}
