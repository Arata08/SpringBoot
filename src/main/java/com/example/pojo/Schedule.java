package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName schedule
 */
@TableName(value ="schedule")
@Data
public class Schedule implements Serializable {
    private Integer id;

    private String title;

    private Integer completed;

    private static final long serialVersionUID = 1L;
}