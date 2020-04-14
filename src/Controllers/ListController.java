package Controllers;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Models.Movie;
import Views.AddBookFrame;

public class ListController {

	public JTable table;
	
	public ListController(JTable table) {
		this.table = table;
		
		List<Movie> movies = addBookFrame.handler.getMovies();
		String[] columns = {"Título", "Autor", "Gênero", "Ano"};
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0 ; i < movies.size() ; i ++ ) {
			List row = (List) movies.get(i);
			model.addRow(row.toArray());
		}
	}
	
	
	
}
