package RecipeManager.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class ListViewer {
    //save list that is passed in here locally so it can be set and get
    JPanel mainFrame = new JPanel();
    private DefaultListModel<String> recipeViewList = new DefaultListModel<>();
    JList<String> recipeList = new JList<String>(recipeViewList);




    public ListViewer(Map<String, Map<String,String>> recipies) {
        this.mainFrame.setLayout(new BorderLayout());
        this.mainFrame.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        this.mainFrame.add(recipeList,BorderLayout.CENTER);

        for (String varName: recipies.keySet()){
            System.out.println(varName);
        }
    }

    public JPanel getList() {
        return mainFrame;
    }


}