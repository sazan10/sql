package sql;

import java.sql.ResultSet;

import com.mysql.jdbc.Connection;

public class Query {
	public long get(String name, Connection con) throws Exception {
		long start = 0;
		long end = 0;
		try {
			java.sql.PreparedStatement statement = con
					.prepareStatement("SELECT * FROM student WHERE name ='" + name + "'");
			start = System.currentTimeMillis();
			ResultSet result = statement.executeQuery();
			end = System.currentTimeMillis();
			while (result.next()) {
				System.out.println(result.getString("name") + " " + result.getString("last"));
			}

		} catch (Exception e) {
			System.out.println("ERROR");
		}
		return (end - start);
	}
}
