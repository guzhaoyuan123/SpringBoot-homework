package com.example.restfulexceptiondemo.pojo;

import lombok.Data;
import lombok.NonNull;
/**
 * @author Lenovo
 */
@Data
public class Message {
    private Long id;
    @NonNull
    private String text;
    private String summary;
}
