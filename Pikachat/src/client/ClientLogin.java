package client;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JTextField;

import server.ClientInfo;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

import javax.swing.JPanel;

public class ClientLogin {

	public static JFrame frame;
	public static JTextField loginNickname;
	private JPasswordField loginPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientLogin window = new ClientLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClientLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 255));
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 330, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("50px"),
				ColumnSpec.decode("50px"),
				ColumnSpec.decode("50px"),
				ColumnSpec.decode("20px"),
				ColumnSpec.decode("50px"),
				ColumnSpec.decode("50px"),
				ColumnSpec.decode("50px"),},
			new RowSpec[] {
				RowSpec.decode("110px"),
				RowSpec.decode("20px"),
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("30px"),
				RowSpec.decode("10px"),
				RowSpec.decode("20px"),
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("30px"),
				RowSpec.decode("20px"),
				RowSpec.decode("30px"),
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),}));
		
		
		ImageIcon background = new ImageIcon("C:\\Users\\Aspire2 Student\\eclipse-workspace\\Pikachat\\images\\Icon.png");
		JLabel label = new JLabel("", background, JLabel.CENTER);
		JPanel panel = new JPanel(new BorderLayout());
		panel.add( label, BorderLayout.CENTER );
		panel.setBackground(Color.BLACK);
		
		frame.getContentPane().add(panel, "1, 1, 7, 1, fill, fill");
		
		
		JLabel lblEnterYourNickname = new JLabel("Enter your nickname:");
		lblEnterYourNickname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYourNickname.setForeground(new Color(10, 20, 255));
		frame.getContentPane().add(lblEnterYourNickname, "2, 2, 4, 1, fill, fill");
		
		loginNickname = new JTextField();
		loginNickname.setFont(new Font("Tahoma", Font.PLAIN, 11));
		loginNickname.setForeground(new Color(0, 0, 255));
		loginNickname.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(loginNickname, "2, 4, 5, 1, fill, fill");
		loginNickname.setColumns(30);
		
		JLabel lblEnterYouPassword = new JLabel("Enter you password:");
		lblEnterYouPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYouPassword.setForeground(new Color(0, 0, 255));
		lblEnterYouPassword.setBackground(new Color(0, 0, 255));
		frame.getContentPane().add(lblEnterYouPassword, "2, 6, 4, 1, fill, top");
		
		loginPassword = new JPasswordField();
		loginPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		loginPassword.setForeground(new Color(106, 90, 255));
		frame.getContentPane().add(loginPassword, "2, 8, 5, 1, fill, fill");
		
		JButton btnRegister = new JButton("Register ");
		btnRegister.setBackground(new Color(106,90,255));
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnRegister.setForeground(new Color(106, 90, 255));
		frame.getContentPane().add(btnRegister, "2, 10, 2, 2, fill, fill");
		
		JButton btnLogOn = new JButton(" Log On  ");
		btnLogOn.setBackground(new Color(106, 90, 255));
		btnLogOn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnLogOn.setForeground(new Color(106, 90, 255));
		btnLogOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try {
					
					ClientInfo.getConnection(loginNickname.getText(), loginPassword.getPassword());
					//frame.dispose();
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}
		});
		frame.getContentPane().add(btnLogOn, "5, 10, 2, 2, fill, fill");
	}

}
