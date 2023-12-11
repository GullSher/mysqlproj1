package mysqlproj1;

//import java.sql.Connection;

//import java.sql.DriverManager;
//import java.sql.SQLException;
// import java.sql.Connection; is not being accessable in project.

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// The newInstance() call is a work around for some
			// broken Java implementations

//			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception ex) {
			// handle the error
		}

	}

}
//----------

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!
