package plattern.ProxyPattern;

public class Doflamingo implements NavyFighter {
    NavyFighter navyFighter;
    public Doflamingo (NavyFighter navyFighter) {
        this.navyFighter = navyFighter;
    }

    public void useSword() {
        System.out.print("在多佛朗明哥操控下,");
      this.navyFighter.useSword();
    }

    public void fight() {
        System.out.print("在多佛朗明哥操控下,");
      this.navyFighter.fight();
    }

    public void useGuns() {
        System.out.print("在多佛朗明哥操控下,");
        this.navyFighter.useGuns();
    }
}
