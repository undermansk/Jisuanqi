import  javax.swing.JButton;
import  javax.swing.JFrame;
import  javax.swing.*;
public class Main {
    public  static  void  main(String[] args){
        //JFrame frame=new JFrame("First");
        Myframe frame=new Myframe("哈哈");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(380,760);
        frame.setVisible(true);
    }
}
