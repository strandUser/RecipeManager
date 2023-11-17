package RecipeManager.Tests;

import RecipeManager.GUI.*;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class JUnitTests {

    @Test
    void mainGUISetupTest() {
        MainGUI mainTest = new MainGUI();
        assertNotNull(mainTest,"Failed to setup MainGUI");
    }

    @Test
    void addRecipeSetupTest() {
        AddRecipeControls testObj = new AddRecipeControls();
        assertNotNull(testObj,"Failed to setup AddRecipeControls");
    }

    @Test
    void listViewerSetupTest() {
        Map<String, Map<String,String>> test = new TreeMap<>();
        ListViewer listTest = new ListViewer(test);
        assertNotNull(listTest, "Failed to setup ListViewer");
    }

    @Test
    void rightControlsSetupTest() {
        RightControls rTest = new RightControls();
        assertNotNull(rTest);
    }

    @Test
    void leftControlsSetupTest() {
        LeftControls lTest = new LeftControls();
        assertNotNull(lTest);
    }

    @Test
    void generalNotesSetupTest() {
        GeneralNotes testNotes = new GeneralNotes();
        assertNotNull(testNotes);
    }
}