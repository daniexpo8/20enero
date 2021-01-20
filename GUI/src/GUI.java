import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordField;
	private static JButton loginButton;
	private static JLabel success;
	//RATA
	//hola
	public static void main(String[] args) {
		
		JPanel panel=new JPanel();
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel=new JLabel("User");
		userLabel.setBounds(10,20,80,25);
		panel.add(userLabel);
		
		userText=new JTextField(20);
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		
		passwordLabel=new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		
		passwordField=new JPasswordField();
		passwordField.setBounds(100,50,165,25);
		panel.add(passwordField);
		
		loginButton=new JButton("Login");
		loginButton.setBounds(10,90,80,25);
		loginButton.addActionListener(new GUI());
		panel.add(loginButton);
		
		success=new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
		
		frame.setVisible(true);
		
		
	}


	public void actionPerformed(ActionEvent e) {
	
		String user=userText.getText();
		String password= passwordField.getText();
		
		if (user.equals("Dani")&& password.equals("ratucha")) {
			
			success.setText("Login succesfull");
		}
		
	}

}
