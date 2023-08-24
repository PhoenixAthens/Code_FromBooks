package Core_Java_PartI_Fundamentals;
import java.io.*;
import java.awt.*;
import javax.swing.*;
public class ImageViewer {
    public static void main(String...args){
        //Small Frame
        EventQueue.invokeLater(()->{
            var frame = new ImageViewerFrame();
            frame.setTitle("IMG_Viewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
        //Big Frame
        EventQueue.invokeLater(()->{
            var frame=new ImageViewerFrame(600,600);
            frame.setTitle("InstaMAZE");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
