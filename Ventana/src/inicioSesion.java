import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class inicioSesion extends JFrame 
{


	public inicioSesion() 
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

        JLabel inicio = new JLabel("Inicio de Sesion");
        inicio.setBounds(160, 8, 150, 50);
        inicio.setFont(new Font("Arial", Font.BOLD, 20));
        inicio.setForeground(Color.BLACK);
        fondoAzul.add(inicio);

        JLabel textoUsuario = new JLabel("Ingresa tu Usuario");
        textoUsuario.setBounds(130,150, 200, 50);
        textoUsuario.setOpaque(true);
        textoUsuario.setBackground(Color.decode("#1D7EEC"));
        textoUsuario.setFont(new Font("Arial", Font.ITALIC, 20));
        textoUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(textoUsuario);

        JTextField usuario = new JTextField();
        usuario.setBounds(130, 200, 200, 30);
        usuario.setOpaque(true);
        usuario.setBackground(Color.WHITE);
        usuario.setFont(new Font("Arial", Font.PLAIN, 15));
        usuario.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(usuario);

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
    public static void main(String[] args) throws Exception {
        new inicioSesion();
    }
}
