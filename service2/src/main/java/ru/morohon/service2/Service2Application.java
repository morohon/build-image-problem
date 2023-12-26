package ru.morohon.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.morohon.library.SomeClassLibrary;

@SpringBootApplication
public class Service2Application {

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class, args);
        SomeClassLibrary someClassLibrary = new SomeClassLibrary();
    }

}
