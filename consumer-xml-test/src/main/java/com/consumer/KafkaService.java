package com.consumer;

import com.suning.kafka.client.consumer.SnKafkaConsumer;
import com.suning.kafka.client.consumer.SnKafkaConsumerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by 17081290 on 2021/5/6.
 */
@Service
public class KafkaService {
    @Autowired
    private SnKafkaConsumer<String,String> consumer;
    //private SnKafkaConsumerFactory consumer;


    @PostConstruct
    public void consumerMsg(){
        System.out.println("==========进入==============");
//        consumer.setListener(new MyMessageListener());
//        consumer.start();
        try {
            Thread.sleep(5000*20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // consumer.close();
    }

}
