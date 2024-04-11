import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Login {

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
					Login window = new Login();
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
	public Login() {
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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 575, 22);
		panel.add(menuBar);
		
		//Cuenta
		
		JMenu Account = new JMenu("Cuenta");
		menuBar.add(Account);
		
		JMenuItem login = new JMenuItem("Login");
		Account.add(login);
		
		JMenuItem registro = new JMenuItem("Registro");
		Account.add(registro);
		
		registro.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	frame.getContentPane().removeAll();
		    	frame.getContentPane().revalidate();
		    	frame.getContentPane().repaint();
		    }
		});
		
		JMenuItem recuperacion = new JMenuItem("Recuperaci\u00F3n de cuenta");
		Account.add(recuperacion);


		//Usuario
		
		JMenu user = new JMenu("Usuario");
		menuBar.add(user);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Alta");
		user.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Baja");
		user.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Consultar");
		user.add(mntmNewMenuItem_8);
		
		//Ayuda
		
		JMenu Help = new JMenu("Ayuda");
		menuBar.add(Help);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u00BFC\u00F3mo crear un usuario?");
		Help.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u00BFC\u00F3mo acceder al sistema?");
		Help.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u00BFQu\u00E9 pasa si olvid\u00E9 mi contrase\u00F1a?");
		Help.add(mntmNewMenuItem_2);
	}
}