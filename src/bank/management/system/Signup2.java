package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textpan, textaadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;

    String formno;

    Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader .getSystemResource("Icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setBounds(300,30,600,40);
        l1.setFont(new Font("Rale way",Font.BOLD,22));
        add(l1);

        JLabel l2 = new JLabel("Additional Detail");
        l2.setBounds(300,60,600,40);
        l2.setFont(new Font("Rale way",Font.BOLD,22));
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setBounds(100,120,100,30);
        l3.setFont(new Font("Rale way",Font.BOLD,18));
        add(l3);

        String religion [] = {"Hindu","Muslim","Sikh","Christan","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Rale way",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setBounds(100,170,100,30);
        l4.setFont(new Font("Rale way",Font.BOLD,18));
        add(l4);

        String Category [] = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Rale way",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 =new JLabel("Income :");
        l5.setBounds(100,220,100,30);
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        add(l5);

        String Income [] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","UPto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Rale way",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education :");
        l6.setBounds(100,270,150,30);
        l6.setFont(new Font("Rale way",Font.BOLD,18));
        add(l6);

        String Education [] = {"Non Graduate","Graduate","Post Graduate","Doctrate","Other"};
        comboBox4 = new JComboBox(Education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Rale way",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setBounds(100,320,150,30);
        l7.setFont(new Font("Rale way",Font.BOLD,18));
        add(l7);

        String Occupation [] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Rale way",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN No :");
        l8.setBounds(100,370,150,30);
        l8.setFont(new Font("Rale way",Font.BOLD,18));
        add(l8);

        textpan = new JTextField();
        textpan.setBounds(350,370,320,30);
        textpan.setBackground(new Color(252,208,76));
        textpan.setFont(new Font("Rale way",Font.BOLD,18));
        add(textpan);

        JLabel l9 = new JLabel("Aadhar No :");
        l9.setBounds(100,420,150,30);
        l9.setFont(new Font("Rale way",Font.BOLD,18));
        add(l9);

        textaadhar = new JTextField();
        textaadhar.setBounds(350,420,320,30);
        textaadhar.setBackground(new Color(252,208,76));
        textaadhar.setFont(new Font("Rale way",Font.BOLD,18));
        add(textaadhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setBounds(100,490,180,30);
        l10.setFont(new Font("Rale way",Font.BOLD,18));
        add(l10);

        r1 = new JRadioButton("yes");
        r1.setBackground(new Color(252,208,76));
        r1.setFont(new Font("Rale way",Font.BOLD,18));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,490,100,30);
        r2.setFont(new Font("Rale way",Font.BOLD,18));
        add(r2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(r1);
        buttonGroup2.add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Rale way",Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        l11.setBackground(new Color(252,208,76));
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setBackground(new Color(252,208,76));
        e1.setFont(new Font("Rale way",Font.BOLD,14));
        e1.setBounds(350,540,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setBackground(new Color(252,208,76));
        e2.setFont(new Font("Rale way",Font.BOLD,14));
        e2.setBounds(460,540,100,30);
        add(e2);

        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(e1);
        buttonGroup3.add(e2);

        JLabel l12 = new JLabel("Form No :");
        l12.setBounds(650,10,90,30);
        l12.setFont(new Font("Rale way",Font.BOLD,14));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Rale way",Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Rale way",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.black);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textpan.getText();
        String aadhar = textaadhar.getText();

        String scitizen = " ";
        if (r1.isSelected()){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }
        String eAccount = " ";
        if (e1.isSelected()){
            eAccount = "Yes";
        } else if (e2.isSelected()) {
            eAccount = "No";
        }


        try{
          if (textpan.getText().equals("") || textaadhar.getText().equals("")){
              JOptionPane.showMessageDialog(null,"Fill all the Fields");
          }else {
              Con con1 = new Con();
              String q1 = "insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
              con1.statement.executeUpdate(q1);
              new Signup3(formno);
              setVisible(false);
          }


        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {

        new Signup2(" ");

    }
}
