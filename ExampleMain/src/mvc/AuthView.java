package mvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AuthView {
	
	JPanel panel;
	JFrame frame;
	AuthModel modelo;
	
	public AuthView() {
		panel = new JPanel();
		panel.setBackground(Color.red);
		
	}
	
	public JPanel Login() 
	{		
		//Dise�o del login
		
        JLabel lblNewLabel = new JLabel("Bienvenido");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
        lblNewLabel.setBounds(104, 59, 178, 42);
        panel.add(lblNewLabel);
        
        JTextField textField = new JTextField();
        textField.setBounds(71, 154, 273, 34);
        panel.add(textField);
        textField.setColumns(10);
        
        JTextField textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(71, 226, 273, 34);
        panel.add(textField_1);
        
        JLabel lblNewLabel_1 = new JLabel("Correo electr�nico");
        lblNewLabel_1.setBounds(71, 137, 136, 16);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Contrase�a");
        lblNewLabel_1_1.setBounds(71, 212, 136, 16);
        panel.add(lblNewLabel_1_1);
        
        JButton btnNewButton = new JButton("Acceder");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		System.out.println(textField.getText());
        		System.out.println(textField_1.getText());

        		
        		if(modelo.Login(textField.getText(), textField_1.getText()))
        		{
        			///
            		System.out.println("Bienvenido");
        		}
        		else
        		{
        			///
            		System.out.println("Datos incorrectos.");
        		}
        		
        	}
        });
        btnNewButton.setBounds(71, 300, 267, 41);
        panel.add(btnNewButton);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("�Olvid� su contrase�a?");
        lblNewLabel_1_1_1_1.setBounds(71, 341, 273, 16);
        panel.add(lblNewLabel_1_1_1_1);
        
        JButton btnNewButton_1 = new JButton("�A�n no tienes cuenta?");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		frame.remove(panel);
        		frame.revalidate();
        		frame.repaint(); 
        		
        	}
        });
        btnNewButton_1.setBounds(71, 384, 267, 29);
        panel.add(btnNewButton_1);
        
        return panel;
	}
	
	
	public JPanel Registro() {
		
		//Dise�o del registro
		
		panel.setBackground(Color.pink);
		return panel;
	}

}
