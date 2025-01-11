package State.StopWatch;

public class RunningState implements State {
    public StopWatch stopwatch;

    public RunningState(StopWatch stopWatch){
        this.stopwatch = stopWatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentState(new Stopped(stopwatch));
        System.out.println("Stopped");
    }
    
}
