package com.codewithmosh.store.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class UserDto {
//    @JsonIgnore
//    @JsonProperty("user_id")
    private Long id;
    private String name;
    private String email;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private String phone_num;

}
