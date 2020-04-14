package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Views.AddBookFrame;
import Views.ListBookFrame;
import Models.Movie;

public class InitController implements ActionListener {

	AddBookFrame addBookFrame;
	JTable table;
	
	public InitController(JTable table) {
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
		System.out.print(event.getActionCommand());
		switch(event.getActionCommand()) {
		case "Cadastrar": this.cadastrar();
		break;
		case "Listar": this.listar();
		break;
		}
	}
	
	private void cadastrar() {
		addBookFrame = new AddBookFrame();
		addBookFrame.setVisible(true);
	}
	
	private void listar() {
		ListBookFrame listBookFrame = new ListBookFrame();
		
		listBookFrame.setVisible(true);
	}

}
