package lbbt;

import java.awt.*;

public class ButtonLabel1 extends Frame{
    Button ok;
    Label label;
    public ButtonLabel1(String msg){
        super(msg);
        setLayout(new FlowLayout());

        ok = new Button("ok");
        label = new Label("힘들어요");

        add(ok);
        add(label);

        setSize(333, 222);
        setVisible(true);
    }
    
}
