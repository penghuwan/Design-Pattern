package plattern.VisitorPattern;

public class Test {
    public static void main(String args []) {
        Grades grades = new Grades();
        Visitor visitor = new Headmaster();
        grades.accept(visitor);
    }
}
