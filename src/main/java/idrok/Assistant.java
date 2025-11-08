package idrok;

import org.springframework.stereotype.Component;

@Component
public class Assistant {
    private String name = "Shogirjon";
    private int age = 22;

    @Override
    public String toString() { return "Assistant{" + "name='" + name + '\'' + ", age=" + age + '}'; }
}
