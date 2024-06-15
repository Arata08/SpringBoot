package com.example.pojo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName students
*/
public class Students implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Integer id;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("")
    @Length(max= 50,message="编码长度不能超过50")
    private String name;
    /**
    * 
    */
    @NotBlank(message="[]不能为空")
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("")
    @Length(max= 10,message="编码长度不能超过10")
    private String gender;
    /**
    * 
    */
    @ApiModelProperty("")
    private Integer age;
    /**
    * 
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("")
    @Length(max= 50,message="编码长度不能超过50")
    private String class;

    /**
    * 
    */
    private void setId(Integer id){
    this.id = id;
    }

    /**
    * 
    */
    private void setName(String name){
    this.name = name;
    }

    /**
    * 
    */
    private void setGender(String gender){
    this.gender = gender;
    }

    /**
    * 
    */
    private void setAge(Integer age){
    this.age = age;
    }

    /**
    * 
    */
    private void setClass(String class){
    this.class = class;
    }


    /**
    * 
    */
    private Integer getId(){
    return this.id;
    }

    /**
    * 
    */
    private String getName(){
    return this.name;
    }

    /**
    * 
    */
    private String getGender(){
    return this.gender;
    }

    /**
    * 
    */
    private Integer getAge(){
    return this.age;
    }

    /**
    * 
    */
    private String getClass(){
    return this.class;
    }

}
