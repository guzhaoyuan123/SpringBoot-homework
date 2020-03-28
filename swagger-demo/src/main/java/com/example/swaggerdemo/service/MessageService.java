package com.example.swaggerdemo.service;


import com.example.swaggerdemo.exception.CustomException;
import com.example.swaggerdemo.pojo.Message;

import java.util.List;

public interface MessageService {
    List<Message> findAll();
    Message findOne(Long id);
    Message save(Message message) throws CustomException;
    void delete(Long id);
    Message update(Message message) throws CustomException;
    Message updateText(Message message) throws CustomException;
}