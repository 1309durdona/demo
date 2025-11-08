package idrok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Application started successfully!");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.todo();


    }

}
