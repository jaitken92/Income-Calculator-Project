package incomeCalculatorProject;
import javax.swing.*;
import java.awt.*;

public class MenuThree extends JFrame
{

	public static void main(String[] args) 
	{
		new MenuThree();

	}
	
	private JButton button1;
	
	public MenuThree()
	{
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int x = d.width/3;
		int y = d.width/3;
		this.setSize(500,200);
		this.setLocation(x,y);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("National Household Average");
		
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel(" National Household Average = $55,775 ");
		button1 = new JButton("Back");
		button1.addActionListener(e -> buttonClick());
		
		panel1.add(label1);
		panel1.add(button1);
		this.add(panel1);
		
		this.setVisible(true);
		
		
	}
	
	public void buttonClick()
	{
		MainMenu mm = new MainMenu();
	}
	
	

}
