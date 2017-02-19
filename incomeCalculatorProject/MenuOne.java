package incomeCalculatorProject;
import java.awt.*;
import javax.swing.*;

import java.text.NumberFormat;


public class MenuOne extends JFrame
{
	static NumberFormat cf = NumberFormat.getCurrencyInstance();


	public static void main(String[]args)
	{
		new MenuOne();
	}

	private JTextField text1;
	private JButton button1;
	private JButton button2;
	private JTextField text2;
	private JTextField text3;

	public MenuOne()
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int x = d.width / 3;
		int y = d.height / 3;
		this.setSize(500,200);
		this.setLocation(x,y);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Income Calculator");

		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("Welcome! Please enter an Hourly Wage:");
		text1 = new JTextField(3);
		JLabel label2 = new JLabel("Please enter number of hours a week:");
		text2 = new JTextField(3);
		JLabel label3 = new JLabel("Enter number of days a week you work");
		text3 = new JTextField(3);
		button1 = new JButton("Enter");
		button1.addActionListener(e -> buttonClick());
		button2 = new JButton("Back");
		button2.addActionListener(e -> buttonClickTwo());
		

		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label2);
		panel1.add(text2);
		panel1.add(label3);
		panel1.add(text3);
		panel1.add(button1);
		panel1.add(button2);
		this.add(panel1);

		this.setVisible(true);
	}

	public void buttonClick()
	{
		double hourly = Double.parseDouble(text1.getText());
		double hours = Double.parseDouble(text2.getText());
		double daysAWeek = Double.parseDouble(text3.getText());

		double days;
		double daily;
		double weekly;
		double biWeekly;
		double monthly;
		double yearly;
		
		days = ((hours)/(daysAWeek));
		daily = ((hourly)*(days));
		weekly = ((hourly) * hours);
		biWeekly = ((weekly) * 2);
		monthly = ((weekly) * 4);
		yearly = ((monthly) * 12);

		String msg = ("Daily: " + cf.format(daily) + "   Weekly:  " + cf.format(weekly) + "  Two Weeks:  " + cf.format(biWeekly) + "  Monthly:  " + cf.format(monthly) + "  Yearly:  " + cf.format(yearly));

		JOptionPane.showMessageDialog(button1, msg, "Your Results", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void buttonClickTwo()
	{
		MainMenu mm = new MainMenu();
	}
	
	
}
