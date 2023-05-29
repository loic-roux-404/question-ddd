package org.contextmapper.generated.statcontext.client.evaluationcontext.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.contextmapper.generated.statcontext.client.evaluationcontext.model.EvaluatedAnswerDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AwardedPointEventDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-29T23:49:51.091058+02:00[Europe/Paris]")
public class AwardedPointEventDTO {

  private Long id;

  private EvaluatedAnswerDTO answer;

  public AwardedPointEventDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AwardedPointEventDTO answer(EvaluatedAnswerDTO answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
  */
  @Valid 
  @Schema(name = "answer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("answer")
  public EvaluatedAnswerDTO getAnswer() {
    return answer;
  }

  public void setAnswer(EvaluatedAnswerDTO answer) {
    this.answer = answer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwardedPointEventDTO awardedPointEventDTO = (AwardedPointEventDTO) o;
    return Objects.equals(this.id, awardedPointEventDTO.id) &&
        Objects.equals(this.answer, awardedPointEventDTO.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwardedPointEventDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

