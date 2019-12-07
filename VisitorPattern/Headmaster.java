package plattern.VisitorPattern;

public class Headmaster implements Visitor {
    public void visit (Grade1Student student) {
        System.out.println("正在检阅" + student.grade);
    }

    public void visit (Grade2Student student) {
        System.out.println("正在检阅" + student.grade);
    }

    public void visit (Grade3Student student) {
        System.out.println("正在检阅" + student.grade);
    }
}
