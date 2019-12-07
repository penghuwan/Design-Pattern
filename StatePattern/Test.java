package plattern.StatePattern;

public class Test {
    public static void main(String args []) {
        State secGearState = new SecGearState();
        State thirdGearState = new ThirdGearState();
        State fourGearState = new FourGearState();
        Context context = new Context();
        // 路飞进化成二档
        context.setState(secGearState);
        context.punch();
        context.kick();
        System.out.println("----------------");
        // 路飞进化成三档
        context.setState(thirdGearState);
        context.punch();
        context.kick();
        System.out.println("----------------");
        // 路飞进化成四档
        context.setState(fourGearState);
        context.punch();
        context.kick();
    }
}