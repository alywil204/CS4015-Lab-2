
public class Demo {

    public static void main(String[] args) {
        Timeline timeline = new Timeline();
        ContextMenu menu = new ContextMenu(timeline);

        Text text = new Text("Hello");
        timeline.add(text);

        menu.duplicate(text);

        Clip clip = new Clip();
        timeline.add(clip);

        Audio audio = new Audio();
        timeline.add(audio);

        menu.duplicate(clip);

        Text text2 = new Text("Hello2");
        timeline.add(text2);

        menu.duplicate(audio);

        System.out.println(timeline);
    }
}
