package controllers;

import models.*;
import views.*;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class MainController {
	
	private ArrayList<Runway> runways;
	private ArrayList<RunwayObject> objects;
	
	private RunwaySpecPanel runwaySpecPanel;
	private ObjectSpecPanel objectSpecPanel;
	private RecalcPanel recalcPanel;
	
	public MainController() {
		runways = new ArrayList<Runway>();
		objects = new ArrayList<RunwayObject>();
	}

	public static void main(String[] args) {
		MainController mc = new MainController();
		mc.init();
	}
	
	private void init() {
		JFrame window = new JFrame();
		Container contentPanel = window.getContentPane();
		window.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
		
		runwaySpecPanel = new RunwaySpecPanel(this);
		contentPanel.add(runwaySpecPanel);
		objectSpecPanel = new ObjectSpecPanel(this);
		contentPanel.add(objectSpecPanel);
		recalcPanel = new RecalcPanel();
		contentPanel.add(recalcPanel);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
	}
	
	public void addRunway(Runway runway) {
		runways.add(runway);
		recalcPanel.updateRunwayModel(runways);
	}
	
	public void addRunwayObject(RunwayObject object) {
		objects.add(object);
		recalcPanel.updateObjectModel(objects);
	}
}
