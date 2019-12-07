package plattern.FacadePattern;

// 合体后的大皇帝
public class BigKing {
    Franky franky;
    QiaoBa qiaoba;
    Sanj sanj;
    Zoro zoro;
    public BigKing () {
        franky = new Franky();
        qiaoba = new QiaoBa();
        sanj = new Sanj();
        zoro = new Zoro();
    }

    public void useSord () {
        zoro.useSword();
    }

    public void kick () {
        sanj.kick();
    }

    public void openFire () {
        franky.openFire();
    }

    public void cure () {
        qiaoba.cure();
    }


}
