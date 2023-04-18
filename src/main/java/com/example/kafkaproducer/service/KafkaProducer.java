package com.example.kafkaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.kafkaproducer.constants.AppConstants;

import lombok.extern.java.Log;

@Log
@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        log.info(String.format("Message sent -> %s", message));
        kafkaTemplate.send(AppConstants.TOPIC_NAME, message);
    }
}
