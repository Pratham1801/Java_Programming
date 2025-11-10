import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class  MarvellousLogin implements ActionListener
{
    
        // Characterstics
        JFrame fobj;
        JButton Aobj,bobj,cobj,dobj;
        JTextField tobj;
        JTextField Pobj;
        JLabel Num1label, Num2label, Resultlabel;

        public  MarvellousLogin(String title,int width,int height)
        {
            fobj = new JFrame(title);

            fobj.getContentPane().setBackground(Color.YELLOW);
            
            Num1label = new JLabel("Number 1");
            Num1label.setBounds(50,50,100,30);

            tobj = new JTextField();
            tobj.setBounds(150,50,150,30);

            Num2label = new JLabel("Number 2");
            Num2label.setBounds(50,100,100,30);

            Pobj = new JTextField();
            Pobj.setBounds(150,100,150,30);

            Aobj = new JButton("+");
            Aobj.setBounds(50, 150, 50, 30);

            bobj = new JButton("-");
            bobj.setBounds(110, 150, 50, 30);

            cobj = new JButton("*");
            cobj.setBounds(170, 150, 50, 30);

            dobj = new JButton("/");
            dobj.setBounds(230, 150, 50, 30);

            Resultlabel = new JLabel("Result : ");
            Resultlabel.setBounds(50, 200, 250, 30);

            fobj.add(Aobj);
            fobj.add(bobj);
            fobj.add(cobj);
            fobj.add(dobj);
            fobj.add(tobj);
            fobj.add(Pobj);
            fobj.add(Num1label);
            fobj.add(Num2label);
            fobj.add(Resultlabel);


            Aobj.addActionListener(this);
            bobj.addActionListener(this);
            cobj.addActionListener(this);
            dobj.addActionListener(this);

            fobj.setLayout(null);
            fobj.setSize(width,height);

            fobj.setVisible(true);
            fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public void actionPerformed(ActionEvent aobj)
        {
            
            int num1 = Integer.parseInt(tobj.getText());
            int num2 = Integer.parseInt(Pobj.getText());
            double result = 0;

            if (aobj.getSource() == Aobj)
                result = num1 + num2;
            else if (aobj.getSource() == bobj)
                result = num1 - num2;
            else if (aobj.getSource() == cobj)
                result = num1 * num2;
            else if (aobj.getSource() == dobj)
                result = num1 / num2;

            Resultlabel.setText("Result: " + result);
            
        }           
}



class CalculatorFrame
{
    public static void main(String[] args) 
    {
        MarvellousLogin mobj = new MarvellousLogin("Calculator",400,300);
        
    }
}