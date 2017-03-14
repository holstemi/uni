import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GrafiikkaTesti extends JFrame implements ActionListener{
    private Image pallo;
    private PiirtoAlusta p;
    private Timer timer;
    private JButton startOrStop;
 
    public static void main(String[] args){
        GrafiikkaTesti kentta = new GrafiikkaTesti();
        kentta.setTitle("Animated ball");
        kentta.pack();
        kentta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kentta.setVisible(true);
    }

    public GrafiikkaTesti() {
        pallo = Toolkit.getDefaultToolkit().getImage("pallo.png");
        
        p = new PiirtoAlusta(pallo);
        startOrStop = new JButton("Start/Stop animation");
        startOrStop.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(p, BorderLayout.CENTER);
        panel.add(startOrStop, BorderLayout.SOUTH);
        
        this.setPreferredSize(new Dimension(400,400));
        this.getContentPane().add(panel);
        timer = new Timer(15,this);
    }

    private class PiirtoAlusta extends JPanel {
        private Image img;
        private int x = 1;
        private int y = 1;
        private int xx = 3;
        private int yy = 3;
        
        public PiirtoAlusta(Image img) {
            this.img = img;
            this.setBackground(Color.WHITE);
            this.setPreferredSize(new Dimension(400,400));
        }


        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            if(x >= this.getWidth()-img.getWidth(this)){
                xx = -xx;
            }
            if(y >= this.getHeight()-img.getHeight(this)){
                yy = -yy;
            }
            
            x += xx;
            y += yy;
            
            g.drawImage(img, x, y, this);
        } 
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == timer){
            p.repaint();
        }
        else if(e.getSource() == startOrStop){
            if(timer.isRunning()){
                timer.stop();
            }
            else{
                timer.start();
            }
        }
    }
}
