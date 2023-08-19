package Functional_Programming;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
public class GUI_Programming {
    public void init(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(new Date().toString());
        Font font = new Font("Courier New",Font.BOLD,14);
        label.setFont(font);
        frame.add(label);

        JButton button = new JButton("Present Time!");
        button.setFont(font);
        frame.add(button);
        //old way
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(new Date().toString());
            }
        });*/

        //new way
        button.addActionListener(e->label.setText(new Date().toString()));
        frame.setSize(300,100);
        frame.setVisible(true);
    }
    public static void main(String...args){
        new GUI_Programming().init();
    }
}
