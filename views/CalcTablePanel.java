package views;

import controllers.*;
import models.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class CalcTablePanel extends JPanel {
	
	public CalcTablePanel(Runway runway) {
		init(runway);
	}
	
	private void init(Runway runway) {
		DefaultTableModel model = new DefaultTableModel();
		Object[] data = {runway.getName(), runway.getTORA(), runway.getTODA(), runway.getASDA(), runway.getLDA(), 0};
		model.addRow(data);
		model.fireTableDataChanged();
		JTable table = new JTable(model);
		add(new JScrollPane(table));
	}
	
	public class RunwayTableModel extends AbstractTableModel {
		private String[] columnNames = {"Runway Name", "TORA (m)", "TODA (m)", "ASDA (m)", "LDA (m)", "Displaced Threshold"};
		private Object[][] data = new Object[1][columnNames.length];
		
		public int getColumnCount() {
	        return columnNames.length;
	    }

	    public int getRowCount() {
	        return data.length;
	    }

	    public String getColumnName(int col) {
	        return columnNames[col];
	    }

	    public Object getValueAt(int row, int col) {
	        return data[row][col];
	    }
	}
}
