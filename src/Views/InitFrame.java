package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.InitController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class InitFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InitFrame frame = new InitFrame();
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
	public InitFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMeusLivros = new JLabel("Meus Livros");
		lblMeusLivros.setHorizontalAlignment(SwingConstants.CENTER);
		lblMeusLivros.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblMeusLivros.setBounds(6, 60, 438, 16);
		contentPane.add(lblMeusLivros);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(25, 154, 117, 29);
		contentPane.add(btnListar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(165, 154, 117, 29);
		contentPane.add(btnCadastrar);
		
		InitController handler = new InitController();
		btnCadastrar.addActionListener(handler);
		btnListar.addActionListener(handler);
		
	}

}
