import java.awt.BorderLayout;
import java.awt.Dimension;
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
	JButton login = new JButton("Login");
	JButton reset = new JButton("Reset");
	
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
		add(login, BorderLayout.SOUTH);
		add(reset);
		
		setVisible(true);
		pack();
	}
}
