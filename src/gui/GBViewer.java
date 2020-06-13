package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import gb.GBInput;

public class GBViewer extends JPanel {
	
	WindowFrame frame;
	GBManager gbManager;
	
	public GBViewer(WindowFrame frame, GBManager gbManager) {
		this.frame = frame;
		this.gbManager = gbManager;
		
		System.out.println("***" + gbManager.size() + "***");
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Phone");
		model.addColumn("Email");
		model.addColumn("Hobby");
		
		for(int i=0; i<gbManager.size(); i++) {
			Vector row = new Vector();
			GBInput gi = gbManager.get(i);
			row.add(gi.getPhone());
			row.add(gi.getName());
			row.add(gi.getEmail());
			row.add(gi.getHobby());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
