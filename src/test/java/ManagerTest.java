import employee.managment.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Garry", "PA 45 34 38 D", 45000, "Construction");
    }

    @Test
    public void hasName(){
        assertEquals("Garry", manager.getName());
    }
    @Test
    public void hasNi(){
        assertEquals("PA 45 34 38 D", manager.getNi());
    }
    @Test
    public void hasSalary() {
        assertEquals(45000, manager.getSalary());
    }

    @Test
    public void hasDept() {
        assertEquals("Construction", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.1);
        assertEquals(49500, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(450, manager.payBonus(), 0.0);
    }



}
