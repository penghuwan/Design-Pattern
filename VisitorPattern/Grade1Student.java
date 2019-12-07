package plattern.VisitorPattern;

public class Grade1Student implements Acceptor{
    String grade;
    public  Grade1Student () {
      grade = "一年级";
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
