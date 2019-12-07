package plattern.TemplatePattern;

public abstract class Exam {
    abstract void readQuestion();
    abstract void think ();
    abstract void answer ();
    public final void takeExamination () {
        readQuestion();
        think();
        answer();
        System.out.println("——————————————");
    }
}
