package Core_Java_PartI_Fundamentals;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ImageViewerFrame extends JFrame {
    private static final int DEF_WIDTH = 300;
    private static final int DEF_HEIGHT = 400;
    public ImageViewerFrame(int width, int height){
        this();
        setSize(width,height);
    }
    public ImageViewerFrame(){
        setSize(DEF_WIDTH,DEF_HEIGHT);
        var label = new JLabel();
        add(label);
        var choose = new JFileChooser();
        choose.setCurrentDirectory(new File("."));
        var menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        var menu=new JMenu("File");
        menuBar.add(menu);
        var item=new JMenuItem("Open");
        menu.add(item);
        item.addActionListener(event->{
            int result = choose.showOpenDialog(null);
            if(result==JFileChooser.APPROVE_OPTION){
                String name=choose.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        });
        var exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(event->System.exit(0));
    }
}
