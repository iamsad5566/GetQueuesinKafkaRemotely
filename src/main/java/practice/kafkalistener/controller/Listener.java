package practice.kafkalistener.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Listener {

    @GetMapping("read")
    @KafkaListener(topics = "yk", groupId = "test1")
    public void listener(String data) {
        System.out.print("Hello, got the message! " + data);
    }
}
