
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exponathinzufuegen implements ActionListener
{
    private JFrame frame=new JFrame();
    private JPanel panel=new JPanel();
    private JButton button1=new JButton();
    private Museum museum1=new Museum();
    private JLabel label1=new JLabel();
    public Exponathinzufuegen (){
        frame.add(panel);
        panel.add(label1);
        frame. setVisible(true);
        panel.setVisible(true);
        label1.setVisible(true);
        addButton(button1, "Exponat hinzufuegen");
        JTextField tf=new JTextField ();
    }

    public static void main (){
        Exponathinzufuegen exponathinzufuegen=new Exponathinzufuegen();
    }

    public void addButton(JButton button, String text){
        panel.add(button);
        button.addActionListener(this);
        button.setText(text); 
        button.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) { 
        if(e.getSource() == button1){ 

        }
    }
}


