package com.brillante.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World!") String name) {
        return String.format("Hello %s!", name);
    }

//    @GetMapping("/isOdd")
//    public String hello(@RequestParam(value = "num") Integer num){
//        String result = num % 2 == 0 ? "EVEN" : "ODD";
//        return String.format("The number %d is %s", num, result);
//    }

    public String isOdd(@RequestParam int number) {
        if (number % 2 == 0) {
            return number + " is even";
        } else {
            return number + " is odd";
        }
    }
}