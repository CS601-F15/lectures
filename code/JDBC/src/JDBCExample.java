import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCExample {

	public static void main(String[] args) throws SQLException {
		String username  = "user01";
		String password  = "potato";
		String db  = "user01";

		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}
		catch (Exception e) {
			System.err.println("Can't find driver");
			System.exit(1);
		}

		// format "jdbc:mysql://[hostname][:port]/[dbname]"
		//note: if connecting through an ssh tunnel make sure to use 127.0.0.1 and
		//also to that the ports are set up correctly
		String urlString = "jdbc:mysql://sql.cs.usfca.edu/"+db;
		Connection con = DriverManager.getConnection(urlString,
				username,
				password);
		
		//create a statement object
		Statement stmt = con.createStatement();
		
		//execute a query, which returns a ResultSet object
		ResultSet result = stmt.executeQuery (
				"SELECT * " + 
				"FROM customers;");

		//iterate over the ResultSet
		while (result.next()) {
			//for each result, get the value of the column name
			String res = result.getString("name");
			System.out.println(res);
		}

		//reuse the statement to insert a new value into the table
		stmt.executeUpdate("INSERT INTO customers (name) VALUES (\"Bob\")");
		System.out.println("***");
		
		//print the updated table
		result = stmt.executeQuery (
				"SELECT * " + 
				"FROM customers;");
		while (result.next()) {
			String res = result.getString("name");
			System.out.println(res);
		}

		con.close();
	}
}

