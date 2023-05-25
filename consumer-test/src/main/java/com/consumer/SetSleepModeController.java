package com.consumer;

import com.suning.kafka.client.consumer.SnKafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 17081290 on 2021/5/6.
 */
@Controller
public class SetSleepModeController {
    @Autowired
    SnKafkaConsumer consumer;

    @GetMapping("/setSleepMode")
    public String setSeleepMode(){
        consumer.setSleepingMode(true);

        return "set consumer to sleep";
    }

    @GetMapping("/setNormalMode")
    public String setNormalMode(){
        consumer.setSleepingMode(false);
        return "set consumer to normal";
    }




}
