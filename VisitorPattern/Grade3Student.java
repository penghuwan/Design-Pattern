package plattern.VisitorPattern;

public class Grade3Student implements Acceptor{
    String grade;
    public Grade3Student () {
        grade = "三年级";
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
