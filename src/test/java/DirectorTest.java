import employee.managment.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Karry", "PA 45 34 38 D", 70000, "Construction", 1000000);
    }

    @Test
    public void hasName(){
        assertEquals("Karry", director.getName());
    }
    @Test
    public void hasNi(){
        assertEquals("PA 45 34 38 D", director.getNi());
    }
    @Test
    public void hasSalary() {
        assertEquals(70000, director.getSalary());
    }

    @Test
    public void hasDept() {
        assertEquals("Construction", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1.1);
        assertEquals(77000, director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(1400, director.payBonus(), 0.0);
    }
    @Test
    public void hasBudget(){
        assertEquals(1000000, director.getBudget(),0.0);
    }



}

