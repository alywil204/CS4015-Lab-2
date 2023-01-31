
import java.util.ArrayList;
import java.util.List;

public class Timeline {
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < components.size(); i++) {
            string += components.get(i);
            if (i < components.size() - 1) {
                string += " ";
            }
        }
        return string;
    }
}
