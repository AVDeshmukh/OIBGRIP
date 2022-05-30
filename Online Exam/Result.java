import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Result extends JFrame implements ActionListener
{
	JLabel a,b,c,d,e,f;
		
	Result(int n,long tm)
	{
		super("Score");
		double ad=tm*Math.pow(10, -9);
		int as=-1*(int)ad;
		a=new JLabel("Name of Student: Anurag Deshmukh");
		b=new JLabel("Roll No : AV203325");
		c=new JLabel("Correct : "+(n));
		d=new JLabel("Incorrect : "+(10-n));
		
		e=new JLabel("Total Score : "+n*10+" out of 100");
		f=new JLabel("Time Taken : "+as+" Seconds");
		
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
		a.setBounds(60,40,450,20);
		b.setBounds(60,80,200,20);
		c.setBounds(60,110,200,20);
		d.setBounds(60,140,200,20);
		e.setBounds(60,170,200,20);
		f.setBounds(60,200,200,20);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
	
	public static void main(String s[])
	{
		new Result(5,1);
	}


}
