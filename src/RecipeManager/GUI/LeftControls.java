package RecipeManager.GUI;

import javax.swing.*;
import java.awt.*;

public class LeftControls {
    JPanel returnControls = new JPanel();
    JCheckBox test1CheckBox = new JCheckBox("Test1");

    public LeftControls() {
        returnControls.setLayout(new GridLayout(2,1));
        returnControls.add(test1CheckBox);
    }

    public JPanel getRightControls(){
        return returnControls;
    }


}