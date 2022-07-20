package employee.managment;

import employee.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String ni, int salary, String deptName) {
        super(name, ni, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
