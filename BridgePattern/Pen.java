package plattern.BridgePattern;

public abstract class Pen {
    Color color;
    public Pen(Color color) {
        this.color = color;
    }
    abstract String description();
}
