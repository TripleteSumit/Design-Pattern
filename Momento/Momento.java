package Momento;
public class Momento{

    public static void main(String[] args) {

        Editor editor = new Editor();
        History history = new History();
        editor.setContent("Hello world");
        history.push(editor.createState());
        editor.setContent("My name is sumit Dey");
        history.push(editor.createState());
        editor.setContent("What's you name?");
        System.err.println(editor.getContent());
        editor.restore(history);
        System.out.println(editor.getContent());
        editor.restore(history);
        System.out.println(editor.getContent());
        editor.restore(history);
        System.out.println(editor.getContent());
    }
}