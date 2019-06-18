package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;

import server.ClientInfo;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.DropMode;
import javax.swing.ImageIcon;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ClientRegister {

	private JFrame frame;
	private JPanel panel;
	private JLabel lblName;
	private JTextField cName;
	private JLabel lblNickname;
	private JTextField cNickname;
	private JLabel lblPassword;
	private JPasswordField cPassword;
	private JButton btnNewButton;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JPanel panel_1;
	private JLabel lblRegisterForm;
	private JLabel lblRegisterForm_1;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientRegister window = new ClientRegister();
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
	public ClientRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100,100,432,351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setForeground(Color.BLUE);
		panel.setBorder(new LineBorder(new Color(0, 0, 255), 5, true));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("80px"),
				FormSpecs.UNRELATED_GAP_COLSPEC,
				ColumnSpec.decode("90px:grow"),
				ColumnSpec.decode("40px"),
				ColumnSpec.decode("30px"),
				ColumnSpec.decode("40px"),},
			new RowSpec[] {
				RowSpec.decode("65px:grow"),
				FormSpecs.LABEL_COMPONENT_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("30px"),
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("30px"),
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("30px"),
				RowSpec.decode("20px"),
				RowSpec.decode("45px"),
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("23px"),}));
		
		label = new JLabel("");
		panel.add(label, "1, 1, left, center");
		
		label_1 = new JLabel("");
		panel.add(label_1, "1, 1, left, center");
		
		label_2 = new JLabel("");
		panel.add(label_2, "1, 1, left, center");
		
		label_3 = new JLabel("");
		panel.add(label_3, "1, 1, left, center");
		
		label_4 = new JLabel("");
		panel.add(label_4, "1, 1, left, center");
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 69, 0));
		panel.add(panel_1, "1, 1, 6, 1, fill, fill");
		
//      	panel_2 = new JPanel();
//        panel_1.add(panel_2);
//		ImageIcon background = new ImageIcon("C:\\Users\\Aspire2 Student\\eclipse-workspace\\Pikachat\\images\\Register.png");
//		JLabel label = new JLabel("", background, JLabel.CENTER);
//		JPanel pane_2 = new JPanel(new BorderLayout());
//		pane_2.add( label, BorderLayout.CENTER );
//		pane_2.setBackground(Color.BLACK);
//		
//	
		
		
		
		
		lblRegisterForm_1 = new JLabel("Register form");
		lblRegisterForm_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisterForm_1.setForeground(Color.WHITE);
		lblRegisterForm_1.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		panel_1.add(lblRegisterForm_1);
		
//		lblRegisterForm = new JLabel("Register Form ");
//		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
//		panel.add(lblRegisterForm,"1, 1, 2, 1, fill, center");
		
		lblName = new JLabel("Name:");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblName, "1, 5, 2, 1, center, center");
		
		cName = new JTextField();
		cName.setForeground(Color.BLACK);
		cName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cName.setColumns(30);
		panel.add(cName, "3, 5, 3, 1, fill, fill");
		
		
	

		
		label_5 = new JLabel("");
		panel.add(label_5, "1, 1, left, center");
		
		label_6 = new JLabel("");
		panel.add(label_6, "1, 1, left, center");
		
		label_7 = new JLabel("");
		panel.add(label_7, "1, 1, left, center");
		
		lblNickname = new JLabel("Nickname:");
		lblNickname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblNickname, "1, 7, 2, 1, center, center");
		
		cNickname = new JTextField();
		cNickname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.add(cNickname, "3, 7, 3, 1, fill, fill");
		cNickname.setColumns(60);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblPassword, "1, 9, 2, 1, center, center");
		
		cPassword = new JPasswordField();
		cPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cPassword.setColumns(30);
		panel.add(cPassword, "3, 9, 3, 1, fill, fill");
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Aspire2 Student\\eclipse-workspace\\Pikachat\\images\\register-button-png-18478 (1).png"));
		btnNewButton.setForeground(new Color(240,240,240));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ClientInfo.getConnection(cName.getText(), cNickname.getText(), cPassword.getPassword());
				frame.dispose();
				ClientLogin.main(null);
				
			}
		});
		panel.add(btnNewButton, "3, 11, fill, fill");
	}

}
