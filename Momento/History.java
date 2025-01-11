package Momento;
import java.util.*;
public class History {
    private List<State> states;
    public History(){
        states = new ArrayList<State>();
    }

    public void push(State state){
        states.add(state);
    }

    public String pop(){
        if(states.isEmpty())
            return "";
        State state = states.remove(states.size()-1);
        return state.getContent();
    }
}
