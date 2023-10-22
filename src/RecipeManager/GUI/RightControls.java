package RecipeManager.GUI;

import javax.swing.*;
import java.awt.*;

public class RightControls {
    JPanel returnControls = new JPanel();
    JCheckBox test1CheckBox = new JCheckBox("Test1");
    JCheckBox test2CheckBox = new JCheckBox("Test2");

    public RightControls() {
        returnControls.setLayout(new GridLayout(2,1));
        returnControls.add(test1CheckBox);
        returnControls.add(test2CheckBox);
    }

    public JPanel getRightControls(){
        return returnControls;
    }
}