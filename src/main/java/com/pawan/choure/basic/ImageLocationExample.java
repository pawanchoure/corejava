package com.pawan.choure.basic;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImageLocationExample {

	public static void main(String[] args) throws Exception {
		URL imageLocation = new URL("https://fbcdn-photos-f-a.akamaihd.net/hphotos-ak-ash3/t1.0-0/1948093_10203199746131798_71803829_s.jpg");
				JOptionPane.showMessageDialog(null, "Hello", "Title",
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
				System.exit(0);

	}

}
