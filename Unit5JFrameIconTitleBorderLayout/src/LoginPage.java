import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.*;

public class LoginPage extends JFrame {

	final List<Image> icons = new ArrayList<Image>();
	JTextField jtxUserName = new JTextField(25);
	JPasswordField jpwPassword = new JPasswordField(25);
	JLabel jlblUserName = new JLabel("USER NAME");
	JLabel jlblPassword = new JLabel("PASSWORD");
	JButton jbtLogin = new JButton("Login");
	JButton jbtReset = new JButton("Reset");
	JPanel jplLabelPanel = new JPanel();
	JPanel jplButtonPanel = new JPanel();
	JPanel jplControlPanel = new JPanel();
	
	public LoginPage() {
		super("ATM Authentiation");
		try {
			URL url16 = new URL("http://i.stack.imgur.com/m0KKu.png");
			URL url32 = new URL("http://i.stack.imgur.com/LVVMb.png");
			try {
				icons.add(ImageIO.read(url16));
				icons.add(ImageIO.read(url32));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Cannot read the image!");
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("URL is broken!");
		}
		setIconImages(icons);
		//set application to full screen
		Toolkit tk = Toolkit.getDefaultToolkit();
		int xSize = ((int) tk.getScreenSize().getWidth());
		int ySize = ((int) tk.getScreenSize().getHeight());
		setPreferredSize(new Dimension(xSize, ySize));
		setLayout(new FlowLayout());
		
		jplLabelPanel.add(jlblUserName);
		jplLabelPanel.add(jtxUserName);
		jplLabelPanel.add(jlblPassword);
		jplLabelPanel.add(jpwPassword);
		
		jplButtonPanel.add(jbtLogin);
		jplButtonPanel.add(jbtReset);
		
		jplControlPanel.setLayout(new BorderLayout());
		
		jplControlPanel.add(jplLabelPanel, BorderLayout.CENTER);
		jplControlPanel.add(jplButtonPanel, BorderLayout.SOUTH);
		
		add(jplControlPanel);
		setVisible(true);
		pack();
	}
}
