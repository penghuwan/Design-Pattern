package plattern.BridgePattern;

public class Pencil extends Pen {
    String type = "铅笔";
    public Pencil (Color color) {
        super(color);
    }
    String description() {
        return this.color.description() + this.type;
    }
}
