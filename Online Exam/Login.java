import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class intern implements ActionListener
{
		JFrame f;
		JLabel l1,l2;
		JTextField t1;
		JPasswordField t2;
		JButton b1,b2;
		OnlineTest M;
		Login()
		{
			f=new JFrame("Login");
			f.getContentPane().setLayout(null);
			f.getContentPane().setBackground(Color.black);
			l1=new JLabel("User Name");
			l1.setForeground(Color.yellow);
			l1.setBounds(50,50,100,30);
			l2=new JLabel("Password");
			l2.setForeground(Color.yellow);
			l2.setBounds(50,80,100,30);
			t1=new JTextField(10);
			t1.setForeground(Color.blue);
			t1.addActionListener(this);
			t1.setBounds(150,50,100,30);
			t2=new JPasswordField(10);
			t2.setForeground(Color.blue);
			t2.setEchoChar('*');
			t2.addActionListener(this);
			t2.setBounds(150,80,100,30);
			b1=new JButton("Ok");
			b1.setForeground(Color.blue);
			b1.addActionListener(this);
			b1.setBounds(50,120,100,30);
			b2=new JButton("Cancel");
			b2.setForeground(Color.blue);
			b2.addActionListener(this);
			b2.setBounds(180,120,100,30);
			
			b1.setMnemonic('O');
			b2.setMnemonic('C');
			
			f.getContentPane().add(l1);
			f.getContentPane().add(l2);
			f.getContentPane().add(t1);
			f.getContentPane().add(t2);
			f.getContentPane().add(b1);
			f.getContentPane().add(b2);
			f.setBounds(300,300,300,200);
			f.setResizable(false);
			f.setVisible(true);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{
				if(t1.getText().length()==0||t2.getText().length()==0)
				{
					JOptionPane.showMessageDialog(null,"Fields are empty");
				}
				
				
				else if(t1.getText().equals("anurag") && t2.getText().equals("ad"))
				{
					JOptionPane.showMessageDialog(null,"Logged in Successfully");
					f.setVisible(false);
					long st=System.nanoTime();
					M=new OnlineTest("Online Test of Java",st);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"UserName or Password is Incorrect");
				}
			}
			
			if(e.getSource()==b2)
			{
				f.setVisible(false);
				System.exit(0);
			}
		}
		public static void main(String args[]) {
	        
	       new Login();
	    }
}
 