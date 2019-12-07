package plattern.BridgePattern;

public class Crayon extends Pen {
    String type = "蜡笔";
    public Crayon (Color color) {
        super(color);
    }
    String description() {
        return this.color.description() + this.type;
    }
}
