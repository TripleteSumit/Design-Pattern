package State.Canvas;

public class Selection implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Selected tool is here");
    }

    @Override
    public void mouseUp() {
        System.out.println("Select the drag button on it");
    }
    
}
