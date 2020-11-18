package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Demo {
    public static void main(String[] args) {
        SpringApplication.run(Demo.class, args);
    }

    @RequestMapping("/demo")
    public String home() {
        return "Hello World! Demo";
    }
}
