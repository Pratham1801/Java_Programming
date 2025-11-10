import javax.swing.*;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.*;
import java.awt.color.*;

class MarvellousLogin implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton addobj ,subobj ,mulobj ,divobj;
    JTextField tobj1;
    JTextField tobj2;
    JLabel Number1label, Number2label, Resultlabel;
    


    public MarvellousLogin(String title, int width, int height)
    {
        fobj = new JFrame(title);

        fobj.getContentPane().setBackground(Color.orange);
        Number1label = new JLabel("Number 1");
        Number1label.setBounds(50,50,100,30);

        tobj1 = new JTextField();
        tobj1.setBounds(150,50,150,30);

        Number2label = new JLabel("Number 2");
        Number2label.setBounds(50,100,100,30);

        tobj2 = new JTextField();
        tobj2.setBounds(150,100,150,30);

        addobj = new JButton("+");
        addobj.setBounds(50,150,50,30);

        subobj = new JButton("-");
        subobj.setBounds(110,150,50,30);

        mulobj = new JButton("*");
        mulobj.setBounds(170,150,50,30);

        divobj = new JButton("/");
        divobj.setBounds(230,150,50,30);

        Resultlabel = new JLabel("Result : ");
        Resultlabel.setBounds(150,200,250,30);

        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(Number1label);
        fobj.add(Number2label);
        fobj.add(Resultlabel);
        fobj.add(addobj);
        fobj.add(subobj);
        fobj.add(mulobj);
        fobj.add(divobj);

        addobj.addActionListener(this);
        subobj.addActionListener(this);
        divobj.addActionListener(this);
        mulobj.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width,height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Number 1 : 30
    // Number 2 : 10

    public void actionPerformed(ActionEvent aobj)
    {
        int number1 = Integer.parseInt(tobj1.getText());
        int number2 = Integer.parseInt(tobj2.getText());
        double result = 0;

        if(aobj.getSource() == addobj)
             result =  number1 + number2;
        
        else if(aobj.getSource() == subobj)
            result = number1 - number2;
        
        else if(aobj.getSource() == mulobj)
            result = number1 * number2;
        
        else if(aobj.getSource() == divobj)
             result = number1 / number2;
        
        Resultlabel.setText("Result : "+ result);
    }
}

class Calculator
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Login",400,300);
    }
}