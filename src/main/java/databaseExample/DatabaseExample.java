import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

//using 'connection', 'statement', and 'Result' classes in java.sql.package;

public class DatabaseExample {  //save as "DatabaseExample.java"
Run|Debug
public static void main(String[] args){
try{
//step 1: construct a database 'Connnection' object callesd 'conn'
Connection conn = DriverManager.getConnection("jdbc:mysql:\\localhost:3306/school_db","myuser", "Generaloben@111"); // Mysql connection string
//with login credentials
//The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

//step 2: Construct a 'statement' object called 'stmt' from the Connection created
Statement stmt = com.createStatement();

//step 3: Write SqL query string. Execute the SQL query via the 'Statement'.
//The query result is returned in a 'ResultSet' object 'rset'.
String sqlStatement = "SELECT * FROM student";
System.out.println("The SQL statement is: "+ sqlStatement + "\n"); //Print it for debugging

ResultSet resultSet = stmt .executeQuery(sqlStatement);

// step 4: Process the 'resultSet' by scrolling the cursor forward via next().
// For each row, retrieve the contents of the cells with getting(columnNames).
// rset.next() inside the whole-loop repeatedly moves the cursor to the next row.
// It returns false if no more rows.

while(resultSet.next()) {//repeatedly process each row
String firstName = resultSet.getString("first_name"); // retrieve a 'String'-cell in the row
String email = resultSet.getString("email"); // retrieve a 'String'-cell in the row
int age = resultSet.getInt("age"); // retrieve an 'int'-cell in the row
}



}catch(SQLException ex){
System.out.println(ex);
}

}

}


