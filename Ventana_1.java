import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Ventana_1 extends JFrame 
{
	public Ventana_1() 
    {
        this.setVisible(true);
        this.setSize(1000, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Mi ventana");
        this.setMinimumSize(new Dimension(250,250));
        this.setMaximumSize(new Dimension(1000,750));
        this.setResizable(true);
        this.setLocation(200,200);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.iniciarComponentes();
    }
	
	public void iniciarComponentes() 
	{
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.gray);
		login.setLayout(null);
		
		JLabel login_tag = new JLabel("Acceder");
		login_tag.setSize(310, 80);
		login_tag.setLocation(85, 20);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.red);
        login_tag.setHorizontalAlignment(SwingConstants.CENTER);
        login_tag.setFont(new Font("Birds of Paradise", Font.ITALIC, 45));
        login_tag.setForeground(Color.WHITE);
		login.add(login_tag);

        JLabel usuario = new JLabel("Usuario");
        usuario.setSize(150, 30);
        usuario.setLocation(20, 120);
        usuario.setOpaque(true);
        usuario.setBackground(Color.gray);
        usuario.setFont(new Font("Brids of Paradise", Font.ITALIC + Font.BOLD, 18));
        login.add(usuario);

        JTextField user = new JTextField();
        user.setSize(100, 30);
        user.setLocation(20, 150);
        user.setOpaque(true);
        user.setBackground(Color.WHITE);
        login.add(user);

        JLabel contraseña = new JLabel("contraseña");
        contraseña.setSize(150, 30);
        contraseña.setLocation(20, 250);
        contraseña.setOpaque(true);
        contraseña.setBackground(Color.gray);
        contraseña.setFont(new Font("Brids of Paradise", Font.ITALIC + Font.BOLD, 18));
        login.add(contraseña);

        JPasswordField password = new JPasswordField();
        password.setSize(100, 30);
        password.setLocation(20, 290);
        password.setOpaque(true);
        password.setBackground(Color.WHITE);
        login.add(password);

        JButton recordar = new JButton();
        recordar.setSize(20,20);
        recordar.setLocation(20, 400);
        recordar.setOpaque(true);
        recordar.setBackground(Color.white);
        login.add(recordar);

        JLabel recordar_usuario = new JLabel("Recordarme");
        recordar_usuario.setSize(150, 30);
        recordar_usuario.setLocation(50, 395);
        recordar_usuario.setOpaque(true);
        recordar_usuario.setBackground(Color.gray);
        recordar_usuario.setFont(new Font("Brids of Paradise", Font.ITALIC + Font.BOLD, 14));
        login.add(recordar_usuario);

        JLabel contraseña_olvidada = new JLabel("¿Olvidastes tu contraseña?");
        contraseña_olvidada.setSize(300, 30);
        contraseña_olvidada.setLocation(285, 395);
        contraseña_olvidada.setOpaque(true);
        contraseña_olvidada.setBackground(Color.gray);
        contraseña_olvidada.setFont(new Font("Brids of Paradise", Font.ITALIC + Font.BOLD, 14));
        login.add(contraseña_olvidada);

        JButton ingresar = new JButton("Ingresar");
        ingresar.setSize(150, 50);
        ingresar.setLocation(20,500);
        ingresar.setOpaque(true);
        ingresar.setBackground(Color.WHITE);
        ingresar.setFont(new Font("Brids of Paradise", Font.ITALIC + Font.BOLD, 18));
        login.add(ingresar);


		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setBackground(Color.green);
        registro.setLayout(null);

		this.add(login);
		this.add(registro);
	}

    public static void main(String[] args) {
        new Ventana_1();
    }
}