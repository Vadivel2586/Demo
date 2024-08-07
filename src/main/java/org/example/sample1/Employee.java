package org.example.sample1;

public class Employee {
    private int empId;
    private String empName;
    private String  department;

    public Employee(int empId, String empName, String department) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
