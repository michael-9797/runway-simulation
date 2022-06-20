package views;

import java.awt.*;
import javax.swing.*;

import models.Runway;

public class UIFactories {
	
	private static final Font titleFont = new Font("Tahoma", Font.PLAIN, 20);
	private static final int textFieldColumns = 10;

	public static JLabel TitleLabel(String text) {
		JLabel label = new JLabel(text);
		label.setFont(titleFont);
		return label;
	}
	
	public static JSpinner Spinner() {
		SpinnerModel model = new SpinnerNumberModel(0, 0, 10000, 1);
		return new JSpinner(model);
	}
	
	public static JTextField TextField(int columns) {
		return new JTextField(columns);
	}
	
	public static JTextField TextField() {
		return TextField(textFieldColumns);
	}
	
	public static GridBagConstraints Constraints(int x, int y, int width, int fill) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.fill = fill;
		return gbc;
	}
	
	public static GridBagConstraints TitleConstraints() {
		return Constraints(0, 0, 2, GridBagConstraints.VERTICAL);
	}
	
	public static GridBagConstraints LabelConstraints(int x, int y) {
		return Constraints(x, y, 1, GridBagConstraints.VERTICAL);
	}
	
	public static GridBagConstraints TextFieldConstraints(int x, int y) {
		return Constraints(x, y, 1, GridBagConstraints.BOTH);
	}
	
	public static void NotificationDialog(String text, String title) {
		JOptionPane.showMessageDialog(new JFrame(), text, title, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void TableDialog(Runway runway) {
		JDialog dialog = new JDialog();
		dialog.add(new CalcTablePanel(runway));
		dialog.pack();
		dialog.setVisible(true);
	}
}
