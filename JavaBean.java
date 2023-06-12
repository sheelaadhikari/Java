import java.sql.*;

public class JavaBean {
    private String email;
    private String name;
    private int id;
    private String position;

    // Getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    // Method to retrieve employee information from the database
    public void fetchEmployeeInfo() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish database connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava_2023", "root", "root");

            // Prepare SQL statement
            String sql = "SELECT id, name, position FROM employee WHERE email = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, email);

            // Execute the query
            resultSet = statement.executeQuery();

            // Retrieve the employee information
            if (resultSet.next()) {
                id = resultSet.getInt("id");
                name = resultSet.getString("name");
                position = resultSet.getString("position");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JavaBean bean = new JavaBean();
        bean.setEmail("sheela@gmail.com");
        bean.fetchEmployeeInfo();

        System.out.println("Employee Details:");
        System.out.println("ID: " + bean.getId());
        System.out.println("Name: " + bean.getName());
        System.out.println("Position: " + bean.getPosition());
    }
}
 