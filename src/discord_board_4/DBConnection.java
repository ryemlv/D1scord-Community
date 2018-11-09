package discord_board_4;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DBConnection {

	private Connection con;
	private Statement st;
	private ResultSet rs;

	public DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/tutorial", "root", "1234");
			st = con.createStatement();

		} catch (Exception e) {
			System.out.println("데이터 베이스 연결 오류" + e.getMessage());
		}
	}

	public boolean isAdmin(String adminID, String adminPassword) {
		try {
			String SQL = "SELECT *  FROM ADMIN WHERE adminID ='" + adminID + "'and adminPassword ='" + adminPassword
					+ "'";
			rs = st.executeQuery(SQL);
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 검색 오류 : " + e.getMessage());
		}
		return false;
	}
}
