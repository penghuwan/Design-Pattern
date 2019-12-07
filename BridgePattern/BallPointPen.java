package plattern.BridgePattern;

public class BallPointPen extends Pen {
    String type = "圆珠笔";
    public BallPointPen (Color color) {
        super(color);
    }
    String description() {
        return this.color.description() + this.type;
    }
}
