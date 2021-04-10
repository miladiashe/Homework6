package lt2;
import java.awt.*;

public class ButtonTest {
    ButtonTest(){
        Frame f = new Frame("label test");
        Button b = new Button("BTN");

        f.add(b);
        f.setSize(400, 150);
        f.setVisible(true);

    }
    
}
