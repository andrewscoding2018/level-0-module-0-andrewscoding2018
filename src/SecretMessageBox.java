import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String password = "incorrect";
		String secret = JOptionPane.showInputDialog("Tell me a secret.");
		

		for (int repeat = 0; repeat < 10; repeat++) {
			String enter = JOptionPane.showInputDialog("You can only see the message if you enter the password. ");
			if (password.equals(enter)) {
				JOptionPane.showMessageDialog(null, secret);
			} else {
				JOptionPane.showMessageDialog(null, "Your password is incorrect");
			}
		}
	JOptionPane.showMessageDialog(null, "You are an intruder!!!!!! Try again.");
	}
}
