import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Registro {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
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
	public Registro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 591, 656);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea txtrInicioDeSesion = new JTextArea();
		txtrInicioDeSesion.setBackground(new Color(128, 128, 128));
		txtrInicioDeSesion.setFont(new Font("Times New Roman", Font.BOLD, 40));
		txtrInicioDeSesion.setText("Inicio de Sesion");
		txtrInicioDeSesion.setBounds(150, 44, 272, 51);
		panel.add(txtrInicioDeSesion);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField.setBounds(150, 160, 272, 35);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		passwordField.setBounds(150, 265, 272, 35);
		panel.add(passwordField);
		
		JTextArea txtrIngreseNombreDe = new JTextArea();
		txtrIngreseNombreDe.setBackground(new Color(128, 128, 128));
		txtrIngreseNombreDe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrIngreseNombreDe.setText("Ingrese Nombre de Usuario");
		txtrIngreseNombreDe.setBounds(147, 126, 275, 40);
		panel.add(txtrIngreseNombreDe);
		
		JTextArea txtrIngresecontrasea = new JTextArea();
		txtrIngresecontrasea.setText("Ingrese Contraseña");
		txtrIngresecontrasea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrIngresecontrasea.setBackground(Color.GRAY);
		txtrIngresecontrasea.setBounds(150, 216, 275, 39);
		panel.add(txtrIngresecontrasea);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(164, 386, 238, 65);
		panel.add(btnNewButton);
	}
}
