package com.example.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Schedule implements Serializable {
    private Integer id;

    private String title;

    private Integer completed;

    private static final long serialVersionUID = 1L;
}