package BTVN;

public class dev extends Employee {
    public static void main(String[] args) {
        dev dev = new dev();

        dev.setEmployeeId(1);
        dev.setEmployeeName("TuanBA");
        dev.setEmployee_saraly(1000000);

        System.out.println("ID: " + dev.getEmployeeId());
        System.out.println("Name: " + dev.getEmployeeName());
        System.out.println("Salary(VND): " +dev.getEmployee_saraly());
    }
}
