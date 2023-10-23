package RecipeManager.GUI;

import javax.swing.*;
import java.awt.*;

public class ListViewer {
    //save list that is passed in here locally so it can be set and get
    JPanel mainFrame = new JPanel();
    JList<String> recipeList = new JList<>();



    public ListViewer() {
        this.mainFrame.setLayout(new BorderLayout());
        this.mainFrame.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        this.mainFrame.add(recipeList,BorderLayout.CENTER);

    }

    public JPanel getList() {
        return mainFrame;
    }


}