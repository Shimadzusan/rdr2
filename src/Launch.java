import java.sql.SQLException;

public class Launch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("..rdr2");
		long start_time = System.nanoTime();
		long start_time2 = System.currentTimeMillis();
			new Alpha();
			System.out.println();
				System.out.println("run time: " + (System.nanoTime() - start_time) + " nano-s.");
				System.out.println("run time: " + (System.currentTimeMillis() - start_time2) + " mili-s.");

	}

}
