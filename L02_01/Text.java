
public class Text implements Component{
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Text clone() {
        Text target = new Text(this.getContent());
        return target;
    }

    public String toString() {
        return super.toString() + "(content=" + this.getContent() + ")";
    }
}
