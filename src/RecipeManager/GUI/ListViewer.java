package RecipeManager.GUI;

import javax.swing.*;
import java.awt.*;

public class ListViewer {
    //save list that is passed in here locally so it can be set and get
    JPanel mainFrame = new JPanel();
    JList<String> recipeList = new JList<String>();



    public ListViewer() {
        this.mainFrame.setLayout(new BorderLayout());
        this.mainFrame.add(recipeList);
    }

    public JPanel getList() {
        return mainFrame;
    }


}