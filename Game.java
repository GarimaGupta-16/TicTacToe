package Tictaktoe;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Game implements ActionListener
{
    JFrame jf;
    JButton jb1, jb2, jb3 , jb4, jb5, jb6, jb7, jb8, jb9;
    int count = 0;
    String str;
    boolean win = false;

    Game()
    {
        jf = new JFrame("TicTakToe");
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setLayout(new GridLayout(3,3));

        jb1 = new JButton();
        jb1.addActionListener(this);
        jf.add(jb1);

        jb2 = new JButton();
        jb2.addActionListener(this);
        jf.add(jb2);

        jb3 = new JButton();
        jb3.addActionListener(this);
        jf.add(jb3);

        jb4 = new JButton();
        jb4.addActionListener(this);
        jf.add(jb4);

        jb5 = new JButton();
        jb5.addActionListener(this);
        jf.add(jb5);

        jb6 = new JButton();
        jb6.addActionListener(this);
        jf.add(jb6);

        jb7= new JButton();
        jb7.addActionListener(this);
        jf.add(jb7);

        jb8 = new JButton();
        jb8.addActionListener(this);
        jf.add(jb8);

        jb9 = new JButton();
        jb9.addActionListener(this);
        jf.add(jb9);


        

        jf.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new Game();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        count = count+1;
        if(count%2 == 0)
        {
            str = "O";
        }
        else
        {
            str = "X";
        }
        if(e.getSource() == jb1)
        {
            enable(jb1, false);
            setFontOnButton(jb1);
            jb1.setText(str);
        }
        if(e.getSource() == jb2)
        {
            enable(jb2, false);
            setFontOnButton(jb2);
            jb2.setText(str);
        }if(e.getSource() == jb3)
        {
            enable(jb3, false); 
            setFontOnButton(jb3);
            jb3.setText(str);
        }if(e.getSource() == jb4)
        {
            enable(jb4, false); 
            setFontOnButton(jb4);
            jb4.setText(str);
        }if(e.getSource() == jb5)
        {
            enable(jb5, false); 
            setFontOnButton(jb5);
            jb5.setText(str);
        }if(e.getSource() == jb6)
        {
            enable(jb6, false);
            setFontOnButton(jb6);
            jb6.setText(str);
        }if(e.getSource() == jb7)
        {
            enable(jb7, false);
            setFontOnButton(jb7);
            jb7.setText(str);
        }if(e.getSource() == jb8)
        {
            enable(jb8, false);
            setFontOnButton(jb8);
            jb8.setText(str);
        }if(e.getSource() == jb9)
        {
            enable(jb9, false);
            setFontOnButton(jb9);
            jb9.setText(str);
        }
       
        end();
        win();
    }
     void setFontOnButton(JButton jb)
    {
        jb.setFont(new Font("Arial",1,40));
    }
    void enable(JButton jb,boolean b)
    {
        jb.setEnabled(b);
    }
    void end()
    {
        //horizontal
        if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb1.getText()!= "")
        {
            win = true;
        }
         else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb6.getText()!= "")
        {
            win = true;
        } 
        else if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb9.getText()!= "")
        {
            win = true;
        }
        //vertical
        else  if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb7.getText()!= "")
        {
            win = true;
        }
        else  if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb8.getText()!= "")
        {
           win = true;
        }
        else  if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb9.getText()!= "")
        {
            win = true;
        }
        //diagonal
        else  if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb9.getText()!= "")
        {
            win = true;
        }
        else  if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb7.getText()!= "")
        {
            win = true;
        }
        else
        {
            win = false;
        }
    }
    void win()
    {
        if(win == true)
        {
            JOptionPane.showMessageDialog(jf, str+" wins");
            restart();
        }
        else if(win==false && count==9)
        {
            JOptionPane.showMessageDialog(jf,"match draw");
            restart();
        }
    }
    void restart()
    {
        int i = JOptionPane.showConfirmDialog(jf, "Do you want to play again");
        if(i==0)
        {
            count = 0;
            str = "";
            win = false;

            buttonenable(true);
            buttontext();

        }
        else if(i==1)
        {
            System.exit(0);
        }
        else
        {
            buttonenable(false);
        }
    }
    void buttonenable(boolean b)
    {
        jb1.setEnabled(b);
        jb2.setEnabled(b);
        jb3.setEnabled(b);
        jb4.setEnabled(b);
        jb5.setEnabled(b);
        jb6.setEnabled(b);
        jb7.setEnabled(b);
        jb8.setEnabled(b);
        jb9.setEnabled(b);
    }
    void buttontext()
    {
        jb1.setText("");
        jb2.setText("");
        jb3.setText("");
        jb4.setText("");
        jb5.setText("");
        jb6.setText("");
        jb7.setText("");
        jb8.setText("");
        jb9.setText("");
    }

}
