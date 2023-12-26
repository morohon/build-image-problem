package ru.morohon.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.morohon.library.SomeClassLibrary;

@SpringBootApplication
public class Service1Application {

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
        SomeClassLibrary someClassLibrary = new SomeClassLibrary();
    }

}
