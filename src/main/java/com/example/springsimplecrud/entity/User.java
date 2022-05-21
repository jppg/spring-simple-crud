package com.example.springsimplecrud.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @ApiModelProperty(name="name",required=true,value="John")
    private String userName;

    @ApiModelProperty(allowableValues = "male,female")
    private String userGender;

    private String userAddress;


    //@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @ManyToMany
    @JoinTable(
            name = "user_departments",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "dep_id")
    )
    private List<Department> userDepartments;
}
