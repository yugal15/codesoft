import java.util.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

class UserFrame extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField tf1,tf2,tf3,tf4,tf5;
    JButton b;
    int science,math,english,history,physics,sum;
    double avg;
    
    String Grade = "",TotalMarks = "", Average = "";

    public UserFrame()
    {
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Marksheet");
        this.setBackground(Color.GREEN);

        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        l1 = new JLabel("Science");
        l2 = new JLabel("Math");
        l3 = new JLabel("English");
        l4 = new JLabel("History");
        l5 = new JLabel("Physics");
        l6 = new JLabel("Enter The Marks");
        l7 = new JLabel();
        l8 = new JLabel();
        l9 = new JLabel();


        b = new JButton("ENTER");
        b.addActionListener(this);

        tf1 = new JTextField(3);
        tf2 = new JTextField(3);
        tf3 = new JTextField(3);
        tf4 = new JTextField(3);
        tf5 = new JTextField(3);

        l6.setBounds(150,10,200,40);

        l1.setBounds(30,70,50,40);
        l2.setBounds(130,70,50,40);
        l3.setBounds(210,70,50,40);
        l4.setBounds(300,70,50,40);
        l5.setBounds(390,70,50,40);

        tf1.setBounds(10,100,70,40);
        tf2.setBounds(100,100,70,40);
        tf3.setBounds(190,100,70,40);
        tf4.setBounds(280,100,70,40);
        tf5.setBounds(370,100,70,40);

        b.setBounds(150,180,100,40);

        l7.setBounds(10, 250, 150, 40);
        l7.setForeground(Color.blue);
        l8.setBounds(150, 250, 150, 40);
        l8.setForeground(Color.blue);
        l9.setBounds(290, 250, 100, 40);
        l9.setForeground(Color.blue);



        this.add(l1);
        this.add(tf1);
        this.add(l2);
        this.add(tf2);
        this.add(l3);
        this.add(tf3);
        this.add(l4);
        this.add(tf4);
        this.add(l5);
        this.add(tf5);
        this.add(b);
        this.add(l6);
        this.add(l7);
        this.add(l8);
        this.add(l9);
    }

    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            science = Integer.parseInt(tf1.getText());
            math = Integer.parseInt(tf2.getText());
            english = Integer.parseInt(tf3.getText());
            history = Integer.parseInt(tf4.getText());
            physics = Integer.parseInt(tf5.getText());

            sum = science + math + english + history + physics;
            avg = sum / 5;

            TotalMarks = String.valueOf(sum);
            Average = String.valueOf(avg);

            l7.setText("TotalMarks is : "+TotalMarks);
            l8.setText("Average is : "+Average);

            if(avg >= 80)
            {
                Grade = "A";
            }
            else if(avg >= 60 && avg < 80)
            {
                Grade = "B";
            }
            else if(avg >= 35 && avg < 60)
            {
                Grade = "C";
            }
            else
            {
                Grade = "Fail";
            }
            l9.setText("Grade is : "+Grade);
        }
        catch(Exception eobj)
        {
        }   
    }
}

class Task2A
{
    public static void main(String[] args) 
    {
        UserFrame obj = new UserFrame();
    }
}