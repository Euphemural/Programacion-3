import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Registro{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		frame.setBounds(100, 100, 590, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(148, 0, 211));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea txtrRegistrarse = new JTextArea();
		txtrRegistrarse.setFont(new Font("Times New Roman", Font.BOLD, 40));
		txtrRegistrarse.setBackground(new Color(148, 0, 211));
		txtrRegistrarse.setForeground(new Color(238, 232, 170));
		txtrRegistrarse.setText("Registrarse");
		txtrRegistrarse.setBounds(187, 24, 212, 59);
		panel.add(txtrRegistrarse);
		
		textField = new JTextField();
		textField.setBounds(67, 125, 194, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(311, 125, 217, 38);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(131, 216, 307, 38);
		panel.add(textField_2);
		
		JTextArea txtrNombre = new JTextArea();
		txtrNombre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrNombre.setForeground(new Color(255, 255, 255));
		txtrNombre.setBackground(new Color(148, 0, 211));
		txtrNombre.setText("Nombre");
		txtrNombre.setBounds(67, 93, 150, 22);
		panel.add(txtrNombre);
		
		JTextArea txtrApellido = new JTextArea();
		txtrApellido.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrApellido.setForeground(new Color(255, 255, 255));
		txtrApellido.setBackground(new Color(148, 0, 211));
		txtrApellido.setText("Apellido");
		txtrApellido.setBounds(311, 93, 150, 22);
		panel.add(txtrApellido);
		
		JTextArea txtrCorreoElectronico = new JTextArea();
		txtrCorreoElectronico.setText("Correo Electronico");
		txtrCorreoElectronico.setForeground(Color.WHITE);
		txtrCorreoElectronico.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrCorreoElectronico.setBackground(new Color(148, 0, 211));
		txtrCorreoElectronico.setBounds(131, 184, 307, 22);
		panel.add(txtrCorreoElectronico);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(131, 309, 307, 38);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(131, 408, 307, 38);
		panel.add(textField_4);
		
		JTextArea txtrContrasea = new JTextArea();
		txtrContrasea.setText("Contraseña");
		txtrContrasea.setForeground(Color.WHITE);
		txtrContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrContrasea.setBackground(new Color(148, 0, 211));
		txtrContrasea.setBounds(131, 275, 307, 22);
		panel.add(txtrContrasea);
		
		JTextArea txtrConfirmarContrasea = new JTextArea();
		txtrConfirmarContrasea.setText("Confirmar Contraseña");
		txtrConfirmarContrasea.setForeground(Color.WHITE);
		txtrConfirmarContrasea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrConfirmarContrasea.setBackground(new Color(148, 0, 211));
		txtrConfirmarContrasea.setBounds(131, 376, 307, 22);
		panel.add(txtrConfirmarContrasea);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(175, 546, 251, 38);
		panel.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Acepto los terminos y condiciones. Vendo mi cuerpo y alma a la empresa.");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(148, 0, 211));
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		rdbtnNewRadioButton.setBounds(30, 478, 539, 38);
		panel.add(rdbtnNewRadioButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 575, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cuenta");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Login");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Registro");
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Recuperaci\u00F3n de cuenta");
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_1 = new JMenu("Usuario");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Alta");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Baja");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Consultar");
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u00BFC\u00F3mo crear un usuario?");
		mnNewMenu_2.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u00BFC\u00F3mo acceder al sistema?");
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u00BFQu\u00E9 pasa si olvid\u00E9 mi contrase\u00F1a?");
		mnNewMenu_2.add(mntmNewMenuItem_2);
	}
}