package com.stir.cscu9t4practical1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SprintEntryTest {
    
    public SprintEntryTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDay() {
        System.out.println("getDay");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResult = 1;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetYear() {
        System.out.println("getYear");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResult = 2003;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHour() {
        System.out.println("getHour");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMin() {
        System.out.println("getMin");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResult = 16;
        int result = instance.getMin();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSec() {
        System.out.println("getSec");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResult = 7;
        int result = instance.getSec();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        float expResult = 3.0F;
        float result = instance.getDistance();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testGetRepetitions() {
        System.out.println("getRepetitions");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResults = 4;
        int result = instance.getRepetitions();
        assertEquals(expResults, result);
    }

    @Test
    public void testGetRecovery() {
        System.out.println("getRepetitions");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        int expResults = 2;
        int result = instance.getRecovery();
        assertEquals(expResults, result);
    }

    @Test
    public void testGetEntry() {
System.out.println("getEntry");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, 2);
        String expResult = "Alice sprinted 4x300m in 0:16:7 with 2 minutes recovery on 1/2/2003\n";
        String result = instance.getEntry();
        assertEquals(expResult, result);
    }

}