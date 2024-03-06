import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Casa extends JFrame 
{

    public Casa()
    {
        this.setVisible(true);
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Dibujo de una casa");
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
        this.paint(getGraphics());

        this.repaint();
        this.validate();
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        Graphics g2d = (Graphics2D) g;

        //Fondo del dibujo
        g2d.setColor(Color.decode("#00DCFF"));
        g2d.fillRect(0, 0, 800, 800);

        //Color del ceped
        g2d.setColor(Color.decode("#47DC17"));
        g2d.fillRect(0, 714, 800, 30);

        //Color de la tierra
        g2d.setColor(Color.decode("#674B04"));
        g2d.fillRect(0, 744, 800, 50);

        //Cuerpo y color de la casa
        g2d.setColor(Color.decode("#EA1818"));
        g2d.fillRect(150, 315, 500, 400);

        //Techo de la casa
        g2d.setColor(Color.decode("#660202"));
        g2d.fillRect(140, 315, 520, 45);

        //Antenas de la casa
        g2d.setColor(Color.decode("#919292"));
        g2d.fillRect(165, 255, 10, 60);
        g2d.fillRect(195, 285, 10, 30);

        //Tinaco de la casa
        g2d.setColor(Color.BLACK);
        g2d.fillRect(580, 265, 50, 50);
        g2d.fillRect(596, 255, 20, 10);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(595, 285, 20, 10);

        //marco de la ventana de la casa
        g2d.setColor(Color.decode("#B3B6B7"));
        g2d.fillRect(200, 430, 220, 150);

        for(int i = 215; i < 365; i += 70)
        {
            g2d.setColor(Color.decode("#00FFF3"));
            g2d.fillRect(i, 445, 50, 120);
        }

        //Marco bajo de la ventana
        g2d.setColor(Color.decode("#8C8C8C"));
        g2d.fillRect(190, 580, 245, 40);


        //Tablas de la cerca
        for(int i = 700; i > 630; i-= 20)
        {
            g2d.setColor(Color.decode("#CA9308"));
            g2d.fillRect(0, i, 800, 10);
        }

        //Troncos de la cerca
        for(int i = 0; i < 800; i += 40){
            g2d.setColor(Color.decode("#EEC04B"));
            g2d.fillRect(i, 635, 20, 80);
        }

        //Forma de la puerta
        g2d.setColor(Color.decode("#726102"));
        g2d.fillRect(500, 515, 95, 200);

        //Picaporte de la puerta

        g2d.setColor(Color.decode("#F6DC01"));
        g2d.fillRect(507, 610, 10, 20);

    }

    
    

}
