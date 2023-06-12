// Model
class Employee {
    private int id;
    private String name;
    private String position;

    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

// View
class EmployeeView {
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Details:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Position: " + employee.getPosition());
    }
}

// Controller
class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeePosition(String position) {
        model.setPosition(position);
    }

    public void updateView() {
        view.displayEmployeeDetails(model);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Sheela Adhikari", "Student");

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(employee, view);

        controller.updateView();

        controller.setEmployeeName("Binod Thapa");
        controller.setEmployeePosition("Teacher");

        controller.updateView();
    }
}
