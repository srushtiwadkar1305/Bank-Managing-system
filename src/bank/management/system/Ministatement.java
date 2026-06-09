package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Ministatement extends JFrame implements ActionListener {

    String pin;

    JButton b1;

    Ministatement(String pin){
        this.pin = pin;
        System.out.println("PIN RECIVED = ["+pin+"]");

        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(new Color(255,204,204));
        setLayout(null);

        JLabel l1  = new JLabel();
        l1.setBounds(20,140,400,290);
        add(l1);

        JLabel l2  = new JLabel("OP Banking");
        l2.setFont(new Font("System",Font.BOLD,15));
        l2.setBounds(150,20,200,20);
        add(l2);

        JLabel l3  = new JLabel();
        l3.setBounds(20,80,300,20);
        add(l3);

        JLabel l4  = new JLabel();
        l4.setBounds(20,450,300,20);
        add(l4);

        try{
            Con c = new Con();
            System.out.println("PIN RECIVED = ["+pin+"]");
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            if (resultSet.next()){
                l3.setText("Card Number: "+resultSet.getString("cardno").substring(0,4) + "XXXXXXXX" + resultSet.getString("cardno").substring(12));
            }

        }catch (Exception e){

            e.printStackTrace();

        }

        try{
            int balance = 0;
            Con c = new Con();
            ResultSet resultset = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");

            while (resultset.next()){

                l1.setText(l1.getText() + "<html>"+resultset.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultset.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultset.getString("amount")+ "<br><br><html>");

                if (resultset.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultset.getString("amount"));

                }else {
                    balance -= Integer.parseInt(resultset.getString("amount"));
                }

            }
           l4.setText("Your Total Balance is Rs "+balance);

        }catch (Exception e){
            e.printStackTrace();
        }

        b1 = new JButton("Exit");
        b1.setBounds(20,500,100,25);
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new Ministatement("");
    }
}
