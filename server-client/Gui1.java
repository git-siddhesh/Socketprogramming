import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
class Gui1 implements ActionListener
{
JFrame f;
JFrame f2;
JFrame f1;
JFrame f3;
JRadioButton c1;
JRadioButton c2;
JComboBox cb;
ButtonGroup bg;
JTextField t5;
JTextField t4;
JTextField t3;
JTextField t2;
JTextField t1;
JPasswordField t6;
JPasswordField t7;
JTextField ta;
JPasswordField tb;
String p;
String lp;
Gui1()
{

   
f=new JFrame("Gui1");
f.setSize(2500,1180);
f.setVisible(true);
f.setLayout(null);

// heading
JLabel heaading=new JLabel(" Bank Account Application");
heaading.setBounds(200,20,800,80);
heaading.setFont(new Font("Cambria",Font.BOLD,50));
heaading.setForeground(Color.BLUE);
f.getContentPane().add(heaading);

// login
JButton login=new JButton("Login");
login.setActionCommand("ab");
login.addActionListener(this);
login.setBounds(100,300,200,50);
login.setFont(new Font("Cambria",Font.BOLD,30));
f.getContentPane().add(login);

//signup
JButton signup=new JButton("Signup");
signup.setActionCommand("ac");
signup.addActionListener(this);
signup.setBounds(100,400,200,50);
signup.setFont(new Font("Cambria",Font.BOLD,30));
f.getContentPane().add(signup);

//exit
JButton exit=new JButton("Exit");
exit.setActionCommand("ad");
exit.addActionListener(this);
exit.setBounds(100,500,200,50);
exit.setFont(new Font("Cambria",Font.BOLD,30));
f.getContentPane().add(exit);
}
public static void main(String args[])
{
Gui1 g=new Gui1();
}
public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();
if(s=="ac")
   {
     //frame
f1=new JFrame("Java");
f1.setSize(2500,1180);
f1.setVisible(true);
f1.setLayout(null);

//heading
JLabel heading=new JLabel("Signup Page");
heading.setBounds(150,10,400,70);
heading.setFont(new Font("Cambria",Font.BOLD,50));
heading.setForeground(Color.RED);
f1.getContentPane().add(heading);


// name
JLabel name=new JLabel("Name");
name.setBounds(100,150,170,40);
name.setFont(new Font("Cambria",Font.BOLD,20));
f1.getContentPane().add(name);


//address
JLabel address=new JLabel("Address");
address.setBounds(100,200,270,40);
address.setFont(new Font("Cambria",Font.BOLD,20));
f1.getContentPane().add(address);

// adhar no.
JLabel adhar=new JLabel("Adhar Number");
adhar.setBounds(100,250,270,40);
adhar.setFont(new Font("Cambria",Font.BOLD,20));
f1.getContentPane().add(adhar);

// mobile number
JLabel mobile=new JLabel("Mobile Number");
mobile.setBounds(100,300,270,40);
mobile.setFont(new Font("Cambria",Font.BOLD,20));
f1.getContentPane().add(mobile);

//email id
JLabel email=new JLabel("Email Id");
email.setBounds(100,350,270,40);
email.setFont(new Font("Cambria",Font.BOLD,20));
f1.getContentPane().add(email);



// gender
JLabel gender=new JLabel("Gender");
gender.setBounds(100,400,200,40);
gender.setFont(new Font("Cambria",Font.BOLD,20));
f1.getContentPane().add(gender);


//radio buttonfor gender
bg=new ButtonGroup();
c1=new JRadioButton("Male");
c1.setBounds(400,400,100,40);
c1.setFont(new Font("Cmabrai",Font.BOLD,20));
bg.add(c1);
f1.getContentPane().add(c1);

//Radio button for gender
c2=new JRadioButton("Female");
c2.setBounds(520,400,120,40);
c2.setFont(new Font("Cmabrai",Font.BOLD,20));
bg.add(c2);
f1.getContentPane().add(c2);


// password
JLabel password=new JLabel("Password");
password.setBounds(100,450,170,40);
password.setFont(new Font("Cambraia",Font.BOLD,20));
f1.getContentPane().add(password);

//Confirm password
JLabel confirm=new JLabel("Confirm Password");
confirm.setBounds(100,500,170,40);
confirm.setFont(new Font("Cambria",Font.BOLD,20));
f1.getContentPane().add(confirm);

//Account type and its option menu or combo box
JLabel account=new JLabel("Account");
account.setBounds(100,550,270,40);
account.setFont(new Font("Cmabria",Font.BOLD,20));
f1.getContentPane().add(account);

String acc[]={"Current Account","Saving Account",};
cb=new JComboBox(acc);
cb.setBounds(400,550,270,40);
cb.setFont(new Font("Cambria",Font.BOLD,20));
f1.getContentPane().add(cb);

   //text field for name
t1=new JTextField();
t1.setBounds(400,150,170,40);

f1.getContentPane().add(t1);

//text field for address
t2=new JTextField();
t2.setBounds(400,200,170,40);

f1.getContentPane().add(t2);

//text for adhar number
t3=new JTextField();
t3.setBounds(400,250,170,40);

f1.getContentPane().add(t3);

//text field for mobile number
t4=new JTextField();
t4.setBounds(400,300,170,40);
//a4=t4.getText();
f1.getContentPane().add(t4);

//text field for email id
t5=new JTextField();
t5.setBounds(400,350,170,40);
//a5=t5.getText();
f1.getContentPane().add(t5);

//text field for password
t6=new JPasswordField();
t6.setBounds(400,450,170,40);
//a6=new String(t6.getPassword());
f1.getContentPane().add(t6);

//text field for confirm password
t7=new JPasswordField();
t7.setBounds(400,500,170,40);
//a7=new String(t6.getPassword());
f1.getContentPane().add(t7);

// backe ednd coding



//submit button
JButton submit=new JButton("Submit");
submit.setBounds(800,600,200,40);
submit.setActionCommand("xc");
submit.addActionListener(this);
   submit.setFont(new Font("Cambria",Font.BOLD,30));
f1.getContentPane().add(submit);
JButton back=new JButton("Back");
back.setActionCommand("an");
back.addActionListener(this);
back.setBounds(1100,600,200,40);
back.setFont(new Font("Cambria",Font.BOLD,30));
f1.getContentPane().add(back);
}
//s=e.getActionCommand();
//System.out.println(s);
else if(s=="xc")
{String a1=t1.getText();
String a2=t2.getText();
String a3=t3.getText();
String a4=t4.getText();
String a5=t5.getText();
String a6=new String(t6.getPassword());
String a7=new String(t7.getPassword());
System.out.println(a1+" ");
System.out.println(a3+" "+a4);
System.out.println(a5+" "+a6);
System.out.println(a7+" "+a2);



if(a1.length()!=0&&a2.length()!=0&&a3.length()!=0&&a4.length()!=0&&a5.length()!=0&&a6.equals(a7))
       
{
try{  
//Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/zeetron","root","");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
String q=String.format("insert into info values('%s','%s','%s','%s','%s','%s',0)",a1,a2,a3,a4,a5,a6);
stmt.executeUpdate(q);  
JOptionPane.showMessageDialog(f2, "account successfully created","message",JOptionPane.OK_CANCEL_OPTION);
System.out.print("value inserted");

con.close();  
}catch(Exception e1)
{ System.out.println("1 try block");}  
}  







// back button

}

else if(s=="ab")
{
//frame
   f2=new JFrame("Login");
f2.setSize(2550,1180);
f2.setVisible(true);
f2.setLayout(null);

// login heading
JLabel lheading=new JLabel("Login Page");
lheading.setBounds(300,100,500,70);
lheading.setFont(new Font("Cambria",Font.BOLD,50));
lheading.setForeground(Color.BLUE);
f2.getContentPane().add(lheading);

//email
JLabel emailid=new JLabel("Email-Id");
emailid.setBounds(100,300,200,40);
emailid.setFont(new Font("Cambria",Font.BOLD,20));
f2.getContentPane().add(emailid);

//password
JLabel pasword=new JLabel("Password");
pasword.setBounds(100,400,200,40);
pasword.setFont(new Font("Cambria",Font.BOLD,20));
f2.getContentPane().add(pasword);

// emial id text field
ta=new JTextField();
ta.setBounds(400,300,200,40);
f2.getContentPane().add(ta);

//password text field
tb=new JPasswordField();
tb.setBounds(400,400,200,40);
f2.getContentPane().add(tb);

// ok Button
JButton ok=new JButton("OK");
ok.setBounds(600,600,200,50);
ok.setActionCommand("av");
ok.addActionListener(this);
ok.setFont(new Font("Cambria",Font.BOLD,30));
ok.setForeground(Color.RED);
f2.getContentPane().add(ok);

// back button
JButton b=new JButton("Back");
b.setActionCommand("am");
b.addActionListener(this);
b.setBounds(900,600,200,50);
b.setFont(new Font("Cambria",Font.BOLD,30));
b.setForeground(Color.RED);
f2.getContentPane().add(b);
}
else if(s=="ad")
f.dispose();

else if(s=="an")
f1.dispose();

else if(s=="av")
{
String le=ta.getText();
lp=new String(tb.getPassword());
try{  
//Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/zeetron","root","pass");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery(String.format("select c6 from info where c5='%s'",le));  
while(rs.next())  
p=rs.getString(1);  
System.out.println(p);
con.close();  
}catch(Exception e2){


System.out.println("hi");}  
if(p==null)
JOptionPane.showMessageDialog(f2, "wrong credentials","error",JOptionPane.ERROR_MESSAGE);
else if(p.equals(lp))
{
f3=new JFrame();
f3.setSize(2550,1180);
f3.setVisible(true);
f3.setLayout(null);

// heading
JLabel head=new JLabel("Your Have Logged In Your Account");
head.setBounds(100,50,900,60);
head.setFont(new Font("Cambria",Font.BOLD,50));
head.setForeground(Color.BLUE);
f3.getContentPane().add(head);

// check bank balance
JButton check=new JButton("Check Balance");
check.setBounds(150,300,400,50);
check.setFont(new Font("Cambria",Font.BOLD,40));
check.setForeground(Color.RED);
f3.getContentPane().add(check);

// Account Details
JButton details=new JButton("Account Details");
details.setBounds(150,450,400,50);
details.setFont(new Font("Cmabria",Font.BOLD,40));
details.setForeground(Color.RED);
f3.getContentPane().add(details);

// logut
JButton log=new JButton("Logout");
log.setBounds(600,700,200,50);
log.setFont(new Font("Cambria",Font.BOLD,40));
log.setForeground(Color.RED);
f3.getContentPane().add(log);

//back
JButton b1=new JButton("Back");
b1.setBounds(850,700,200,50);
b1.setActionCommand("ax");
b1.addActionListener(this);
b1.setFont(new Font("Cambria",Font.BOLD,40));
b1.setForeground(Color.RED);
f3.getContentPane().add(b1);
}
else
{
//JPanel panel=new JPanel();

}

}
else if(s=="am")
{f2.dispose();
}
else
{
}
       
}


}