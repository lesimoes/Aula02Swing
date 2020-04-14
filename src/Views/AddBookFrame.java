package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.AddBookController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class AddBookFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textTitle;
	private JTextField textAuthor;
	private JComboBox comboGender;
	private JComboBox comboYear;
	public AddBookController handler;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBookFrame frame = new AddBookFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddBookFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTtulo = new JLabel("Título");
		lblTtulo.setBounds(16, 79, 61, 16);
		contentPane.add(lblTtulo);
		
		textTitle = new JTextField();
		textTitle.setBounds(65, 74, 130, 26);
		contentPane.add(textTitle);
		textTitle.setColumns(10);
		
		JLabel lblGnero = new JLabel("Gênero");
		lblGnero.setBounds(226, 79, 61, 16);
		contentPane.add(lblGnero);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(16, 132, 61, 16);
		contentPane.add(lblAutor);
		
		textAuthor = new JTextField();
		textAuthor.setBounds(65, 127, 130, 26);
		contentPane.add(textAuthor);
		textAuthor.setColumns(10);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(226, 132, 61, 16);
		contentPane.add(lblAno);
		
		comboGender = new JComboBox();
		comboGender.setBounds(275, 75, 96, 27);
		contentPane.add(comboGender);
		
		comboYear = new JComboBox();
		comboYear.setBounds(275, 128, 96, 27);
		contentPane.add(comboYear);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(255, 209, 117, 29);
		contentPane.add(btnCadastrar);
		
		JCheckBox checkWatched = new JCheckBox("Assistido");
		checkWatched.setBounds(16, 178, 128, 23);
		contentPane.add(checkWatched);
		
		handler = new AddBookController(textTitle, textAuthor, comboYear, comboGender, checkWatched);
		
		btnCadastrar.addActionListener(handler);
		
	}
}
