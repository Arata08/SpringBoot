package com.example.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ChenXing
 * 2024/4/12 下午6:41
 * describe：
 *  读取配置的方式1: @Value
 *      直接可以在属性上添加即可
 *      @Value(key必须写全了)
 *      @value只能读取单个值
 *  批量配置读取:
 *     @ConfigurationProperties(prefix = "zwf.user") 通用的前缀
 *     实体类
 *       属性名 = 最后一个key的值
 *     优势1: 方便 不用一个一个读取
 *     优势2: 可以给集合类型赋值
 */
@Data
@Component
@ConfigurationProperties(prefix = "cx.user")//下面的cx.user就可以不用了
public class User {
    //@Value("${cx.user.username}")
    private String name;
    //@Value("${cx.user.password}")
    private String password;
    //@Value("${cx.user.gfs}")
    private List<String> gfs;
}
