package discord_board_4;


public class Main {
	public static final int SCREEN_WIDTH = 1280; //���� FIANL �� ������ �ʴ� ����
	public static final int SCREEN_HEIGHT = 720; //���� 
	
	public static void main(String[] args) {
		DBConnection connection = new DBConnection();
		System.out.println("������ ���� : " + connection.isAdmin("admin", "admin"));
		new Discord_LogIn();
	}

	

}
