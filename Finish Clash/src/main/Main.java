package main;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Finish Clash");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponentsToPane(frame.getContentPane());
		frame.setSize(new Dimension(1280,720));
		frame.setLocationRelativeTo(null);
		//frame.pack();
		//frame.setResizable(false);
		frame.setVisible(true);
	}
	
	private static void addComponentsToPane(Container pane) {
		String[] TH = {"1","2","3","4","5","6","7","8","9","10"};
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(10,10,10,10);
		pane.add(new JLabel("Town Hall lvl"), c);
		c.gridx = 1;
		pane.add(new JComboBox<String>(TH), c);
	}
}