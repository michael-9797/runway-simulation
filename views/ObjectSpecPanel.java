package views;

import controllers.*;
import models.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ObjectSpecPanel extends JPanel {
	
	private MainController controller;
	
	private final int[] rowHeights = new int[]{45, 30, 30, 30, 30, 30};
	
	private JTextField nameField, descField;
	private JSpinner widthField, heightField;
	private JButton objectSubmitButton;
	
	public ObjectSpecPanel(MainController controller) {
		this.controller = controller;
		init();
	}
	
	private void init() {
		GridBagLayout gbl = new GridBagLayout();
		gbl.rowHeights = rowHeights;
		this.setLayout(gbl);
		/* Left side */
		this.add(UIFactories.TitleLabel("Enter Object Specification"), UIFactories.TitleConstraints());
		
		this.add(new JLabel("Object Name"), UIFactories.LabelConstraints(0, 1));
		
		this.add(new JLabel("Object Description"), UIFactories.LabelConstraints(0, 2));
		
		this.add(new JLabel("Object Width (m)"), UIFactories.LabelConstraints(0, 3));
		
		this.add(new JLabel("Object Height (m)"), UIFactories.LabelConstraints(0, 4));
		
		objectSubmitButton = new JButton("Add Object");
		objectSubmitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				String name = nameField.getText();
				String desc = descField.getText();
				int width  = (int) widthField.getValue();
				int height = (int) heightField.getValue();
				controller.addRunwayObject(new RunwayObject(name, desc, width, height));
				UIFactories.NotificationDialog("Added new Object '" + name + "'", "Object Added");
				
				nameField.setText("");
				descField.setText("");
				widthField.setValue(0);
				heightField.setValue(0);
			}
		});
		this.add(objectSubmitButton, UIFactories.TextFieldConstraints(0, 5));
		/* Right side */
		nameField = UIFactories.TextField();
		this.add(nameField, UIFactories.TextFieldConstraints(1, 1));
		
		descField = UIFactories.TextField();
		this.add(descField, UIFactories.TextFieldConstraints(1, 2));
		
		widthField = UIFactories.Spinner();
		this.add(widthField, UIFactories.TextFieldConstraints(1, 3));
		
		heightField = UIFactories.Spinner();
		this.add(heightField, UIFactories.TextFieldConstraints(1, 4));
	}
}
