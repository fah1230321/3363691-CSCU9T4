package com.stir.cscu9t4practical1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SwimEntryTest {
    
    public SwimEntryTest() {
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
        SwimEntry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3,"outdoors");
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDay() {
        System.out.println("getDay");
        SwimEntry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3,"pool");
        int expResult = 1;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        SwimEntry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3,"outdoors");
        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetYear() {
        System.out.println("getYear");
        SwimEntry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3,"pool");
        int expResult = 2003;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHour() {
        System.out.println("getHour");
        SwimEntry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3,"pool");
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMin() {
        System.out.println("getMin");
        SwimEntry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3,"pool");
        int expResult = 16;
        int result = instance.getMin();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetSec() {
        System.out.println("getSec");
        SwimEntry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3,"pool");
        int expResult = 7;
        int result = instance.getSec();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        SwimEntry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3,"pool");
        float expResult = 3.0F;
        float result = instance.getDistance();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGetWhere_Outdoors() {
        System.out.println("getWhere");
        SwimEntry instanceA = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3,"outdoors");
        String expResultA = "outdoors";
        String result = instanceA.getWhere();
        assertEquals(expResultA, result);
    }
    
    @Test
    public void testGetWhere_Pool() {
        System.out.println("getWhere");
        SwimEntry instanceB = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3,"pool");
        String expResultB = "in a pool";
        String result = instanceB.getWhere();
        assertEquals(expResultB, result);
    }
    
    @Test
    public void testGetEntry() {
        System.out.println("getEntry");
        SwimEntry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3,"outdoors");
        String expResult = "Alice swam 3.0 km outdoors in 0:16:7 on 1/2/2003\n";
        String result = instance.getEntry();
        assertEquals(expResult, result);
    }
    
}