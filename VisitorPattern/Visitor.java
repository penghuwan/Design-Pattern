package plattern.VisitorPattern;

public interface Visitor {
    public void visit (Grade1Student student);
    public void visit (Grade2Student student);
    public void visit (Grade3Student student);
}
