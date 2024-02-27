import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class Ventana_1 extends JFrame 
{


	public Ventana_1() 
    {
        this.setVisible(true);
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculadora");
        this.setMinimumSize(new Dimension(250,250));
        this.setMaximumSize(new Dimension(1000,750));
        this.setResizable(false);
        this.setLocation(200,200);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.iniciarComponentes();
    }
	
    public void iniciarComponentes() {
        
        this.fondoCalculadora();
        this.repaint();
        this.validate();

    }

    public void fondoCalculadora()
    {
        JPanel fondoCalculadora = new JPanel();
        fondoCalculadora.setSize(this.getWidth(), this.getHeight());
        fondoCalculadora.setBackground(Color.decode("#B3B6B7"));
        fondoCalculadora.setLayout(null);

        JTextField ventanaNumeros = new JTextField();
        ventanaNumeros.setBounds(10,50,461,50);
        ventanaNumeros.setOpaque(true);
        ventanaNumeros.setBackground(Color.WHITE);
        ventanaNumeros.setHorizontalAlignment(SwingConstants.CENTER);
        fondoCalculadora.add(ventanaNumeros);

        //Primera Linea

        JButton boton_xy = new JButton("x^y");
        boton_xy.setBounds(10, 150, 60, 30);
        boton_xy.setOpaque(true);
        boton_xy.setBackground(Color.WHITE);
        boton_xy.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_xy.setForeground(Color.BLACK);
        boton_xy.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_xy);

        JButton boton_raizCuadrada = new JButton("√");
        boton_raizCuadrada.setBounds(10, 200, 60, 30);
        boton_raizCuadrada.setOpaque(true);
        boton_raizCuadrada.setBackground(Color.WHITE);
        boton_raizCuadrada.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_raizCuadrada.setForeground(Color.BLACK);
        boton_raizCuadrada.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_raizCuadrada);

        JButton boton_signoExclamacion = new JButton("!");
        boton_signoExclamacion.setBounds(10, 250, 60, 30);
        boton_signoExclamacion.setOpaque(true);
        boton_signoExclamacion.setBackground(Color.WHITE);
        boton_signoExclamacion.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_signoExclamacion.setForeground(Color.BLACK);
        boton_signoExclamacion.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_signoExclamacion);

        JButton boton_unoEntrex = new JButton("1/x");
        boton_unoEntrex.setBounds(10, 300, 60, 30);
        boton_unoEntrex.setOpaque(true);
        boton_unoEntrex.setBackground(Color.WHITE);
        boton_unoEntrex.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_unoEntrex.setForeground(Color.BLACK);
        boton_unoEntrex.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_unoEntrex);

        JButton boton_Pi = new JButton("π");
        boton_Pi.setBounds(10, 350, 60, 30);
        boton_Pi.setOpaque(true);
        boton_Pi.setBackground(Color.WHITE);
        boton_Pi.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_Pi.setForeground(Color.BLACK);
        boton_Pi.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_Pi);

        JButton boton_blanco = new JButton();
        boton_blanco.setBounds(10, 400, 60, 30);
        boton_blanco.setOpaque(true);
        boton_blanco.setBackground(Color.WHITE);
        boton_blanco.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_blanco.setForeground(Color.BLACK);
        boton_blanco.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_blanco);

        //Segunda Linea

        JButton boton_lg = new JButton("lg");
        boton_lg.setBounds(110, 150, 60, 30);
        boton_lg.setOpaque(true);
        boton_lg.setBackground(Color.WHITE);
        boton_lg.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_lg.setForeground(Color.BLACK);
        boton_lg.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_lg);

        JButton boton_del = new JButton("DEL");
        boton_del.setBounds(110, 200, 60, 30);
        boton_del.setOpaque(true);
        boton_del.setBackground(Color.WHITE);
        boton_del.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_del.setForeground(Color.BLACK);
        boton_del.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_del);
        
        JButton boton_siete = new JButton("7");
        boton_siete.setBounds(110, 250, 60, 30);
        boton_siete.setOpaque(true);
        boton_siete.setBackground(Color.WHITE);
        boton_siete.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_siete.setForeground(Color.BLACK);
        boton_siete.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_siete);

        JButton boton_cuatro = new JButton("4");
        boton_cuatro.setBounds(110, 300, 60, 30);
        boton_cuatro.setOpaque(true);
        boton_cuatro.setBackground(Color.WHITE);
        boton_cuatro.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_cuatro.setForeground(Color.BLACK);
        boton_cuatro.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_cuatro);

        JButton boton_uno = new JButton("1");
        boton_uno.setBounds(110, 350, 60, 30);
        boton_uno.setOpaque(true);
        boton_uno.setBackground(Color.WHITE);
        boton_uno.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_uno.setForeground(Color.BLACK);
        boton_uno.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_uno);

        JButton boton_constanteE = new JButton("e");
        boton_constanteE.setBounds(110, 400, 60, 30);
        boton_constanteE.setOpaque(true);
        boton_constanteE.setBackground(Color.WHITE);
        boton_constanteE.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_constanteE.setForeground(Color.BLACK);
        boton_constanteE.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_constanteE);

        //Tercera Linea

        JButton boton_in = new JButton("In");
        boton_in.setBounds(219, 150, 60, 30);
        boton_in.setOpaque(true);
        boton_in.setBackground(Color.WHITE);
        boton_in.setForeground(Color.BLACK);
        boton_in.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_in);

        JButton boton_ac = new JButton("AC");
        boton_ac.setBounds(219, 200, 60, 30);
        boton_ac.setOpaque(true);
        boton_ac.setBackground(Color.WHITE);
        boton_ac.setForeground(Color.BLACK);
        boton_ac.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_ac);

        JButton boton_ocho = new JButton("8");
        boton_ocho.setBounds(219, 250, 60, 30);
        boton_ocho.setOpaque(true);
        boton_ocho.setBackground(Color.WHITE);
        boton_ocho.setForeground(Color.BLACK);
        boton_ocho.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_ocho);

        JButton boton_cinco = new JButton("5");
        boton_cinco.setBounds(219, 300, 60, 30);
        boton_cinco.setOpaque(true);
        boton_cinco.setBackground(Color.WHITE);
        boton_cinco.setForeground(Color.BLACK);
        boton_cinco.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_cinco);

        JButton boton_dos = new JButton("2");
        boton_dos.setBounds(219, 350, 60, 30);
        boton_dos.setOpaque(true);
        boton_dos.setBackground(Color.WHITE);
        boton_dos.setForeground(Color.BLACK);
        boton_dos.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_dos);

        JButton boton_cero = new JButton("0");
        boton_cero.setBounds(219, 400, 60, 30);
        boton_cero.setOpaque(true);
        boton_cero.setBackground(Color.WHITE);
        boton_cero.setForeground(Color.BLACK);
        boton_cero.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_cero);

        //Cuarta Linea

        JButton boton_perentesis1 = new JButton("(");
        boton_perentesis1.setBounds(320, 150, 60, 30);
        boton_perentesis1.setOpaque(true);
        boton_perentesis1.setBackground(Color.WHITE);
        boton_perentesis1.setForeground(Color.BLACK);
        boton_perentesis1.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_perentesis1);

        JButton boton_division = new JButton("÷");
        boton_division.setBounds(320, 200, 60, 30);
        boton_division.setOpaque(true);
        boton_division.setBackground(Color.WHITE);
        boton_division.setForeground(Color.BLACK);
        boton_division.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_division);

        JButton boton_nueve = new JButton("9");
        boton_nueve.setBounds(320, 250, 60, 30);
        boton_nueve.setOpaque(true);
        boton_nueve.setBackground(Color.WHITE);
        boton_nueve.setForeground(Color.BLACK);
        boton_nueve.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_nueve);

        JButton boton_seis = new JButton("6");
        boton_seis.setBounds(320, 300, 60, 30);
        boton_seis.setOpaque(true);
        boton_seis.setBackground(Color.WHITE);
        boton_seis.setForeground(Color.BLACK);
        boton_seis.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_seis);

        JButton boton_tres = new JButton("3");
        boton_tres.setBounds(320, 350, 60, 30);
        boton_tres.setOpaque(true);
        boton_tres.setBackground(Color.WHITE);
        boton_tres.setForeground(Color.BLACK);
        boton_tres.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_tres);

        JButton boton_decimal = new JButton(".");
        boton_decimal.setBounds(320, 400, 60, 30);
        boton_decimal.setOpaque(true);
        boton_decimal.setBackground(Color.WHITE);
        boton_decimal.setForeground(Color.BLACK);
        boton_decimal.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_decimal);

        //Quinta Linea 

        JButton boton_perentesis2 = new JButton(")");
        boton_perentesis2.setBounds(420, 150, 60, 30);
        boton_perentesis2.setOpaque(true);
        boton_perentesis2.setBackground(Color.WHITE);
        boton_perentesis2.setForeground(Color.BLACK);
        boton_perentesis2.setHorizontalTextPosition(SwingConstants.CENTER);
        fondoCalculadora.add(boton_perentesis2);

        this.add(fondoCalculadora);
    }
    public static void main(String[] args) {
        new Ventana_1();
    }
}