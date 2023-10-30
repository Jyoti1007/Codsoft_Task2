
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

public class Calculator extends JFrame implements ActionListener{
 private JLabel title1,marks1,marks2,marks3,marks4,marks5,validationMsg,title2,totalMarkslbl,AvgPercentlbl,gradelbl,totalMarks,AvgPercent,gradeAwarded;
 private JTextField mark1txt,mark2txt,mark3txt,mark4txt,mark5txt;
 private JButton calculate,back;
 private int num1,num2,num3,num4,num5,total;
 private float percent;
 private String grade;
 Font f1=new Font("Times new roman",Font.BOLD,22);
 Font f2=new Font("Times new roman",Font.PLAIN,20);
    public Calculator() {
    this.setTitle("Student Grade Calculator ");
    this.setMinimumSize(new Dimension(500, 500));
    this.setLayout(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.getContentPane().setBackground(Color.WHITE);
    this.setResizable(false);
    
    title1=new JLabel("Enter the marks obtained out of 100:");
    title1.setBounds(25,10,350,40);
    title1.setFont(f1);
    this.add(title1);
    
    marks1=new JLabel("Marks1:");
    marks1.setBounds(40,80,100,40);
    marks1.setFont(f1);
    this.add(marks1);
    
    mark1txt=new JTextField();
    mark1txt.setBounds(140,80,100,30);
    mark1txt.setFont(f2);
    this.add(mark1txt);
    
    marks2=new JLabel("Marks2:");
    marks2.setBounds(40,120,100,40);
    marks2.setFont(f1);
    this.add(marks2);
    
    mark2txt=new JTextField();
    mark2txt.setBounds(140,120,100,30);
    mark2txt.setFont(f2);
    this.add(mark2txt);
        
    marks3=new JLabel("Marks3:");
    marks3.setBounds(40,160,100,40);
    marks3.setFont(f1);
    this.add(marks3);
    
    mark3txt=new JTextField();
    mark3txt.setBounds(140,160,100,30);
    mark3txt.setFont(f2);
    this.add(mark3txt);
    
    
    marks4=new JLabel("Marks4:");
    marks4.setBounds(40,200,100,40);
    marks4.setFont(f1);
    this.add(marks4);
    
    mark4txt=new JTextField();
    mark4txt.setBounds(140,200,100,30);
    mark4txt.setFont(f2);
    this.add(mark4txt);
    
    
    marks5=new JLabel("Marks5:");
    marks5.setBounds(40,240,100,40);
    marks5.setFont(f1);
    this.add(marks5);
    
    mark5txt=new JTextField();
    mark5txt.setBounds(140,240,100,30);
    mark5txt.setFont(f2);
    this.add(mark5txt);
    
    validationMsg=new JLabel("");
    validationMsg.setBounds(130,300,300,30);
    validationMsg.setFont(f2);
    validationMsg.setForeground(Color.RED);
    this.add(validationMsg);
    
    calculate=new JButton("CALCULATE");
    calculate.setBounds(160,350,180,40);
    calculate.setFont(f1);
    calculate.setForeground(Color.BLACK);
    calculate.setBackground(Color.CYAN);
    this.add(calculate);
    calculate.addActionListener(this);
    
    title2=new JLabel("Hey ..Here is the summary !!!");
    title2.setBounds(30,30,350,40);
    title2.setFont(f1);
    title2.setForeground(Color.RED);
    title2.setVisible(false);
    this.add(title2);
    
    totalMarkslbl=new JLabel("TOTAL OBTAINED MARKS: ");
    totalMarkslbl.setBounds(50,100,270,40);
    totalMarkslbl.setFont(f2);
    totalMarkslbl.setForeground(Color.BLACK);
    totalMarkslbl.setVisible(false);
    this.add(totalMarkslbl);
    
    totalMarks=new JLabel();
    totalMarks.setBounds(330,100,100,40);
    totalMarks.setFont(f1);
    totalMarks.setForeground(Color.RED);
    totalMarks.setVisible(false);
    this.add(totalMarks);
    
     AvgPercentlbl=new JLabel("AVERAGE PERCENTAGE:");
     AvgPercentlbl.setBounds(50,160,260,40);
     AvgPercentlbl.setFont(f2);
     AvgPercentlbl.setForeground(Color.BLACK);
     AvgPercentlbl.setVisible(false);
     this.add(AvgPercentlbl);
         
    AvgPercent=new JLabel();
    AvgPercent.setBounds(330,160,100,40);
    AvgPercent.setFont(f1);
    AvgPercent.setForeground(Color.RED);
    AvgPercent.setVisible(false);
    this.add(AvgPercent);
         
    gradelbl=new JLabel("GRADE AWARDED:");
    gradelbl.setBounds(50,220,210,40);
    gradelbl.setFont(f2);
    gradelbl.setForeground(Color.BLACK);
    gradelbl.setVisible(false);
    this.add(gradelbl);
    
     gradeAwarded=new JLabel();
     gradeAwarded.setBounds(330,220,100,40);
     gradeAwarded.setFont(f1);
     gradeAwarded.setForeground(Color.RED);
     gradeAwarded.setVisible(false);
     this.add(gradeAwarded);
     
     back=new JButton("BACK TO HOME");
      back.setBounds(160,350,190,40);
        back.setFont(f2);
        back.setForeground(Color.BLACK);
        back.setBackground(Color.CYAN);
        this.add(back);
        back.setVisible(false);
        back.addActionListener(this);
    }
    
    
    public void calculation(){
        num1=Integer.parseInt(mark1txt.getText());
        num2=Integer.parseInt(mark2txt.getText());
        num3=Integer.parseInt(mark3txt.getText());
        num4=Integer.parseInt(mark4txt.getText());
        num5=Integer.parseInt(mark5txt.getText());
        total=num1+num2+num3+num4+num5;
        percent=total/5;
        if(percent>=80)
        {
        grade="A";
        }
        else if(percent<80 && percent>=70)
        {
        grade="B";
        }
        else if(percent<70 && percent>=60)
        {
        grade="C";
        }
        else if(percent<60 && percent>=40)
        {
        grade="D";
        }
        else
        {
        grade="No grade";
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==calculate)
        {
        if(Integer.parseInt(mark1txt.getText())>100||Integer.parseInt(mark2txt.getText())>100||Integer.parseInt(mark3txt.getText())>100||
        Integer.parseInt(mark4txt.getText())>100||Integer.parseInt(mark5txt.getText())>100)
        {
        validationMsg.setText("marks must not be greater than 100..");
        }
       else
        {
        calculation();
         title1.setVisible(false);
         marks1.setVisible(false);
         marks2.setVisible(false);
         marks3.setVisible(false);
         marks4.setVisible(false);
         marks5.setVisible(false);
         validationMsg.setVisible(false);
         mark1txt.setVisible(false);
         mark2txt.setVisible(false);
         mark3txt.setVisible(false);
         mark4txt.setVisible(false);
         mark5txt.setVisible(false);
         calculate.setVisible(false);
         totalMarks.setText(String.valueOf(total));
         AvgPercent.setText(String.valueOf(percent)+" %");
         gradeAwarded.setText("\'"+String.valueOf(grade)+"\'");
        title2.setVisible(true);
        totalMarkslbl.setVisible(true);
         totalMarks.setVisible(true);
         AvgPercentlbl.setVisible(true);
         AvgPercent.setVisible(true);
         gradelbl.setVisible(true);
        gradeAwarded.setVisible(true);
         back.setVisible(true);
        }
        }
        if(e.getSource()==back)
        {
        this.setVisible(false);
        }
         
    }
    
}
 
