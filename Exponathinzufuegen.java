
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
    private ItemListener il;
    private String status;
    private Exponat exponat=new Exponat();
    JTextField tf1=new JTextField ();
    JTextField tf2=new JTextField ();
    JTextField tf3=new JTextField ();
    public Exponathinzufuegen (){
        frame.add(panel);
        panel.add(label1);
        frame. setVisible(true);
        panel.setVisible(true);
        label1.setVisible(true);
        addButton(button1, "Exponat hinzufuegen");
        tf1.setText("Alter");
        tf2.setText("Kuenstler");
        tf3.setText("Herkunft");
        Choice wahl=new Choice();
        panel.add(tf1);
        panel.add(tf2);
        panel.add(tf3);
        panel.add(wahl);
        wahl.add("Artefakt");
        wahl.add("Bild");
        wahl.add("Skulptur");
        wahl.addItemListener(il);
        tf1.addActionListener(this);
        tf2.addActionListener(this);
        tf3.addActionListener(this);
        wahl.setVisible(true);
        tf1.setVisible(true);
        tf2.setVisible(true);
        tf3.setVisible(true);
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
        else if (e.getSource()==tf1){
            
        }
        else if (e.getSource()==tf2){
            
        }
        else if (e.getSource()==tf3){
            
        }
    }
    
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED){
            status=e.paramString();
        }
    }
}


