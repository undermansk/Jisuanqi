import  javax.swing.JButton;
import  javax.swing.JFrame;
import  javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Myframe extends JFrame{
    JLabel timeLabel=new JLabel("00:00：00");
    public  Myframe(String title){
        super(title);
        JPanel root=new JPanel();
        this .setContentPane(root);
        JButton button=new JButton("小帅哥快来玩！");

        root.add(button);
        JLabel label=new JLabel("只要998哟！！！");

        root.add(label);

          button.addActionListener(new MyactionLisetener());
          JLabel timeLabel=new JLabel("00:00：00");
          root.add(timeLabel);
    }
 private  class  MyactionLisetener implements ActionListener{

     @Override
     public void actionPerformed(ActionEvent e) {
         System.out.println("点的好啊！");
         SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
         String timeStr = sdf.format(new Date());
         System.out.println(timeStr);
timeLabel.setText(timeStr);
     }
 }
}
