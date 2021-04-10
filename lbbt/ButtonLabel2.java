package lbbt;

import java.awt.*;

public class ButtonLabel2 extends Frame{
    Button ok;
    Label label;
    public ButtonLabel2(){
        Frame f = new Frame ("ButtonLabel()");
        f.setLayout(new FlowLayout());

        ok = new Button("ok");
        label = new Label("힘들어요");

        f.add(ok);
        f.add(label);

        f.setSize(333, 222);
        f.setVisible(true);
    }
    
}
