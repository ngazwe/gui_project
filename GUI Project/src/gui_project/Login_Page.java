package gui_project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_Page extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Page frame = new Login_Page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login_Page() {
		setTitle("EMP Management System\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1257, 771);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		
		JLabel picture = new JLabel("");
		picture.setIcon(new ImageIcon("C:\\Users\\acer\\Downloads\\wp3864481-wonder-woman-4k-wallpa (2).jpg"));
		picture.setBounds(583, 0, 658, 732);
		contentPane.add(picture);
		
		JLabel welcome = new JLabel("Welcome Back !");
		welcome.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		welcome.setBounds(171, 100, 234, 56);
		contentPane.add(welcome);
		
		JLabel usernametext = new JLabel("Username :");
		usernametext.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		usernametext.setBounds(56, 265, 128, 28);
		contentPane.add(usernametext);
		
		
		usernameField = new JTextField();
		usernameField.setBounds(214, 269, 206, 28);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel passwordText = new JLabel("Password :");
		passwordText.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		passwordText.setBounds(56, 363, 128, 28);
		contentPane.add(passwordText);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(214, 367, 206, 28);
		contentPane.add(passwordField);
		
		final JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = passwordField.getText();
				JButton src = (JButton) e.getSource();
				
					if(username.equals("zhz123") && password.equals("zhz123")){
				
						JOptionPane.showMessageDialog(contentPane,"Login Successful!" );	
						MenuPage menu = new MenuPage();
						dispose();
						menu.run();
						
		             }
					else {
						JOptionPane.showMessageDialog(contentPane, "Invalid Username or Passowrd :)");
					}
				}
				
			
		});
		loginButton.setFont(new Font("Script MT Bold", Font.BOLD, 20));
		loginButton.setBounds(232, 537, 89, 38);
		contentPane.add(loginButton);
		loginButton.setFocusPainted(false);
	}
}
