package discord_board_3;

import java.awt.Color;
import java.awt.Cursor;

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
	
	private int mouseX, mouseY;



	
	public Discord_LogIn() {
		
		setUndecorated(true);
		setTitle("Discord Board");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â ��� ����� ���α׷��� ���� ���� 
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);
		
		exitButton.setBounds(1240, 0, 40, 40);
		exitButton.setBorderPainted(false); // ���� ������ �⺻ �ڹ� JButton �ڽ��� �̹��� ��
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
		loginButton.setBorderPainted(false); // ���� ������ �⺻ �ڹ� JButton �ڽ��� �̹��� ��
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
				// �α��� �̺�Ʈ �˾�â �߰� �� 
				loginButton.setVisible(false);
				signupButton.setVisible(false);
				background = new ImageIcon(Main.class.getResource("../images/mainBackground.png")).getImage();

			}
		});

		add(loginButton);	
		

		signupButton.setBounds(480, 170, 300, 100);
		signupButton.setBorderPainted(false); // ���� ������ �⺻ �ڹ� JButton �ڽ��� �̹��� ��
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
				// �α��� �̺�Ʈ �˾�â �߰� �� 
				loginButton.setVisible(false);
				signupButton.setVisible(false);
				background = new ImageIcon(Main.class.getResource("../images/mainBackground.png")).getImage();

			}
		});

		add(signupButton);	
		
		
		menuBar.setBounds(0, 0, 1280, 30);
		/*
		 * �Ʒ��� �޴��ٸ� ������ �����̰� �Ҽ��ֵ�� ó��
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
				setLocation(x - mouseX, y -mouseY);
			}
		});
		
		add(menuBar);
		

	}
	
	
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage,0,0,null);
		
	}
	public void screenDraw(Graphics g) {
	 g.drawImage(background, 0, 0, null);
	 paintComponents(g);
	 this.repaint();
	}

}
