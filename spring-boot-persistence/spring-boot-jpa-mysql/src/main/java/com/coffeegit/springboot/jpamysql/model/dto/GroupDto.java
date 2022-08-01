package com.coffeegit.springboot.jpamysql.model.dto;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(
	ignoreUnknown = true
)
public class GroupDto {

	@NotEmpty(message = "Group name can not be empty")
    private String groupName;
}
