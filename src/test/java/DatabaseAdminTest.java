import employee.techstaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Harry", "PA 45 34 38 D", 25000);
    }

    @Test
    public void hasName(){
        assertEquals("Harry", databaseAdmin.getName());
    }
    @Test
    public void hasNi(){
        assertEquals("PA 45 34 38 D", databaseAdmin.getNi());
    }
    @Test
    public void hasSalary() {
        assertEquals(25000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1.1);
        assertEquals(27500, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(250, databaseAdmin.payBonus(), 0.0);
    }


}
