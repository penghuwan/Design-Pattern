package plattern.BridgePattern;

public class Test {
    public static void main(String args []) {
        Pen pencil = new Pencil(new Blue());
        Pen crayon = new Crayon(new Red());
        Pen ballPointPen = new BallPointPen(new Yellow());
        System.out.println(pencil.description());
        System.out.println(crayon.description());
        System.out.println(ballPointPen.description());
    }
}
