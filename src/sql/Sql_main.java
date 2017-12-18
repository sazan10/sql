package sql;

import java.util.Scanner;

import com.mysql.jdbc.Connection;

public class Sql_main {
	protected static Connection con;
	protected static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		
		Menu m = new Menu();
		Query q = new Query();
		System.out.println("Enter database username");
		String username= scan.nextLine();
		System.out.println("Enter database password");
		String password= scan.nextLine();
		Connector connect = new Connector(username,password);
		while (true) {
			con = connect.getconnection();
			switch (m.menu()) {
			case "1":
				String s1 = m.menu2();
				System.out.println("\nThe time taken is " + q.get(s1, con) + "ms\n");
				break;
			case "2":

				String s2 = m.menu2();
				java.sql.PreparedStatement st = con.prepareStatement("CREATE INDEX index_name ON student(name)");
				st.execute();
				long time = q.get(s2, con);
				java.sql.PreparedStatement statement3 = con
						.prepareStatement("ALTER TABLE student DROP INDEX index_name");
				statement3.execute();
				System.out.println("The time taken is " + time + "ms\n");
				break;
			default:
				break;

			}
			con.close();
		}
	}

}
