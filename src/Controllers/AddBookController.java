package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import Models.Movie;

public class AddBookController implements ActionListener {

	private JTextField textTitle;
	private JTextField textAuthor;
	private JComboBox comboYear;
	private JComboBox comboGender;
	private JCheckBox checkWatched;
	private List<Movie> movies;
	
	public AddBookController(JTextField title, JTextField author, JComboBox year, JComboBox gender, JCheckBox checkWatched) {
		this.textAuthor = author;
		this.textTitle = title;
		this.checkWatched = checkWatched;
		this.populateComboGender(gender);
		this.populateComboYear(year);
		movies = new ArrayList<>();
	}
	
	private void populateComboYear(JComboBox year) {
		this.comboYear = year;
		
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		for (int yearLoop = currentYear ; yearLoop >= 2000 ; yearLoop --) {
			this.comboYear.addItem(yearLoop);
		}
		
	}
	
	private void populateComboGender(JComboBox gender) {
		this.comboGender = gender;
		String[] genders = new String[] {"Terror", "Ação", "Aventura", "Comédia", "Drama"};
		for (String genderLoop : genders) {
			this.comboGender.addItem(genderLoop);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
		switch(event.getActionCommand()) {
		case "Cadastrar": this.addMovie();
		break;
		}
	}
	
	public void addMovie() {
		int movieYear = (int) this.comboYear.getSelectedItem();
		String movieGender = (String) this.comboGender.getSelectedItem();
		
		Movie movie = new Movie(this.textTitle.getText(), movieGender, this.textAuthor.getText(), movieYear, checkWatched.isSelected());
		movies.add(movie);
		
		for (int i = 0 ; i < movies.size() ; i ++ ) {
			System.out.println(movies.get(i));
		}
	}
	
	public List getMovies() {
		return this.movies;
	}
	
	

}
