package studentgradecalculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StudentGradeCalculator extends JFrame implements ActionListener{
private JLabel heading1,heading2;
private JButton start;

Font f1=new Font("Times new roman",Font.BOLD,40);
Font f2=new Font("Times new roman",Font.BOLD,25);
Font f3=new Font("Times new roman",Font.BOLD,30);
    public StudentGradeCalculator() {
    this.getContentPane().setBackground(Color.WHITE);
    this.setTitle("Student Grade Calculator ");
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setLayout(new FlowLayout());
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(new JLabel(new ImageIcon("a32.jpg")));
    
    
    heading1=new JLabel("GRADE CALCULATOR");
    heading1.setBounds(530,20,450,50);
    heading1.setForeground(Color.BLUE);
    heading1.setFont(f1);
    this.add(heading1);
    
    heading1=new JLabel("Are you in a hurry !! Calculate your grades easily");
    heading1.setBounds(500,70,550,50);
    heading1.setForeground(Color.RED);
    heading1.setFont(f2);
    this.add(heading1);
    
    start=new JButton("Let's calculate");
    start.setBounds(540,655,250,45);
    start.setFont(f3);
    start.setBackground(Color.RED);
    start.setForeground(Color.WHITE);
    this.add(start);
    start.addActionListener(this);
    
    pack();
    
    }

    public static void main(String[] args) {
       new StudentGradeCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       new Calculator();
        
    }
    
}




