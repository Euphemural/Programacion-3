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
        this.setTitle("Calculadora");
        this.setMinimumSize(new Dimension(250,250));
        this.setMaximumSize(new Dimension(1000,750));
        this.setResizable(true);
        this.setLocation(200,200);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.iniciarComponentes();
    }
	
    public void iniciarComponentes() {
        
        this.fondoCalculadora();

    }

    public void fondoCalculadora()
    {
        JPanel fondoCalculadora = new JPanel();
        fondoCalculadora.setSize(this.getWidth()/2, this.getHeight());
        fondoCalculadora.setBackground(Color.BLACK);
        fondoCalculadora.setLayout(null);

        JButton boton_suma = new JButton("+");
        boton_suma.setBounds(10, 50, 50, 30);
        boton_suma.setOpaque(true);
        boton_suma.setBackground(Color.WHITE);
        boton_suma.setForeground(Color.BLACK);
        boton_suma.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_suma);

        this.add(fondoCalculadora);

    }
    


    public static void main(String[] args) {
        new Ventana_1();
    }
}