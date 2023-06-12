import java.sql.*;

public class InsertEmpInfo {
   public static void main(String[] args) {
      String url = "jdbc:mysql://localhost:3306/employee";
      String username = "root";
      String password = " ";
      String query = "INSERT INTO deets (name, email, address) VALUES (?, ?, ?)";
      try {
         Connection connection = DriverManager.getConnection(url, username, password);
         PreparedStatement statement = connection.prepareStatement(query);
         statement.setString(1, "Millie ");
         statement.setString(2, "mil@email.com");
         statement.setString(3, "123 Main St, Miami USA");
         int rowsInserted = statement.executeUpdate();
         if (rowsInserted > 0) {
            System.out.println("Employee information inserted successfully!");
         }
         statement.close();
         connection.close();
      } catch (SQLException e) {
         System.err.println("Error inserting employee information: " + e.getMessage());
      }
   }
}
