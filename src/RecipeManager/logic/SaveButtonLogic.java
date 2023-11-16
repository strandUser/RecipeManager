package RecipeManager.logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveButtonLogic implements ActionListener {
    JPanel test;

    public SaveButtonLogic(JPanel mainTab){
        this.test = mainTab;
    }
    public void actionPerformed(ActionEvent e){
        this.test.updateUI();
    }
}