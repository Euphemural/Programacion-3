import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.plaf.TreeUI;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.BasicStroke;

public class Ventana_1 extends JFrame 
{


	public Ventana_1() 
    {
        this.setVisible(true);
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Cobranza de Intereses");
        this.setMinimumSize(new Dimension(250,250));
        this.setMaximumSize(new Dimension(1000,750));
        this.setResizable(true);
        this.setLocation(200,200);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.iniciarComponentes();
    }
	
    public void iniciarComponentes() {
        
        //this.fondoCalculadora();
        //this.calculadora();
        //this.cobranza();
        this.paint(getGraphics());

        this.repaint();
        this.validate();

    }

    @Override
    public void paint(Graphics g){

        super.paint(g);

        Graphics g2d = (Graphics2D) g;

        //Asignacion de color
        g2d.setColor(Color.BLUE);

        //Sirve para pintar un cuadrado relleno
        g2d.fillRect(50, 50, 200, 100);

        //Sirve para limpiar una zona
        g2d.clearRect(100, 100, 100, 100);

        g2d.fillArc(300, 300, 100, 100, 45, 100);
        g2d.drawArc(320, 200, 100, 100, 45, 100);

        g2d.setColor(Color.BLACK);

        g2d.drawLine(0, 0, 500, 500);

        g2d.drawOval(400, 400, 50, 50);
        g2d.fillOval(350, 400, 50, 50);

        int xPoints [] = {100, 250, 300};
        int yPoints [] = {100, 200, 350};

        //g2d.drawPolyline(xPoints, yPoints, 3);

        g2d.setColor(Color.RED);

        g2d.fillPolygon(xPoints, yPoints, 3);

        g2d.setFont(new Font("Arial", Font.BOLD, 18));
        g2d. drawString("Hola", 150, 50);

        //g2d.setStroke(new BasicStroke(10));

        g2d.drawRoundRect(420, 150, 200, 150, 0, 10);

        try {

            BufferedImage image = ImageIO.read(new File("src\\polluelo.jpg"));

            g2d.drawImage(image, 0, 0, null);
        }
        catch(IOException e) 
        {

            e.printStackTrace();
        }

    }

    public void cobranza(){

        this.setSize(800, 800);

        JPanel panel = new JPanel();
        panel.setSize(this.getWidth(), this.getHeight());
        panel.setBackground(Color.white);
        panel.setLayout(null);

        JPanel calculo = new JPanel();
        calculo.setBounds(10, 50, 300, 300);
        calculo.setBackground(Color.BLACK);
        calculo.setLayout(new BorderLayout());
        panel.add(calculo);

        this.add(panel);
    }

    public void calculadora(){

        this.setSize(400, 500);

        JPanel panel = new JPanel();
        panel.setSize(this.getWidth(), this.getHeight());
        panel.setBackground(Color.decode("#D33636"));
        panel.setLayout(new BorderLayout());

        JLabel text = new JLabel("100.00", 2);
        panel.add(text, BorderLayout.NORTH);
        text.setOpaque(true);
        text.setBackground(Color.WHITE);
        text.setFont(new Font("Arial", Font.BOLD, 40));

        JPanel centro = new JPanel();
        centro.setBackground(Color.decode("#E16DD8"));
        centro.setLayout(new GridLayout(4, 1, 10, 10));
        panel.add(centro, BorderLayout.CENTER);

        String btns[] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "/"};

        for (int i = 0; i < 12; i ++){
            JButton boton = new JButton(btns[i]);
            centro.add(boton);
        }

        JPanel Este = new JPanel();
        Este.setBackground(Color.decode("#B7E16D"));
        Este.setLayout(new GridLayout(3,1, 10, 10));
        panel.add(Este, BorderLayout.EAST);

        String btns2[] = {"+", "-", "="};

        for (int i = 0; i < 3; i ++){
            JButton boton = new JButton(btns2[i]);
            Este.add(boton);
        }

        JPanel Oeste = new JPanel();
        Oeste.setBackground(Color.DARK_GRAY);
        Oeste.setLayout(new BoxLayout(Oeste, BoxLayout.Y_AXIS));
        panel.add(Oeste, BorderLayout.WEST);

        String btns3[] = {"MC", "M+", "*"};

        for (int i = 0; i < 3; i ++){
            JButton boton = new JButton(btns3[i]);
            Oeste.add(boton);
        }

        this.add(panel);


    }

    public void fondoCalculadora()
    {
        JPanel fondoCalculadora = new JPanel();
        fondoCalculadora.setSize(this.getWidth(), this.getHeight());
        fondoCalculadora.setBackground(Color.decode("#E2E5E6"));
        fondoCalculadora.setLayout(null);

        JTextField ventanaNumeros = new JTextField("350 + 50 / 5 * 85");
        ventanaNumeros.setBounds(10,10,380,50);
        ventanaNumeros.setOpaque(true);
        ventanaNumeros.setBackground(Color.WHITE);
        ventanaNumeros.setFont(new Font("Arial", Font.BOLD, 18));
        ventanaNumeros.setHorizontalAlignment(SwingConstants.CENTER);
        ventanaNumeros.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(ventanaNumeros);

        //Primera Linea

        JButton boton_xy = new JButton("x^y");
        boton_xy.setBounds(10, 75, 60, 30);
        boton_xy.setOpaque(true);
        boton_xy.setBackground(Color.WHITE);
        boton_xy.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_xy.setForeground(Color.BLACK);
        boton_xy.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_xy.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_xy);

        JButton boton_raizCuadrada = new JButton("√");
        boton_raizCuadrada.setBounds(10, 115, 60, 30);
        boton_raizCuadrada.setOpaque(true);
        boton_raizCuadrada.setBackground(Color.WHITE);
        boton_raizCuadrada.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_raizCuadrada.setForeground(Color.BLACK);
        boton_raizCuadrada.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_raizCuadrada.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_raizCuadrada);

        JButton boton_signoExclamacion = new JButton("!");
        boton_signoExclamacion.setBounds(10, 155, 60, 30);
        boton_signoExclamacion.setOpaque(true);
        boton_signoExclamacion.setBackground(Color.WHITE);
        boton_signoExclamacion.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_signoExclamacion.setForeground(Color.BLACK);
        boton_signoExclamacion.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_signoExclamacion.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_signoExclamacion);

        JButton boton_unoEntrex = new JButton("1/x");
        boton_unoEntrex.setBounds(10, 195, 60, 30);
        boton_unoEntrex.setOpaque(true);
        boton_unoEntrex.setBackground(Color.WHITE);
        boton_unoEntrex.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_unoEntrex.setForeground(Color.BLACK);
        boton_unoEntrex.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_unoEntrex.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_unoEntrex);

        JButton boton_Pi = new JButton("π");
        boton_Pi.setBounds(10, 235, 60, 30);
        boton_Pi.setOpaque(true);
        boton_Pi.setBackground(Color.WHITE);
        boton_Pi.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_Pi.setForeground(Color.BLACK);
        boton_Pi.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_Pi.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_Pi);

        JButton boton_blanco = new JButton();
        boton_blanco.setBounds(10, 275, 60, 30);
        boton_blanco.setOpaque(true);
        boton_blanco.setBackground(Color.WHITE);
        boton_blanco.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_blanco.setForeground(Color.BLACK);
        boton_blanco.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_blanco.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_blanco);

        //Segunda Linea

        JButton boton_lg = new JButton("lg");
        boton_lg.setBounds(90, 75, 60, 30);
        boton_lg.setOpaque(true);
        boton_lg.setBackground(Color.WHITE);
        boton_lg.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_lg.setForeground(Color.BLACK);
        boton_lg.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_lg.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_lg);

        JButton boton_del = new JButton("DEL");
        boton_del.setBounds(90, 115, 60, 30);
        boton_del.setOpaque(true);
        boton_del.setBackground(Color.WHITE);
        boton_del.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_del.setForeground(Color.BLACK);
        boton_del.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_del.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_del);
        
        JButton boton_siete = new JButton("7");
        boton_siete.setBounds(90, 155, 60, 30);
        boton_siete.setOpaque(true);
        boton_siete.setBackground(Color.WHITE);
        boton_siete.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_siete.setForeground(Color.BLACK);
        boton_siete.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_siete.setBorder(BorderFactory.createLineBorder(Color.black, 2));

        fondoCalculadora.add(boton_siete);

        JButton boton_cuatro = new JButton("4");
        boton_cuatro.setBounds(90, 195, 60, 30);
        boton_cuatro.setOpaque(true);
        boton_cuatro.setBackground(Color.WHITE);
        boton_cuatro.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_cuatro.setForeground(Color.BLACK);
        boton_cuatro.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_cuatro.setBorder(BorderFactory.createLineBorder(Color.black, 2));

        fondoCalculadora.add(boton_cuatro);

        JButton boton_uno = new JButton("1");
        boton_uno.setBounds(90, 235, 60, 30);
        boton_uno.setOpaque(true);
        boton_uno.setBackground(Color.WHITE);
        boton_uno.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_uno.setForeground(Color.BLACK);
        boton_uno.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_uno.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_uno);

        JButton boton_constanteE = new JButton("e");
        boton_constanteE.setBounds(90, 275, 60, 30);
        boton_constanteE.setOpaque(true);
        boton_constanteE.setBackground(Color.WHITE);
        boton_constanteE.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_constanteE.setForeground(Color.BLACK);
        boton_constanteE.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_constanteE.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_constanteE);

        //Tercera Linea

        JButton boton_in = new JButton("In");
        boton_in.setBounds(170, 75, 60, 30);
        boton_in.setOpaque(true);
        boton_in.setBackground(Color.WHITE);
        boton_in.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_in.setForeground(Color.BLACK);
        boton_in.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_in.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_in);

        JButton boton_ac = new JButton("AC");
        boton_ac.setBounds(170, 115, 60, 30);
        boton_ac.setOpaque(true);
        boton_ac.setBackground(Color.WHITE);
        boton_ac.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_ac.setForeground(Color.BLACK);
        boton_ac.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_ac.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_ac);

        JButton boton_ocho = new JButton("8");
        boton_ocho.setBounds(170, 155, 60, 30);
        boton_ocho.setOpaque(true);
        boton_ocho.setBackground(Color.WHITE);
        boton_ocho.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_ocho.setForeground(Color.BLACK);
        boton_ocho.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_ocho.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_ocho);

        JButton boton_cinco = new JButton("5");
        boton_cinco.setBounds(170, 195, 60, 30);
        boton_cinco.setOpaque(true);
        boton_cinco.setBackground(Color.WHITE);
        boton_cinco.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_cinco.setForeground(Color.BLACK);
        boton_cinco.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_cinco.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_cinco);

        JButton boton_dos = new JButton("2");
        boton_dos.setBounds(170, 235, 60, 30);
        boton_dos.setOpaque(true);
        boton_dos.setBackground(Color.WHITE);
        boton_dos.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_dos.setForeground(Color.BLACK);
        boton_dos.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_dos.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_dos);

        JButton boton_cero = new JButton("0");
        boton_cero.setBounds(170, 275, 60, 30);
        boton_cero.setOpaque(true);
        boton_cero.setBackground(Color.WHITE);
        boton_cero.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_cero.setForeground(Color.BLACK);
        boton_cero.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_cero.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_cero);

        //Cuarta Linea

        JButton boton_perentesis1 = new JButton("(");
        boton_perentesis1.setBounds(250, 75, 60, 30);
        boton_perentesis1.setOpaque(true);
        boton_perentesis1.setBackground(Color.WHITE);
        boton_perentesis1.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_perentesis1.setForeground(Color.BLACK);
        boton_perentesis1.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_perentesis1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_perentesis1);

        JButton boton_porsentaje = new JButton("%");
        boton_porsentaje.setBounds(250, 115, 60, 30);
        boton_porsentaje.setOpaque(true);
        boton_porsentaje.setBackground(Color.WHITE);
        boton_porsentaje.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_porsentaje.setForeground(Color.BLACK);
        boton_porsentaje.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_porsentaje.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_porsentaje);

        JButton boton_nueve = new JButton("9");
        boton_nueve.setBounds(250, 155, 60, 30);
        boton_nueve.setOpaque(true);
        boton_nueve.setBackground(Color.WHITE);
        boton_nueve.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_nueve.setForeground(Color.BLACK);
        boton_nueve.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_nueve.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_nueve);

        JButton boton_seis = new JButton("6");
        boton_seis.setBounds(250, 195, 60, 30);
        boton_seis.setOpaque(true);
        boton_seis.setBackground(Color.WHITE);
        boton_seis.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_seis.setForeground(Color.BLACK);
        boton_seis.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_seis.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_seis);

        JButton boton_tres = new JButton("3");
        boton_tres.setBounds(250, 235, 60, 30);
        boton_tres.setOpaque(true);
        boton_tres.setBackground(Color.WHITE);
        boton_tres.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_tres.setForeground(Color.BLACK);
        boton_tres.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_tres.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_tres);

        JButton boton_decimal = new JButton(".");
        boton_decimal.setBounds(250, 275, 60, 30);
        boton_decimal.setOpaque(true);
        boton_decimal.setBackground(Color.WHITE);
        boton_decimal.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_decimal.setForeground(Color.BLACK);
        boton_decimal.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_decimal.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_decimal);

        //Quinta Linea 

        JButton boton_perentesis2 = new JButton(")");
        boton_perentesis2.setBounds(330, 75, 60, 30);
        boton_perentesis2.setOpaque(true);
        boton_perentesis2.setBackground(Color.WHITE);
        boton_perentesis2.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_perentesis2.setForeground(Color.BLACK);
        boton_perentesis2.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_perentesis2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_perentesis2);

        JButton boton_division = new JButton("/");
        boton_division.setBounds(330, 115, 60, 30);
        boton_division.setOpaque(true);
        boton_division.setBackground(Color.WHITE);
        boton_division.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_division.setForeground(Color.BLACK);
        boton_division.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_division.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_division);

        JButton boton_multiplicacion = new JButton("x");
        boton_multiplicacion.setBounds(330, 155, 60, 30);
        boton_multiplicacion.setOpaque(true);
        boton_multiplicacion.setBackground(Color.WHITE);
        boton_multiplicacion.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_multiplicacion.setForeground(Color.BLACK);
        boton_multiplicacion.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_multiplicacion.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_multiplicacion);

        JButton boton_resta = new JButton("-");
        boton_resta.setBounds(330, 195, 60, 30);
        boton_resta.setOpaque(true);
        boton_resta.setBackground(Color.WHITE);
        boton_resta.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_resta.setForeground(Color.BLACK);
        boton_resta.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_resta.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_resta);

        JButton boton_suma = new JButton("+");
        boton_suma.setBounds(330, 235, 60, 30);
        boton_suma.setOpaque(true);
        boton_suma.setBackground(Color.WHITE);
        boton_suma.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_suma.setForeground(Color.BLACK);
        boton_suma.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_suma.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_suma);

        JButton boton_resultado = new JButton("=");
        boton_resultado.setBounds(330, 275, 60, 30);
        boton_resultado.setOpaque(true);
        boton_resultado.setBackground(Color.WHITE);
        boton_resultado.setFont(new Font("Arial", Font.PLAIN, 12));
        boton_resultado.setForeground(Color.BLACK);
        boton_resultado.setHorizontalTextPosition(SwingConstants.CENTER);
        boton_resultado.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        fondoCalculadora.add(boton_resultado);

        this.add(fondoCalculadora);
    }
}