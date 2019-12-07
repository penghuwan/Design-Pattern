package plattern.VisitorPattern;

public class Grades implements Acceptor {
    Acceptor [] grades;
    public Grades () {
        grades = new Acceptor [] {
                new Grade1Student(),
                new Grade2Student(),
                new Grade3Student()
        };
    }
    public void accept(Visitor visitor) {
        for (int i=0;i<grades.length;i++) {
            Acceptor acceptor = grades[i];
            acceptor.accept(visitor);
        }
    }
}
