import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.*;
import java.awt.event.*;
class Button_Image implements ActionListener
{
static JFrame frame;
public static void main(String args[]){
frame= new JFrame("Image on Click");
frame.setSize(500,500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setBackground(Color.white);
frame.setLayout(new FlowLayout());
JButton button= new JButton("Display");
frame.add(button);
Button_Image obj= new Button_Image();
button.addActionListener(obj);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
ImageIcon icon = new ImageIcon("logo.jpg");
JLabel label= new JLabel(icon);
frame.add(label);
frame.pack();
frame.setSize(500,500);   
}
} 
