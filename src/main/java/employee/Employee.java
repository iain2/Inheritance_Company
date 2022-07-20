package employee;

public abstract class Employee {

    private String name;
    private String ni;
    public int salary;

    public Employee(String name, String ni, int salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() == false){
            this.name = name;
    }}



    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise){
        if (raise > 0){
            this.salary = (int) (this.salary * raise);
    }}

    public double payBonus(){
        return 0.01 * this.salary;
    }

    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }
}
