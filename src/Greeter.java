import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Como se llama?");
	JOptionPane.showMessageDialog(null, name + " es un buen nombre!\n" + "Hola!");
}
}
