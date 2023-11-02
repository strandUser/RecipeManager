package RecipeManager.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class AddRecipeControls {
    JPanel mainFrame = new JPanel();

    public AddRecipeControls(){
        this.mainFrame.setLayout(new BorderLayout());
        this.mainFrame.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    }

    public JPanel getAddControls(){
        return this.mainFrame;
    }
}