package com.schnabel.schnabel.drugs.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Drug DTO for JSON representation
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonRootName("drug")
@Relation(collectionRelation = "drugs")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DrugDTO extends RepresentationModel<DrugDTO>{
    private Long id;
    private String name;
    private String description;
    private double score;
}
