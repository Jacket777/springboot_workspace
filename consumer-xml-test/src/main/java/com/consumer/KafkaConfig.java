package com.consumer;

import com.suning.kafka.client.consumer.KafkaMessageListener;
import com.suning.kafka.client.consumer.SnKafkaConsumer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Properties;

/**
 * Created by 17081290 on 2021/5/6.
 */
@Configuration
public class KafkaConfig {
    @Bean
    public KafkaMessageListener<String,String> listener(){
        return new MyMessageListener();
    }

    @Bean
    public SnKafkaConsumer<String,String>consumer(){
        Properties properties = new Properties();
        properties.setProperty("group.id","BDMS_kafka206_consumer");
        //properties.setProperty("key.deserializer","org.apache.kafka.common.serialization.LongDeserializer");
       // properties.setProperty("value.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
        //properties.setProperty("enable.auto.commit","false");
        SnKafkaConsumer<String, String> consumer = new SnKafkaConsumer<>(Arrays.asList("kafka206_B1","kafka_B2","kafka206_B3"), properties);
        consumer.setListener(listener());
        //consumer.setMessageProcessThreadNum(1);
        return consumer;
    }

}
