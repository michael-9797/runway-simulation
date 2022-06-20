import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Application {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Application() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 372, 607);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{178, 178, 0};
		gbl_panel.rowHeights = new int[]{45, 30, 29, 30, 30, 30, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblEnterRunwaySpecification = new JLabel("Enter Runway Specification");
		lblEnterRunwaySpecification.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEnterRunwaySpecification = new GridBagConstraints();
		gbc_lblEnterRunwaySpecification.gridwidth = 2;
		gbc_lblEnterRunwaySpecification.fill = GridBagConstraints.VERTICAL;
		gbc_lblEnterRunwaySpecification.insets = new Insets(0, 0, 5, 5);
		gbc_lblEnterRunwaySpecification.gridx = 0;
		gbc_lblEnterRunwaySpecification.gridy = 0;
		panel.add(lblEnterRunwaySpecification, gbc_lblEnterRunwaySpecification);
		
		JLabel lblTORA = new JLabel("TORA (m)");
		GridBagConstraints gbc_lblTORA = new GridBagConstraints();
		gbc_lblTORA.fill = GridBagConstraints.VERTICAL;
		gbc_lblTORA.insets = new Insets(0, 0, 5, 5);
		gbc_lblTORA.gridx = 0;
		gbc_lblTORA.gridy = 1;
		panel.add(lblTORA, gbc_lblTORA);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.BOTH;
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 1;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAsdam = new JLabel("ASDA (m)");
		GridBagConstraints gbc_lblAsdam = new GridBagConstraints();
		gbc_lblAsdam.fill = GridBagConstraints.VERTICAL;
		gbc_lblAsdam.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsdam.gridx = 0;
		gbc_lblAsdam.gridy = 2;
		panel.add(lblAsdam, gbc_lblAsdam);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblToda = new JLabel("TODA (m)");
		GridBagConstraints gbc_lblToda = new GridBagConstraints();
		gbc_lblToda.fill = GridBagConstraints.VERTICAL;
		gbc_lblToda.insets = new Insets(0, 0, 5, 5);
		gbc_lblToda.gridx = 0;
		gbc_lblToda.gridy = 3;
		panel.add(lblToda, gbc_lblToda);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.BOTH;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLdam = new JLabel("LDA (m)");
		GridBagConstraints gbc_lblLdam = new GridBagConstraints();
		gbc_lblLdam.fill = GridBagConstraints.VERTICAL;
		gbc_lblLdam.insets = new Insets(0, 0, 5, 5);
		gbc_lblLdam.gridx = 0;
		gbc_lblLdam.gridy = 4;
		panel.add(lblLdam, gbc_lblLdam);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 4;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Runway");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 5;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{178, 178, 0};
		gbl_panel_1.rowHeights = new int[]{45, 30, 30, 30, 30, 30, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblEnterObjectSpecification = new JLabel("Enter Object Specification");
		lblEnterObjectSpecification.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblEnterObjectSpecification = new GridBagConstraints();
		gbc_lblEnterObjectSpecification.gridwidth = 2;
		gbc_lblEnterObjectSpecification.fill = GridBagConstraints.VERTICAL;
		gbc_lblEnterObjectSpecification.insets = new Insets(0, 0, 5, 0);
		gbc_lblEnterObjectSpecification.gridx = 0;
		gbc_lblEnterObjectSpecification.gridy = 0;
		panel_1.add(lblEnterObjectSpecification, gbc_lblEnterObjectSpecification);
		
		JLabel lblObjectName = new JLabel("Object Name");
		GridBagConstraints gbc_lblObjectName = new GridBagConstraints();
		gbc_lblObjectName.fill = GridBagConstraints.VERTICAL;
		gbc_lblObjectName.insets = new Insets(0, 0, 5, 5);
		gbc_lblObjectName.gridx = 0;
		gbc_lblObjectName.gridy = 1;
		panel_1.add(lblObjectName, gbc_lblObjectName);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.fill = GridBagConstraints.BOTH;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 1;
		panel_1.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JLabel lblObjectDescription = new JLabel("Object Description");
		GridBagConstraints gbc_lblObjectDescription = new GridBagConstraints();
		gbc_lblObjectDescription.fill = GridBagConstraints.VERTICAL;
		gbc_lblObjectDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblObjectDescription.gridx = 0;
		gbc_lblObjectDescription.gridy = 2;
		panel_1.add(lblObjectDescription, gbc_lblObjectDescription);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.BOTH;
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 2;
		panel_1.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblObjectWidthm = new JLabel("Object Width (m)");
		GridBagConstraints gbc_lblObjectWidthm = new GridBagConstraints();
		gbc_lblObjectWidthm.fill = GridBagConstraints.VERTICAL;
		gbc_lblObjectWidthm.insets = new Insets(0, 0, 5, 5);
		gbc_lblObjectWidthm.gridx = 0;
		gbc_lblObjectWidthm.gridy = 3;
		panel_1.add(lblObjectWidthm, gbc_lblObjectWidthm);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.BOTH;
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 3;
		panel_1.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblObjectHeightm = new JLabel("Object Height (m)");
		GridBagConstraints gbc_lblObjectHeightm = new GridBagConstraints();
		gbc_lblObjectHeightm.fill = GridBagConstraints.VERTICAL;
		gbc_lblObjectHeightm.insets = new Insets(0, 0, 5, 5);
		gbc_lblObjectHeightm.gridx = 0;
		gbc_lblObjectHeightm.gridy = 4;
		panel_1.add(lblObjectHeightm, gbc_lblObjectHeightm);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.BOTH;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 4;
		panel_1.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JButton btnAddObject = new JButton("Add Object");
		GridBagConstraints gbc_btnAddObject = new GridBagConstraints();
		gbc_btnAddObject.fill = GridBagConstraints.BOTH;
		gbc_btnAddObject.insets = new Insets(0, 0, 0, 5);
		gbc_btnAddObject.gridx = 0;
		gbc_btnAddObject.gridy = 5;
		panel_1.add(btnAddObject, gbc_btnAddObject);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{178, 178, 0};
		gbl_panel_2.rowHeights = new int[]{45, 30, 29, 30, 30, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblRecaluacute = new JLabel("Recalculate Runway Distances");
		lblRecaluacute.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblRecaluacute = new GridBagConstraints();
		gbc_lblRecaluacute.gridwidth = 2;
		gbc_lblRecaluacute.fill = GridBagConstraints.VERTICAL;
		gbc_lblRecaluacute.insets = new Insets(0, 0, 5, 5);
		gbc_lblRecaluacute.gridx = 0;
		gbc_lblRecaluacute.gridy = 0;
		panel_2.add(lblRecaluacute, gbc_lblRecaluacute);
		
		JLabel lblSelectRunway = new JLabel("Select Runway");
		GridBagConstraints gbc_lblSelectRunway = new GridBagConstraints();
		gbc_lblSelectRunway.fill = GridBagConstraints.VERTICAL;
		gbc_lblSelectRunway.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectRunway.gridx = 0;
		gbc_lblSelectRunway.gridy = 1;
		panel_2.add(lblSelectRunway, gbc_lblSelectRunway);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.BOTH;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 1;
		panel_2.add(comboBox, gbc_comboBox);
		
		JLabel lblSelectObject = new JLabel("Select Object");
		GridBagConstraints gbc_lblSelectObject = new GridBagConstraints();
		gbc_lblSelectObject.fill = GridBagConstraints.VERTICAL;
		gbc_lblSelectObject.insets = new Insets(0, 0, 5, 5);
		gbc_lblSelectObject.gridx = 0;
		gbc_lblSelectObject.gridy = 2;
		panel_2.add(lblSelectObject, gbc_lblSelectObject);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.fill = GridBagConstraints.BOTH;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 2;
		panel_2.add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblOdftm = new JLabel("ODFT (m)");
		GridBagConstraints gbc_lblOdftm = new GridBagConstraints();
		gbc_lblOdftm.fill = GridBagConstraints.VERTICAL;
		gbc_lblOdftm.insets = new Insets(0, 0, 5, 5);
		gbc_lblOdftm.gridx = 0;
		gbc_lblOdftm.gridy = 3;
		panel_2.add(lblOdftm, gbc_lblOdftm);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.fill = GridBagConstraints.BOTH;
		gbc_textField_8.insets = new Insets(0, 0, 5, 0);
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 3;
		panel_2.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Recalculate");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 4;
		panel_2.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show complete breakdown");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 4;
		panel_2.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
	}

}
