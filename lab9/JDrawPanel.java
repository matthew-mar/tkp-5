import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
public class JDrawPanel extends JPanel {
    public static enum Figure {
        LINE,
        OVAL,
        RECT,
        ROUNDRECT,
        SURNAME,
        CLEAR
    };
    private Figure vibor = Figure.CLEAR;
    public JDrawPanel() {} 
    public void ris(String s) {
        vibor = Figure.valueOf(s);
        repaint();
    }


    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        Graphics2D g = (Graphics2D) gr;
        BasicStroke pen;

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        switch (vibor) {
            case LINE:
                pen = new
                BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
                g.setStroke(pen);
                g.setColor(Color.blue);
                g.drawLine(20, 20, 100, 100);
                break;
            case OVAL:
                float[] dash = {
                    10,
                    30
                };
                pen = new
                BasicStroke(10, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND, 10, dash, 0);
                g.setStroke(pen);
                g.setColor(Color.red);
                g.setPaint(new GradientPaint(30, 30, Color.red, 50, 50, Color.green, true));
                g.fill(new Ellipse2D.Double(20, 20, 100, 100));
                break;
            case RECT:
                float[] dash2 = {
                    20,
                    20
                };
                pen = new
                BasicStroke(5, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL, 1, dash2, 0);
                g.setStroke(pen);
                g.setColor(Color.magenta);
                g.drawRect(20, 20, 100, 100);
                break;
            case ROUNDRECT:
                float[] dash3 = {
                    20,
                    20,
                    2,
                    20,
                    2,
                    20
                };
                pen = new
                BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL, 1, dash3, 0);
                g.setStroke(pen);
                g.setColor(Color.yellow);
                g.drawRoundRect(20, 20, 100, 100, 60, 60);
                break;
            case SURNAME:
                //М
                pen = new
                BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
                g.setStroke(pen);
                g.setColor(Color.GREEN);
                g.drawLine(20, 20, 20, 100);
                g.drawLine(20, 20, 40, 50);
                g.drawLine(60, 20, 60, 100);
                g.drawLine(60, 20, 40, 50);

                //А
                pen = new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
                g.setStroke(pen);
                g.setColor(Color.ORANGE);
                g.drawLine(120, 20, 100, 100);
                g.drawLine(120, 20, 140, 100);
                g.drawLine(80, 50, 160, 50);

                //Р
                pen = new BasicStroke(15, BasicStroke.CAP_SQUARE, BasicStroke.CAP_BUTT);
                g.setStroke(pen);
                g.setColor(Color.CYAN);
                g.drawLine(180, 20, 180, 100);
                g.drawRoundRect(190, 20, 50, 50, 60, 60);

                //Ь
                float[] dash4 = {
                    40,
                    45,
                    15,
                    40,
                    15,
                    40
                };
                pen = new
                BasicStroke(5, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND, 1, dash4, 0);
                g.setStroke(pen);
                g.setColor(Color.PINK);
                g.drawLine(280, 20, 280, 100);
                g.drawRoundRect(280, 70, 50, 50, 60, 60);

                //Ю
                pen = new
                BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);
                g.setStroke(pen);
                g.setColor(Color.magenta);
                g.drawRoundRect(380, 20, 2, 100, 0, 2);
                g.drawRoundRect(370, 60, 50, 2, 2, 0);
                g.setPaint(new GradientPaint(20, 20, Color.magenta, 80, 15, Color.BLACK,
                    true));
                g.fill(new Ellipse2D.Double(420, 20, 100, 100));

                //Ш
                float[] dash6 = {
                    10,
                    10
                };
                pen = new
                BasicStroke(5, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL, 1, dash6, 2);
                g.setStroke(pen);
                g.setColor(Color.YELLOW);
                g.drawLine(550, 120, 700, 120);
                g.drawLine(550, 120, 550, 20);
                g.drawLine(625, 120, 625, 20);
                g.drawLine(700, 120, 700, 20);

                //К
                pen = new
                BasicStroke(10, BasicStroke.JOIN_BEVEL, BasicStroke.JOIN_BEVEL);
                g.setStroke(pen);
                g.setColor(Color.RED);
                g.drawLine(750, 20, 750, 120);
                g.drawLine(740, 70, 790, 20);
                g.drawLine(740, 60, 790, 120);

                //И
                pen = new BasicStroke(15, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER);
                g.setStroke(pen);
                g.setColor(Color.GRAY);
                g.drawLine(850, 20, 850, 120);
                g.drawLine(860, 100, 910, 30);
                g.drawLine(920, 20, 920, 120);

                //Н
                pen = new
                BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
                g.setStroke(pen);
                g.setColor(Color.BLUE);
                g.drawLine(970, 10, 970, 120);
                g.drawLine(940, 80, 1030, 80);
                g.drawLine(1020, 20, 1020, 100);
                g.drawLine(960, 110, 980, 100);

                break;
            case CLEAR:
                g.clearRect(0, 0, getSize().width, getSize().height);
                break;

        }
    }
}
