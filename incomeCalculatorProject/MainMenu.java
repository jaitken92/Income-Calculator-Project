package incomeCalculatorProject;
import java.awt.*;
import javax.swing.*;

import java.text.NumberFormat;



public class MainMenu extends JFrame
{
	
	
	static NumberFormat cf =  NumberFormat.getCurrencyInstance();
	
	public static void main(String[] args) 
	{
		new MainMenu();
		
	}
	
	private JButton Button1;
	private JButton Button2;
	private JButton Button3;
	
	public MainMenu()
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int x = d.width/3;
		int y = d.height/3;
		this.setSize(500,200);
		this.setLocation(x,y);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Income Calculator Main Menu");
		
		JPanel panel1 = new JPanel();
		Button1 = new JButton("Find Hourly Wage");
		Button2 = new JButton("Find Yearly Salary");
		Button3 = new JButton("National Averages");
		
		Button1.addActionListener(e -> buttonClickOne());
		Button2.addActionListener(e -> buttonClickTwo());
		Button3.addActionListener(e -> buttonClickThree());
		
		
		
		
		panel1.add(Button1);
		panel1.add(Button2);
		panel1.add(Button3);
		this.add(panel1);
		
		this.setVisible(true);
		
	}
	
	public void buttonClickOne()
	{
		MenuTwo mt = new MenuTwo();
	}
	
	public void buttonClickTwo()
	{
		MenuOne mo = new MenuOne();
	}

	public void buttonClickThree()
	{
		MenuThree mth = new MenuThree();
	}
	

}
