//package practice.kafkalistener;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class KafkaListeners {
//    String receivedData;
//
//    @KafkaListener(
//            topics = "yk",
//            groupId = "test1"
//    )
//    public String listener(String data) {
//        System.out.print("Got message!");
//        this.receivedData = data;
//        return data;
//    }
//}
