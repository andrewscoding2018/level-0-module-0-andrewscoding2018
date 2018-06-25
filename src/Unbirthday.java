import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	String date = JOptionPane.showInputDialog("When is your birthday? (Answer with the name of the month + the number in the month)");
	if(date.equals("June 25"))
	{
	JOptionPane.showMessageDialog(null, "Happy birthday " + name + " !!!!!");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Happy early or belated birthday!!!!\n" + 
	"Watch this video : https//www.youtube.com/watch?v=iL2Wm-PcfPo);");
	}
}
}
