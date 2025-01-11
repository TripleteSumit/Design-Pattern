package State.StopWatch;

public class StopWatch {

    private State currentState = new Stopped(this);

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void click(){
        currentState.click();
    }

}
