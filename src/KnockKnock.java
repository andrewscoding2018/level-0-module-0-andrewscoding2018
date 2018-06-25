import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Knock Knock");
		String there = JOptionPane.showInputDialog("Ask Who's there?");
		if (there.equals("Who's there?")) {
			JOptionPane.showMessageDialog(null, "Adore.");
		String who = JOptionPane.showInputDialog("Ask Adore who?");
			if (who.equals("Adore who?"))
			{
				JOptionPane.showMessageDialog(null, "Adore is between us. Open it!");
			}
			else
			{
			JOptionPane.showMessageDialog(null, "You idiot. ");
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "You idiot. You're supposed to write Who's there?");
		}
	}
}
