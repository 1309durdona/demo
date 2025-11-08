package idrok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Subject {
    private String title;

    @Autowired
    private Professor professor; // domla

    @Autowired
    private Assistant assistant; // asistent

    public void setTitle(String title) { this.title = title; }

    public void setProfessor(Professor professor) { this.professor = professor; }

    public void setAssistant(Assistant assistant) { this.assistant = assistant; }

    @Override
    public String toString() {
        return "Subject{" + "title='" + title + '\'' + ", professor=" + professor + ", assistant=" + assistant + '}'; }
}
