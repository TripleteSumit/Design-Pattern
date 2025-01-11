package Momento;
public class Editor {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public State createState(){
        State s = new State(content);
        return s;
    }

    public void restore(History history){
        this.content = history.pop();
    }

    
}
