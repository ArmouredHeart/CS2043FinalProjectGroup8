import javax.swing.*;
import java.awt.*;

public class loginMain extends Frame implements WindowListener,ActionListener{
	public static void main(String[] args) {
		DataManager dm = new DataManager();
		loginControl control = new loginControl(dm);
		loginUI ui = new loginUI(control);
		
		
		
		ui.displayLoginForm();
		ui.enterUserIdPassword();
	}
}
