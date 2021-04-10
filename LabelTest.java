import java.awt.*;
public class LabelTest {
    public static void main(String[] args) {
        Frame f = new Frame("label test");
        Label l = new Label("IT : Kim A");

        f.add(l);
        f.setSize(400, 150);
        f.setVisible(true);
    }
}
