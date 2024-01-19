import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.print.DocFlavor.READER;

class userFrame extends Frame implements ActionListener
{

    Random random = new Random();
    int RandomNo = random.nextInt(1000);

    int i = 0,score = 0;
    TextField t;
    Label l;
    Button b;
    String Score = "",Result = "",StrNum = "";
    int Number = 0;
    public userFrame()
    {
        System.out.println(RandomNo);
        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("Guess the Number");
        this.setBackground(Color.GRAY);
        this.setLayout(new FlowLayout());

        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        t = new TextField(20);
        b = new Button("ENTER");
        l = new Label("Enter the Random number : ");

        Font f = new Font("arial",Font.BOLD,15);
        t.setFont(f);
        b.setFont(f);
        l.setFont(f);

        b.addActionListener(this);

        this.add(l);this.add(t);
        this.add(b);
    }

    public void actionPerformed(ActionEvent ae)
    {
        StrNum = t.getText();
        Number = Integer.parseInt(StrNum);
        i++;

            if(Number == RandomNo)
            {
               Result = "Accurate Guess";
            }
            if(Number >= RandomNo + 100)
            {
                Result = "You are too High...";
            }
            else if(Number >= RandomNo + 50)
            {
                Result = "You are quite more High....";
            }
            else if(Number >= RandomNo + 10)
            {
                Result = "You are just few High...";
            }
            else if(Number > RandomNo && Number < RandomNo + 10)
            {
                Result = "You are soo close high...";
            }

            else if(Number <= RandomNo - 100)
            {
                Result = "You are too low...";
            }
            else if(Number <= RandomNo - 50)
            {
                Result = "You are quite more low....";
            }
            else if(Number <= RandomNo - 10)
            {
                Result = "You are just few low...";
            }
            else if(Number < RandomNo && Number > RandomNo - 10)
            {
                Result = "You are soo close low...";
            }
            repaint(); 
    }

    public void paint(Graphics g)
    {
        Font f = new Font("arial",Font.BOLD,30);
        g.setFont(f);
        g.drawString(Result, 50, 200);
        this.setForeground(Color.red);
    }
}

class Task1A
{
    public static void main(String[] args) 
    {
        userFrame f = new userFrame();
    }
}