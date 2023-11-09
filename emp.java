package BTVN;

public class Employee {
    private int employee_id;
    private String employee_name;
    private int employee_saraly;

    public void Employee(int employee_id, String employee_name, int employee_saraly) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_saraly = employee_saraly;
    }

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }
    public int getEmployee_saraly(){
        return employee_saraly;
    }
    public void setEmployee_saraly(int employee_saraly){
        this.employee_saraly = employee_saraly;
    }

}
