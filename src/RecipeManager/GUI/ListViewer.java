package RecipeManager.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class ListViewer {
    //save list that is passed in here locally, so it can be set and get
    JPanel mainFrame = new JPanel();
    JPanel subFrame = new JPanel();
    JPanel recipeViewer = new JPanel();
    private DefaultListModel<String> recipeViewList = new DefaultListModel<>();
    JList<String> recipeList = new JList<>(recipeViewList);
    JTextField testText = new JTextField();




    public ListViewer(Map<String, Map<String,String>> recipes) {
        this.mainFrame.setLayout(new BorderLayout());
        this.mainFrame.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        this.testText.setText("Hello");
        this.recipeViewer.add(testText,BorderLayout.CENTER);


        this.subFrame.setLayout(new GridLayout(1,2));
        this.subFrame.add(recipeList);
        this.subFrame.add(recipeViewer);

        this.mainFrame.add(subFrame,BorderLayout.CENTER);

        for (String varName: recipes.keySet()){
            System.out.println(varName);
        }
    }

    public JPanel getList() {
        return mainFrame;
    }


}