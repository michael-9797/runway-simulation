package views;

import controllers.*;
import models.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.ArrayList;

public class RecalcPanel extends JPanel {
	
	private final int[] rowHeights = new int[]{45, 30, 30, 30, 30};
	
	private JComboBox<Runway> runwayBox;
	private JComboBox<Object> objectBox;
	private JSpinner odftField;
	private JCheckBox breakdownCheckBox;
	private JButton submitButton;
	
	
	public RecalcPanel() {
		init();
	}
	
	private void init() {
		GridBagLayout gbl = new GridBagLayout();
		gbl.rowHeights = rowHeights;
		this.setLayout(gbl);
		/* Left side */
		this.add(UIFactories.TitleLabel("Recalculate Runway Distances"), UIFactories.TitleConstraints());
		
		this.add(new JLabel("Select Runway"), UIFactories.LabelConstraints(0, 1));
		
		this.add(new JLabel("Select Object"), UIFactories.LabelConstraints(0, 2));
		
		this.add(new JLabel("ODFT (m)"), UIFactories.LabelConstraints(0, 3));
		
		submitButton = new JButton("Recalculate");
		submitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				Runway runway = (Runway) runwayBox.getSelectedItem();
				UIFactories.TableDialog(runway);
			}
		});
		this.add(submitButton, UIFactories.TextFieldConstraints(0, 4));
		/* Right side */
		runwayBox = new JComboBox<Runway>();
		this.add(runwayBox, UIFactories.TextFieldConstraints(1, 1));
		
		objectBox = new JComboBox<Object>();
		this.add(objectBox, UIFactories.TextFieldConstraints(1, 2));
		
		odftField = UIFactories.Spinner();
		this.add(odftField, UIFactories.TextFieldConstraints(1, 3));
		
		breakdownCheckBox = new JCheckBox("Show Complete Breakdown");
		this.add(breakdownCheckBox, UIFactories.TextFieldConstraints(1, 4));
	}
	
	public void updateRunwayModel(ArrayList<Runway> runways) {
		runwayBox.removeAllItems();
		for(Runway r : runways) {
			runwayBox.addItem(r);
		}
	}
	
	public void updateObjectModel(ArrayList<RunwayObject> objects) {
		objectBox.removeAllItems();
		for(RunwayObject o : objects) {
			objectBox.addItem(o);
		}
	}
}
