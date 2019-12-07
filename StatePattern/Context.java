package plattern.StatePattern;

public class Context {
    State state;
    public void setState(State state){
        this.state = state;
    }
    public void punch () {
        state.punch();
    }

    public  void kick () {
        state.kick();
    }
}

