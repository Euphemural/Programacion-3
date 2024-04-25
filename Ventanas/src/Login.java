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
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Login {
	private JFrame frame;

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
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 384, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea txtrBienvenidoAlLector = new JTextArea();
		txtrBienvenidoAlLector.setText("Bienvenido al lector de datos en .json");
		txtrBienvenidoAlLector.setBounds(10, 81, 331, 49);
		panel.add(txtrBienvenidoAlLector);
		
		//Activacion del boton
		
		JButton btnNewButton = new JButton("Leer");
		btnNewButton.setBounds(10, 215, 331, 49);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent lectura) {
				// TODO Auto-generated method stub
				try {
					ObjectMapper mapper = new ObjectMapper();

		            
					InputStream inputStream = new FileInputStream("C:\\Users\\louis\\Documents\\Ventanas\\src\\user.json"); 
					User users = mapper.readValue(inputStream, User.class);
					System.out.println(users.toString());
		        }
				
		        catch (FileNotFoundException e) {
		        	 
		            // Displaying the exception along with line
		            // number using printStackTrace()
		            e.printStackTrace();
		        }
		 
		        // Catch block 2
		        catch (JsonParseException e) {
		 
		            // Displaying the exception along with line
		            // number using printStackTrace()
		            e.printStackTrace();
		        }
		 
		        // Catch block 3
		        catch (JsonMappingException e) {
		            e.printStackTrace();
		        }
		 
		        // Catch block 4
		        catch (IOException e) {
		            e.printStackTrace();
		        }
			}
			
		});
			
		}
	}



