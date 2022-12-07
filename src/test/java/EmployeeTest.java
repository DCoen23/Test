import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee myEmp;
    @BeforeEach
    void setUp() {
        myEmp = new Employee("John", 12345678910l, "Full-time","Man", 21);
    }

    @Test
    void testName(){
        assertEquals("John", myEmp.getName());
    }
    @Test
    void testNameF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class,()->{new Employee("J", 12345678910l, "Full-time","Man", 21);});
        assertEquals("This is not a valid name.",exMessage.getMessage());
    }
    @Test
    void testPPSid(){
        assertEquals("John", myEmp.getName());
    }
    @Test
    void testPPSidF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class,()->{new Employee("John", 10l, "Full-time","Man", 21);});
        assertEquals("This is not a valid name.",exMessage.getMessage());
    }
    @Test
            void testType(){
        assertEquals("John", myEmp.getName());
    }
    @Test
    void testTypeF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class,()->{new Employee("John", 12345678910l, "Ftime","Man", 21);});
        assertEquals("This is not a valid name.",exMessage.getMessage());
    }
    @Test
    void testGender(){
        assertEquals("John", myEmp.getName());
    }
    @Test
    void testGenderF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class,()->{new Employee("John", 12345678910l, "Full-time","zzz", 21);});
        assertEquals("This is not a valid name.",exMessage.getMessage());
    }
    @Test
    void testAge(){
        assertEquals("John", myEmp.getName());
    }
    @Test
    void testAgeF(){
        Exception exMessage = assertThrows(IllegalArgumentException.class,()->{new Employee("John", 12345678910l, "Full-time","Man", 12);});
        assertEquals("This is not a valid name.",exMessage.getMessage());
    }
    @AfterEach
    void tearDown() {
    }
}