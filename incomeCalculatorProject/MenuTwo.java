package incomeCalculatorProject;
import java.awt.*;
import javax.swing.*;
import java.text.NumberFormat;

public class MenuTwo extends JFrame
{
	static NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	public static void main(String[] args) 
	{
		new MenuTwo();
	}
	
	private JButton button1;
	private JButton button2;
	private JTextField text1;
	private JTextField text2;
	
	public MenuTwo()
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int x = d.width/3;
		int y = d.height/3;
		this.setSize(500,200);
		this.setLocation(x,y);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Salery to Hourly");
		
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("Please Enter Yearly Salery");
		JLabel label2 = new JLabel("Please Enter Average Weekly Hours of Work");
		text1 = new JTextField(8);
		text2 = new JTextField(8);
		button1 = new JButton("Enter");
		button1.addActionListener(e -> buttonClick());
		button2 = new JButton("Back");
		button2.addActionListener(e -> buttonClickTwo());
		
		panel1.add(label1);
		panel1.add(text1);
		panel1.add(label2);
		panel1.add(text2);
		panel1.add(button1);
		panel1.add(button2);
		this.add(panel1);
		
		this.setVisible(true);
		
	}
	
	public void buttonClick()
	{
		double salary = Double.parseDouble(text1.getText());                      //Needs a catch statement for hours being bigger then salary
		double hours = Double.parseDouble(text2.getText());
		                                                                         
		                                                                         //Needs a catch statement for none numbers being entered into text field, and 0 in hours of work wont work 
		double monthly;
		double biMonthly;
		double weekly;
		double daily;
		double hourly;
		double year = 8760;
		double weekHours = 168;
		double workHourPercentage;
		double anHour;
		double yearly;
		
		
		workHourPercentage = ((hours)/(weekHours));
		hourly = ((workHourPercentage)*(year));
		anHour = ((salary)/(hourly));
		weekly = ((hours)*(anHour));
		daily = ((weekly)/(5));
		biMonthly = ((weekly)*(2));
		monthly = ((weekly)*(4));
		yearly = ((weekly)*(52));

		
		String msg = ("Every Hour: " + nf.format(anHour) + "   Every Day: " + nf.format(daily) + "   Every Week: " + nf.format(weekly) + "   Every Two Weeks: " + nf.format(biMonthly) + "   Every Month: " + nf.format(monthly) + "   Every Year: " + nf.format(yearly));
		
		
		JOptionPane.showMessageDialog(button1, msg, "Your Results", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void buttonClickTwo()
	{
		MainMenu mm = new MainMenu();
	}

}
