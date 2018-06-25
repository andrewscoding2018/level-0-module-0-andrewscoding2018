import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	if(name.equals("Andrew"))
	{
		JOptionPane.showMessageDialog(null, "You are smart!!");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "I don't know you.");
	}
}
}
