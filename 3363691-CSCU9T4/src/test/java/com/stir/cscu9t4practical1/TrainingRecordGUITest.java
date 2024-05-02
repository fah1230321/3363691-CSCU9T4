package com.stir.cscu9t4practical1;
import java.awt.event.ActionEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JButton;

public class TrainingRecordGUITest {

    public TrainingRecordGUITest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TrainingRecordGUI.main(args);
    }

    @Test
    public void testActionPerformed() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("Action not performed");
    }

    @Test
    public void testBlankDisplay() {
        System.out.println("blankDisplay");
        TrainingRecordGUI instance = new TrainingRecordGUI();
        instance.blankDisplay();
    }
    
    @Test
    public void testAddEntry(){
        System.out.println("addEntry");
        TrainingRecordGUI instance = new TrainingRecordGUI();
        Entry entry = new Entry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        instance.fillDisplay(entry);
        String message = instance.addEntry("generic");
        System.out.println(message);
        assertEquals(message,"Record added\n");
    }
    
    @Test
    public void testButtonsPresentInGUI() throws IllegalAccessException, IllegalArgumentException{
        System.out.println("Check if you have added the buttons"); 
        TrainingRecordGUI instance = new TrainingRecordGUI();
        Class<?> instanceClass = instance.getClass();
        String[] expectedFields = {"findAllByDate","lookUpByDate"}; // add RemoveEntry when it is ready
        Field fields[] = instanceClass.getDeclaredFields();
        int found = 0;
        for (Field field : fields) {
            if (Arrays.asList(expectedFields).contains(field.getName())){
                found += 1;
                field.setAccessible(true);
                assertTrue(field.get(instance) instanceof JButton);
            }
        }
        assertEquals(found,expectedFields.length,"Have you added all required buttons?");
    }
}
