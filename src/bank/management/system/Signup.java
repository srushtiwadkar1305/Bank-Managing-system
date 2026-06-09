package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.smartcardio.CardTerminals;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;

    JButton next;

    JTextField textName, textFname, textEmail, textAddress, textCity, textPincode,textState;

    JDateChooser dateChooser;

    Random ran = new Random();

    long first4 =(ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader .getSystemResource("Icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel l1 = new JLabel("APPLICATION FORM NO."+first);
        l1.setBounds(160,20,600,40);
        l1.setFont(new Font("Rale way",Font.BOLD,38));
        add(l1);

        JLabel l2 = new JLabel("Page 1");
        l2.setBounds(380,70,600,40);
        l2.setFont(new Font("Rale way",Font.BOLD,22));
        add(l2);

        JLabel l3 = new JLabel("Personal Details");
        l3.setBounds(340,100,600,30);
        l3.setFont(new Font("Rale way",Font.BOLD,20));
        add(l3);

        JLabel lname = new JLabel("Name :");
        lname.setBounds(100,190,100,30);
        lname.setFont(new Font("Rale way",Font.BOLD,20));
        add(lname);

        textName = new JTextField();
        textName.setFont(new Font("Rale way",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel lfname = new JLabel("Father's Name :");
        lfname.setBounds(100,240,200,30);
        lfname.setFont(new Font("Rale way",Font.BOLD,20));
        add(lfname);

        textFname = new JTextField();
        textFname.setFont(new Font("Rale way",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date Of Birth :");
        DOB.setBounds(100,340,200,30);
        DOB.setFont(new Font("Rale way",Font.BOLD,20));
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel lgender = new JLabel("Gender :");
        lgender.setBounds(100,290,200,30);
        lgender.setFont(new Font("Rale way",Font.BOLD,20));
        add(lgender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Rale way",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Rale way",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel lEmail = new JLabel("Email Address :");
        lEmail.setBounds(100,390,200,30);
        lEmail.setFont(new Font("Rale way",Font.BOLD,20));
        add(lEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Rale way",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel lMS = new JLabel("Married Status :");
        lMS.setBounds(100,440,200,30);
        lMS.setFont(new Font("Rale way",Font.BOLD,20));
        add(lMS);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Rale way",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2 = new JRadioButton(" Un Married");
        m2.setFont(new Font("Rale way",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,150,30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Rale way",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(635,440,100,30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel address = new JLabel("Address :");
        address.setBounds(100,490,200,30);
        address.setFont(new Font("Rale way",Font.BOLD,20));
        add(address);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Rale way",Font.BOLD,14));
        textAddress.setBounds(300,490,400,30);
        add(textAddress);

        JLabel city = new JLabel("City :");
        city.setBounds(100,540,200,30);
        city.setFont(new Font("Rale way",Font.BOLD,20));
        add(city);

        textCity= new JTextField();
        textCity.setFont(new Font("Rale way",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel pin = new JLabel("Pin Code :");
        pin.setBounds(100,590,200,30);
        pin.setFont(new Font("Rale way",Font.BOLD,20));
        add(pin);

        textPincode= new JTextField();
        textPincode.setFont(new Font("Rale way",Font.BOLD,14));
        textPincode.setBounds(300,590,400,30);
        add(textPincode);

        JLabel state = new JLabel("State :");
        state.setBounds(100,640,200,30);
        state.setFont(new Font("Rale way",Font.BOLD,20));
        add(state);

        textState= new JTextField();
        textState.setFont(new Font("Rale way",Font.BOLD,14));
        textState.setBounds(300,640,400,30);
        add(textState);

        next = new JButton("Next");
        next.setBounds(620,710,80,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Rale way",Font.BOLD,14));
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String Name = textName.getText();
        String Fname = textFname.getText();
        String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String Gender = null;
        if (r1.isSelected()){
            Gender = "Male";
        } else if (r2.isSelected()) {
            Gender = "Female";
        }
        String Email = textEmail.getText();
        String MarriedStatus = null;
        if (m1.isSelected()){
            MarriedStatus = "Married";
        } else if (m2.isSelected()) {
            MarriedStatus = "un Married";
        } else if (m3.isSelected()) {
            MarriedStatus = "other";
        }

        String Address = textAddress.getText();
        String City = textCity.getText();
        String Pincode = textPincode.getText();
        String State = textState.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Con con1 = new Con();
                if (con1.connection == null){
                    JOptionPane.showMessageDialog(null,"Database connection failed");
                    return;
                }
                String q = "insert into signup values('"+formno+"','"+Name+"','"+Fname+"','"+DOB+"','"+Gender+"','"+Email+"','"+MarriedStatus+"','"+Address+"','"+City+"','"+Pincode+"','"+State+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            JOptionPane.showMessageDialog(null,"SQL Error:"+E.getMessage());
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
