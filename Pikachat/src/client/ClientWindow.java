package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ClientWindow {

	private JFrame frmPikachat;
	private JTextField messageField;
	private static JTextPane textArea = new JTextPane();
	
	private Client client;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					
					ClientWindow window = new ClientWindow();
					window.frmPikachat.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ClientWindow() {
		
		
		//String name = JOptionPane.showInputDialog("Enter your name");
		
		ClientLogin.main(null);
		//ClientLogin.frame.dispose();
		initialize();
		client = new Client(ClientLogin.loginNickname.getText(), "localhost", 52864);
	}

	private void initialize() {
		frmPikachat = new JFrame();
		frmPikachat.setAlwaysOnTop(true);
		frmPikachat.setResizable(false);
		frmPikachat.setTitle("Pikachat");
		frmPikachat.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Aspire2 Student\\eclipse-workspace\\Pikachat\\images\\pikachu.png"));
		frmPikachat.setBounds(100, 100, 450, 600);
		frmPikachat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane scrollPane = new JScrollPane();
		frmPikachat.getContentPane().add(scrollPane, BorderLayout.CENTER);
		textArea.setEditable(false);
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		textArea.setBackground(new java.awt.Color(255, 255, 204));
		
		
		frmPikachat.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new java.awt.Color(255, 102, 102));
		frmPikachat.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		messageField = new JTextField();
		messageField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					client.send(messageField.getText());
					messageField.setText("");	
				}
			}
		});
		panel.add(messageField);
		messageField.setColumns(40);
		
		JButton btnSendMessage = new JButton("");
		btnSendMessage.setForeground(Color.WHITE);
		btnSendMessage.setBackground(new java.awt.Color(255, 255, 204));
		btnSendMessage.setIcon(new ImageIcon("C:\\Users\\Aspire2 Student\\eclipse-workspace\\Pikachat\\images\\pokeball.png"));
		btnSendMessage.addActionListener(e -> {
			if (!messageField.getText().equals("")) {
			client.send(messageField.getText());
			messageField.setText("");
			}
		});
		panel.add(btnSendMessage);
		
		frmPikachat.setLocationRelativeTo(null);
	}
		
	public static void printToConsole(String message) {
		textArea.setText(textArea.getText() + message + "\n");
	}

}
