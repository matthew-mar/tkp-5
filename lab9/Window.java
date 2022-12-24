import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Window extends JFrame implements ActionListener {
    private JDrawPanel myPanel = new JDrawPanel();
    
    public static void main(String[] args) {
        new Window("Окно с графикой");
    }
    
    public Window(String s) {
        super(s);
        JMenuBar myMenuBar = new JMenuBar();
        JMenu menu = new JMenu("Figure");
        JMenuItem[] figure = new JMenuItem[6];

        for (int i = 0; i < 6; i++) {
            figure[i] = new JMenuItem(JDrawPanel.Figure.values()[i].toString());
            menu.add(figure[i]);
            figure[i].addActionListener(this);
        }
        myMenuBar.add(menu);
        setJMenuBar(myMenuBar);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(myPanel, BorderLayout.CENTER);
        Dimension size = getSize();
        size.setSize(size.width, size.height + 200);
        
        pack();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        myPanel.ris(e.getActionCommand());
    }
}