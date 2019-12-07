package plattern.ProxyPattern;

public class Test {
    public static void main(String args []) {
        NavyFighter navyCaptain = new NavyCaptain();
        navyCaptain.useSword();
        navyCaptain.fight();
        navyCaptain.useGuns();
        System.out.println("-----------------------------");
        NavyFighter doflamingo = new Doflamingo(navyCaptain);
        doflamingo.useSword();
        doflamingo.fight();
        doflamingo.useSword();
    }
}
