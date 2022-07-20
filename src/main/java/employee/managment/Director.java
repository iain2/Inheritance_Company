package employee.managment;

public class Director extends Manager{

    private double budget;

    public Director(String name, String ni, int salary, String deptName, double budget) {
        super(name, ni, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double payBonus(){
        return 0.02 * this.salary;
    }
}
