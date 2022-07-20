import employee.techstaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Larry", "GH 67 45 34 S", 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Larry", developer.getName());
    }
    @Test
    public void hasNi(){
        assertEquals("GH 67 45 34 S", developer.getNi());
    }
    @Test
    public void hasSalary() {
        assertEquals(30000, developer.getSalary());
    }


    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1.1);
        assertEquals(33000, developer.getSalary());
    }

    @Test
    public void cantRaiseNegativeNumber(){
        developer.raiseSalary(-0.1);
        assertEquals(30000, developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, developer.payBonus(), 0.0);
    }

    @Test
    public void canChangeName(){
        developer.setName("Tarry");
        assertEquals("Tarry", developer.getName());
    }

    @Test
    public void canChangeNameEmptyString(){
        developer.setName("");
        assertEquals("Larry", developer.getName());
    }

}
