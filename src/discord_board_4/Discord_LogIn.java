package discord_board_4;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Discord_LogIn extends JFrame {
	private Image screenImage;
	private Graphics screenGraphic;

	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));

	private Image background = new ImageIcon(Main.class.getResource("../images/introbackground.jpg")).getImage();
	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
	private ImageIcon loginButtonImage = new ImageIcon(Main.class.getResource("../images/loginButton.png"));
	private ImageIcon signupButtonImage = new ImageIcon(Main.class.getResource("../images/signupButton.png"));

	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton loginButton = new JButton(loginButtonImage);
	private JButton signupButton = new JButton(signupButtonImage);

	private Image titleImage;
	private Image selectedImage;
	private int mouseX, mouseY;
	private boolean isMainScreen = false;

    
	public Discord_LogIn() {

		setUndecorated(true);
		setTitle("Discord Board");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 모두 종료시 프로그램도 같이 종료
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);

		exitButton.setBounds(1240, 0, 40, 40);
		exitButton.setBorderPainted(false); // 이줄 없으면 기본 자바 JButton 박스에 이미지 들어감
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});

		add(exitButton);

		loginButton.setBounds(490, 110, 300, 100);
		loginButton.setBorderPainted(false); // 이줄 없으면 기본 자바 JButton 박스에 이미지 들어감
		loginButton.setContentAreaFilled(false);
		loginButton.setFocusPainted(false);
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				loginButton.setIcon(loginButtonImage);
				loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				loginButton.setIcon(loginButtonImage);
				loginButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 로그인 이벤트 팝업창 뜨게 뭐
				MainFrame_Second Login = new MainFrame_Second(); //여기가 프레임 전환 역할
		        Login.setVisible(true);

			}
		});

		add(loginButton);

		signupButton.setBounds(480, 170, 300, 100);
		signupButton.setBorderPainted(false); // 이줄 없으면 기본 자바 JButton 박스에 이미지 들어감
		signupButton.setContentAreaFilled(false);
		signupButton.setFocusPainted(false);
		signupButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				signupButton.setIcon(signupButtonImage);
				signupButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				signupButton.setIcon(signupButtonImage);
				signupButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 로그인 이벤트 팝업창 뜨게 뭐  해야하는데 모르겠음.....



			}
		});

		add(signupButton);

		menuBar.setBounds(0, 0, 1280, 30);
		/*
		 * 아래는 메뉴바를 잡으면 움직이게 할수있드록 처리
		 */
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();

			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});

		add(menuBar);

	}

	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);

	}

	public void screenDraw(Graphics g) {
		g.drawImage(background, 0, 0, null);
		if(isMainScreen)
		{
			g.drawImage(selectedImage, 340, 100, null);
			g.drawImage(titleImage, 340, 70, null);
		}
		paintComponents(g);
		this.repaint();
	}

}
