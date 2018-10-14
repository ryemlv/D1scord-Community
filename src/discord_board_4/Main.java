package discord_board_4;


public class Main {
	public static final int SCREEN_WIDTH = 1280; //넓이 FIANL 은 변하지 않는 변수
	public static final int SCREEN_HEIGHT = 720; //높이 
	
	public static void main(String[] args) {
		DBConnection connection = new DBConnection();
		System.out.println("관리자 여부 : " + connection.isAdmin("admin", "admin"));
		new Discord_LogIn();
	}

	

}
