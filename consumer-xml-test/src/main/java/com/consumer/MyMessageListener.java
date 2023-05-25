package com.consumer;

import com.suning.kafka.client.consumer.KafkaMessageListener;
import com.suning.kafka.client.consumer.MessageRecord;
import com.suning.kafka.client.consumer.SnKafkaConsumer;
import org.apache.kafka.common.Metric;
import org.apache.kafka.common.MetricName;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.Headers;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by 17081290 on 2021/4/7.
 */
public class MyMessageListener implements KafkaMessageListener<String,String> {
    @Override
    public void onMessage(SnKafkaConsumer<String,String> snKafkaConsumer, MessageRecord<String,String> messageRecord) {
        String topic = messageRecord.getTopic();
        int partition = messageRecord.getPartition();
        long timestamp = messageRecord.getTimestamp();
//        Long key = (Long)messageRecord.getKey();
//        long keyValue = key;
        String keyValue = (String)messageRecord.getKey();
        //long keyValue = key;

        System.out.println();
        String msg = (String)messageRecord.getMessage();
        System.out.println("消费信息的topic： "+topic+" 分区为："+partition+" 时间戳为: "+timestamp
                +" key = "+keyValue+" msg ="+msg);

//        Map<MetricName, ? extends Metric> metrics =snKafkaConsumer.metrics();
//        for (Map.Entry<MetricName, ? extends Metric> entry : metrics.entrySet()) {
//            System.out.println("metric info.....");
//            System.out.println(entry.getKey().name() + " : " + entry.getValue().metricValue());
//        }

        


        //处理头信息
//        Headers headers = messageRecord.getHeaders();
//        Iterator<Header> iterator = headers.iterator();
//        System.out.println("header info......");
//        while(iterator.hasNext()){
//            System.out.println(" header key: "+iterator.next().key()+" header value: "+iterator.next().value().toString());
//            System.out.println("=====下一个header 信息=======");
//        }
    }


    @Override
    public void onMessageError(SnKafkaConsumer<String, String> consumer, MessageRecord<String, String> record, Throwable t){


    }
}
