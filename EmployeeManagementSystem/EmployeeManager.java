import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employee = new ArrayList<>();
    private int nextId = 1;

    //CREATE
    public void addEmployee(String name, String department, double salary) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Name Cannot be Empty.");
        }
        if (salary<0) {
            System.out.println("Error: Salary cannot be Negative.");
            return;
        }
        Employee emp = new Employee(nextId++, name.trim(), department.trim(), salary);
        employee.add(emp);
        System.out.println("Employee added Successfully with ID :" + emp.getId());
    }

    //READ ALL
    public void viewAllEmployee() {
        if (employee.isEmpty()) {
            System.out.println("No Employee Found.");
            return;
        }
        System.out.println("+-------+----------------------+-----------------+------------+");
        System.out.println("| ID    | Name                 | Department      | Salary     |");
        System.out.println("+-------+----------------------+-----------------+------------+");
        for (Employee emp : employee) {
            System.out.println(emp);
        }
        System.out.println("+-------+----------------------+-----------------+------------+");
    }

    //READ BY ID
    public  Employee findById(int id) {
        for (Employee emp :employee ) {
            if (emp.getId() == id ) return emp;
        }
        return null;
    }

    //UPDATE
    public void updateEmployee(int id, String newName, String newDepartment, double newSalary) {
        Employee emp = findById(id);
        if (emp == null) {
            System.out.println("Error: Employee With ID : " + id + "not Found");
            return;
        }
        if (!newName.trim().isEmpty()) emp.setName(newName.trim());
        if (!newDepartment.trim().isEmpty()) emp.setDepartment(newDepartment.trim());
        if (newSalary >=0) emp.setSalary(newSalary);
        System.out.println("Employee Update Successfully");
    }

    //DELETE
    public void deleteEmployee(int id) {
        Employee emp =findById(id);
        if (emp == null) {
            System.out.println("Error: Employee with ID" + id + "not found.");
            return;
        }
        employee.remove(emp);
        System.out.println("Employee with Id :" + id+ "delete Successfully.");
    }

    public int getTotalEmployees() {
        return employee.size();
    }
}