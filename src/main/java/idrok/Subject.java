package idrok;

public class Subject {
    private String title;
    private Professor professor; // domla
    private Assistant assistant; // asistent

    public void setTitle(String title) { this.title = title; }

    public void setProfessor(Professor professor) { this.professor = professor; }

    public void setAssistant(Assistant assistant) { this.assistant = assistant; }

    @Override
    public String toString() {
        return "Subject{" + "title='" + title + '\'' + ", professor=" + professor + ", assistant=" + assistant + '}'; }
}
