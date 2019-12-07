package plattern.VisitorPattern;

public class Grade2Student implements Acceptor{
    String grade;
    public  Grade2Student () {
        grade = "二年级";
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}