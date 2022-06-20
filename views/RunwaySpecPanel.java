package views;

import controllers.*;
import models.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RunwaySpecPanel extends JPanel {
	
	private MainController controller;
	
	private final int[] rowHeights = new int[]{45, 30, 30, 30, 30, 30};
	
	private JTextField nameField;
	private JSpinner toraField, todaField, asdaField, ldaField;
	private JButton submitButton;
	
	public RunwaySpecPanel(MainController controller) {
		this.controller = controller;
		init();
	}
	
	private void init() {
		GridBagLayout gbl = new GridBagLayout();
		gbl.rowHeights = rowHeights;
		this.setLayout(gbl);
		/* Left side */
		this.add(UIFactories.TitleLabel("Enter Runway Specification"), UIFactories.TitleConstraints());
		
		this.add(new JLabel("Name"), UIFactories.LabelConstraints(0, 1));
		
		this.add(new JLabel("TORA (m)"), UIFactories.LabelConstraints(0, 2));
		
		this.add(new JLabel("TODA (m)"), UIFactories.LabelConstraints(0, 3));
				
		this.add(new JLabel("ASDA (m)"), UIFactories.LabelConstraints(0, 4));

		this.add(new JLabel("LDA (m)"), UIFactories.LabelConstraints(0, 5));
		
		submitButton = new JButton("Add Runway");
		submitButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				String name = nameField.getText();
				int tora = (int) toraField.getValue();
				int toda = (int) todaField.getValue();
				int asda = (int) asdaField.getValue();
				int lda = (int) ldaField.getValue();
				controller.addRunway(new Runway(name, tora, toda, asda, lda));
				UIFactories.NotificationDialog("Added new Runway '" + name + "'", "Runway Added");
				
				nameField.setText("");
				toraField.setValue(0);
				todaField.setValue(0);
				asdaField.setValue(0);
				ldaField.setValue(0);
			}
		});
		this.add(submitButton, UIFactories.TextFieldConstraints(0, 6));
		
		/* Right side */
		nameField = UIFactories.TextField();
		this.add(nameField, UIFactories.TextFieldConstraints(1, 1));
		
		toraField = UIFactories.Spinner();
		this.add(toraField, UIFactories.TextFieldConstraints(1, 2));
		
		todaField = UIFactories.Spinner();
		this.add(todaField, UIFactories.TextFieldConstraints(1, 3));
		
		asdaField = UIFactories.Spinner();
		this.add(asdaField, UIFactories.TextFieldConstraints(1, 4));
		
		ldaField = UIFactories.Spinner();
		this.add(ldaField, UIFactories.TextFieldConstraints(1, 5));
	}
	
	
}
