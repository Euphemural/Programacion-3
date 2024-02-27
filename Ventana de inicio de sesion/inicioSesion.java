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
        this.setTitle("Calculadora");
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
        fondoAzul.setBackground(Color.decode("#E2E5E6"));
        fondoAzul.setLayout(null);

        JLabel dondoAzul2 = new JLabel();
        dondoAzul2.setBounds(10,10,380,50);
        dondoAzul2.setOpaque(true);
        dondoAzul2.setBackground(Color.WHITE);
        dondoAzul2.setFont(new Font("Arial", Font.BOLD, 18));
        dondoAzul2.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(dondoAzul2);

        JLabel textoUsuario = new JLabel("Ingresa tu Usuario");
        textoUsuario.setBounds(0,0, 50, 50);
        textoUsuario.setOpaque(true);
        textoUsuario.setBackground(Color.WHITE);
        textoUsuario.setFont(new Font("Arial", Font.ITALIC, 20));
        fondoAzul.add(textoUsuario);
        

        JTextField usuario = new JTextField();
        usuario.setBounds(0,0, 100, 50);
        usuario.setOpaque(true);
        usuario.setBackground(Color.WHITE);
        usuario.setFont(new Font("Arial", Font.PLAIN, 14));
        usuario.setHorizontalAlignment(SwingConstants.CENTER);
        fondoAzul.add(usuario);

        this.add(fondoAzul);   
    }    
    public static void main(String[] args) 
    {
        new inicioSesion();
    }
}

