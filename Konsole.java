
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Konsole implements ActionListener
{
    private JFrame frame=new JFrame();
    private JPanel panel=new JPanel();
    private JButton button1=new JButton();
    private JButton button2=new JButton();
    private Museum museum1=new Museum();
    private JLabel label1=new JLabel();
    public Konsole(){
        frame.add(panel);
        panel.add(label1);
        frame. setVisible(true);
        panel.setVisible(true);
        label1.setVisible(true);
        addButton(button1, "Fuege Exponat hinzu");
        addButton(button2, "Gib Anzahl Exponate");
    }

    public static void main (){
        Konsole konsole=new Konsole();
    }

    public void addButton(JButton button, String text){
        panel.add(button);
        button.addActionListener(this);
        button.setText(text); 
        button.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) { 
        if(e.getSource() == button2){ 
            label1.setText("Es sind "+ museum1.gibAnzahlExponate()+" Exponate vorhanden"); 
        } 
        else if(e.getSource() == button1){

        }

    }
}

    
