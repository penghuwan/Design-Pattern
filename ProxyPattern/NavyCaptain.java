package plattern.ProxyPattern;

public class NavyCaptain implements NavyFighter {
    String name = "海军上尉";
    // 海军装备预算不够，不能购买二十一大快刀
    public void useSword() {
      System.out.println(name +"发动了一次普通的斩击");
    }
    // 没有果实能力，只能徒手格斗了
    public void fight() {
        System.out.println(name + "发动了一次普通的拳击");
    }

    public void useGuns() {
        System.out.println(name +"打出了一发普通的海楼石子弹");
    }
}
