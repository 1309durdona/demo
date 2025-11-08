package idrok;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Professor {
    private String name = "Domla";
    private String surname = "Domlayev";

    @Override
    public String toString() { return "Professor{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + '}'; }


}
