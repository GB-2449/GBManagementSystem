package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	
	MenuSelection menuselection;
	GBAdder gbAdder;
	GBViewer gbViewer;
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.gbAdder = new GBAdder(this);
		this.gbViewer = new GBViewer(this);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public GBAdder getGbAdder() {
		return gbAdder;
	}

	public void setGbAdder(GBAdder gbAdder) {
		this.gbAdder = gbAdder;
	}

	public GBViewer getGbViewer() {
		return gbViewer;
	}

	public void setGbViewer(GBViewer gbViewer) {
		this.gbViewer = gbViewer;
	}


}
