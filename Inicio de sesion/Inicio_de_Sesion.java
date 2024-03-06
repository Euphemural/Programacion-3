import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Inicio_de_Sesion extends JFrame 
{


	public Inicio_de_Sesion() 
    {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Acceso");
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
        this.fondo();
        this.repaint();
        this.validate();
    }

    public void fondo()
    {
        JPanel fondoAzul = new JPanel();
        fondoAzul.setSize(this.getWidth(), this.getHeight());
        fondoAzul.setBackground(Color.decode("#1D3FEC"));
        fondoAzul.setLayout(null);

        JLabel cuenta = new JLabel("Mi cuenta");
        cuenta.setBounds(107,10, 250, 30);
        cuenta.setOpaque(true);
        cuenta.setBackground(Color.decode("#1D3FEC"));
        cuenta.setFont(new Font("Arial", Font.BOLD, 20));
        cuenta.setForeground(Color.BLACK);
        cuenta.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(cuenta);

        JLabel nuevoRegistro = new JLabel("Inscribirse");
        nuevoRegistro.setBounds(170, 405, 130, 50);
        nuevoRegistro.setOpaque(true);
        nuevoRegistro.setBackground(Color.decode("#FFC300"));
        nuevoRegistro.setFont(new Font("Arial", Font.PLAIN, 15));
        nuevoRegistro.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(nuevoRegistro);

        JLabel inicio = new JLabel("Inicio de Sesion");
        inicio.setBounds(109, 75, 250, 50);
        inicio.setOpaque(true);
        inicio.setBackground(Color.decode("#1D7EEC"));
        inicio.setFont(new Font("Arial", Font.BOLD, 20));
        inicio.setForeground(Color.BLACK);
        inicio.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(inicio);

        JLabel textoUsuario = new JLabel("Ingresa tu Usuario");
        textoUsuario.setBounds(130,125, 200, 50);
        textoUsuario.setOpaque(true);
        textoUsuario.setBackground(Color.decode("#1D7EEC"));
        textoUsuario.setFont(new Font("Arial", Font.ITALIC, 20));
        textoUsuario.setForeground(Color.BLACK);
        textoUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(textoUsuario);

        JTextField usuario = new JTextField();
        usuario.setBounds(135, 175, 200, 30);
        usuario.setOpaque(true);
        usuario.setBackground(Color.WHITE);
        usuario.setFont(new Font("Arial", Font.PLAIN, 15));
        usuario.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(usuario);

        JLabel imagenUsuario = new JLabel();
        ImageIcon imgUsuario = new ImageIcon("C:\\Users\\louis\\Documents\\Trabajos\\Programacion-3\\Retrato de inicio de sesion.png");
        Image imagenEscalada_1 = imgUsuario.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon usuarioEscalado = new ImageIcon(imagenEscalada_1);
        imagenUsuario.setIcon(usuarioEscalado);
        imagenUsuario.setBounds(95, 175, 30, 30);
        imagenUsuario.setOpaque(true);
        imagenUsuario.setBackground(Color.decode("#1D7EEC"));
        fondoAzul.add(imagenUsuario);

        JLabel textoContraseña = new JLabel("Ingrese su contraseña");
        textoContraseña.setBounds(135, 225, 200, 50);
        textoContraseña.setOpaque(true);
        textoContraseña.setBackground(Color.decode("#1D7EEC"));
        textoContraseña.setFont(new Font("Arial", Font.ITALIC, 20));
        textoContraseña.setForeground(Color.BLACK);
        textoContraseña.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(textoContraseña);

        JPasswordField contraseña = new JPasswordField();
        contraseña.setBounds(135, 275, 200, 30);
        contraseña.setOpaque(true);
        contraseña.setBackground(Color.WHITE);
        contraseña.setFont(new Font("Arial", Font.PLAIN, 15));
        contraseña.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(contraseña);

        JLabel imagenCandado = new JLabel();
        ImageIcon candado = new ImageIcon("C:\\Users\\louis\\Documents\\Trabajos\\Programacion-3\\Candado de inicio de sesion.png");
        Image imagenEscalada_2 = candado.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon candadoEscalado = new ImageIcon(imagenEscalada_2);
        imagenCandado.setIcon(candadoEscalado);
        imagenCandado.setBounds(95, 275, 30, 30);
        imagenCandado.setOpaque(true);
        imagenCandado.setBackground(Color.decode("#1D7EEC"));
        fondoAzul.add(imagenCandado);

        JLabel acceso = new JLabel("Acceder");
        acceso.setBounds(170, 325, 130, 50);
        acceso.setOpaque(true);
        acceso.setBackground(Color.decode("#FFC300"));
        acceso.setFont(new Font("Arial", Font.PLAIN, 15));
        acceso.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(acceso);

        JLabel textoInscripcion = new JLabel("Sin cuenta? Inscribete aqui!");
        textoInscripcion.setBounds(118, 380, 250, 15);
        textoInscripcion.setOpaque(true);
        textoInscripcion.setBackground(Color.decode("#1D7EEC"));
        textoInscripcion.setFont(new Font("Arial", Font.BOLD, 17));
        textoInscripcion.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(textoInscripcion);

        JLabel fondoAzul2 = new JLabel();
        fondoAzul2.setBounds(50,50,380,350);
        fondoAzul2.setOpaque(true);
        fondoAzul2.setBackground(Color.decode("#1D7EEC"));
        fondoAzul2.setFont(new Font("Arial", Font.BOLD, 18));
        fondoAzul2.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul2.setBorder(BorderFactory.createLineBorder(Color.decode("#4397F5"), 3));
        fondoAzul.add(fondoAzul2);

        this.add(fondoAzul);   
    }    
    public static void main(String[] args){
        new Inicio_de_Sesion();
    }
}
