package State.StopWatch;

public class Stopped implements State{
    private StopWatch stopWatch;

    public Stopped(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setCurrentState(new RunningState(stopWatch));
        System.out.println("Running");
    }
    
}
