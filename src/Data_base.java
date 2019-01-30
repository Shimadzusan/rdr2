	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Date;

	public class Data_base {
		public static Connection conn;
		public static Statement statmt;
		public static ResultSet resSet;
		//public  static String s = "INSERT INTO 'users' ('time', 'syria', 'russia', 'usa') VALUES ('12:48','Masha', 'Pascha', 'Jok'); ";
		 private static final String SQL = "DELETE FROM users WHERE id = \"3\"";
		
		// --------Connect to data_base--------
		public static void Conn() throws ClassNotFoundException, SQLException 
		   {
			   conn = null;
			   
			   Class.forName("org.sqlite.JDBC");
			   conn = DriverManager.getConnection("jdbc:sqlite:rdr2_data_base.s3db", "root", "123"); //...
			      
			   System.out.println("connect to rdr2_data_base ...complete");
		   }
		
		public static void CreateDB() throws ClassNotFoundException, SQLException
		   {
			//conn.
			
			statmt = conn.createStatement();
			statmt.execute("CREATE TABLE if not exists 'users' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'time' text, 'Moscow Java' text, 'Moscow C++' text, 'Moscow C#' text, 'Moscow Swift' text,  'Moscow Python' text, 'Moscow PHP' text, 'Moscow J_junior' text," + 
			"'Petersburg Java' text, 'Petersburg C++' text, 'Petersburg C#' text, 'Petersburg Swift' text,  'Petersburg Python' text, 'Petersburg PHP' text, 'Petersburg J_junior' text," + 
			"'Minsk Java' text, 'Minsk C++' text, 'Minsk C#' text, 'Minsk Swift' text,  'Minsk Python' text, 'Minsk PHP' text, 'Minsk J_junior' text, 'Moscow r_Java' text, 'Moscow r_C++' text, 'Moscow r_C#' text, 'Moscow r_Swift' text,  'Moscow r_Python' text, 'Moscow r_PHP' text, 'Moscow r_J_junior' text," + 
			"'Petersburg r_Java' text, 'Petersburg r_C++' text, 'Petersburg r_C#' text, 'Petersburg r_Swift' text,  'Petersburg r_Python' text, 'Petersburg r_PHP' text, 'Petersburg r_J_junior' text," + 
			"'Minsk r_Java' text, 'Minsk r_C++' text, 'Minsk r_C#' text, 'Minsk r_Swift' text,  'Minsk r_Python' text, 'Minsk r_PHP' text, 'Minsk r_J_junior' text);");
			
		   }
		
		public static void WriteDB(String[] v, String[] r) throws SQLException {

			Date date = new Date();
			int hours = date.getHours();
			int min = date.getMinutes();
			
			int day = date.getDate();
			int month = date.getMonth();
			String moon = "";
			
			switch(month){
			case 0: moon = "January"; break;
			case 1: moon = "February"; break;
			case 2: moon = "March"; break;
			case 3: moon = "April"; break;
			case 4: moon = "May"; break;
			case 5: moon = "June"; break;
			case 6: moon = "July"; break;
			case 7: moon = "August"; break;
			case 8: moon = "September"; break;
			case 9: moon = "October"; break;
			case 10: moon = "November"; break;
			case 11: moon = "December"; break;
			}
			//String data_time = hours + ":"+ min;
			String data_time = day + " "+ moon;
			
			
			String s = "INSERT INTO 'users' ('time', 'Moscow Java', 'Moscow C++', 'Moscow C#', 'Moscow Swift', 'Moscow Python', 'Moscow PHP', 'Moscow J_junior', " + 
			"'Petersburg Java', 'Petersburg C++', 'Petersburg C#', 'Petersburg Swift', 'Petersburg Python', 'Petersburg PHP', 'Petersburg J_junior', 'Minsk Java', 'Minsk C++', 'Minsk C#', 'Minsk Swift', 'Minsk Python', 'Minsk PHP', 'Minsk J_junior', 'Moscow r_Java', 'Moscow r_C++', 'Moscow r_C#', 'Moscow r_Swift', 'Moscow r_Python', 'Moscow r_PHP', 'Moscow r_J_junior', " + 
			"'Petersburg r_Java', 'Petersburg r_C++', 'Petersburg r_C#', 'Petersburg r_Swift', 'Petersburg r_Python', 'Petersburg r_PHP', 'Petersburg r_J_junior', 'Minsk r_Java', 'Minsk r_C++', 'Minsk r_C#', 'Minsk r_Swift', 'Minsk r_Python', 'Minsk r_PHP', 'Minsk r_J_junior')" + 
			" VALUES ('" + data_time + "','" + v[7] + "', '" + v[8] + "', '" + v[9] + "', '" + v[10] + "', '" + v[11] + "', '" + v[12] + "', '" + v[13] +
			"','" + v[14] + "', '" + v[15] + "', '" + v[16] + "', '" + v[17] + "', '" + v[18] + "', '" + v[19] + "', '" + v[20] +
			"','" + r[0] + "', '" + r[1] + "', '" + r[2] + "', '" + r[3] + "', '" + r[4] + "', '" + r[5] + "', '" + r[6] +
			"','" + r[7] + "', '" + r[8] + "', '" + r[9] + "', '" + r[10] + "', '" + r[11] + "', '" + r[12] + "', '" + r[13] +
			"','" + r[14] + "', '" + r[15] + "', '" + r[16] + "', '" + r[17] + "', '" + r[18] + "', '" + r[19] + "', '" + r[20] +
			"','" + r[0] + "', '" + r[1] + "', '" + r[2] + "', '" + r[3] + "', '" + r[4] + "', '" + r[5] + "', '" + r[6] +
			"'); ";
			
			   statmt.execute(s);
//			  
			   System.out.println("writing to rdr2_data_base ...complete");
		}
		
			public static void CloseDB() throws ClassNotFoundException, SQLException
			   {
				conn.close();
				statmt.close();
				resSet.close();
				
				System.out.println("js2_data_base is closed");
			   }

	}
