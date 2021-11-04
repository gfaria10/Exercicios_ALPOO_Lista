package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class Ex07{

	private JFrame frame;
	private JTextField txtNome;
	private JPasswordField txtSenha;
	private JLabel lblNewLabel_2;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex07 window = new Ex07();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	private static void closingWindows(JFrame frame) {
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent event) {
				int resposta = JOptionPane.showConfirmDialog(null, "Você realmente quer sair ?", "Confirmação",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					frame.dispose();
				} else {                                  // CONFIRMAR SE REALMENTE QUER SAIR
					return;
				}

			}
		});

	}
	
	/**
	 * Create the application.
	 */
	public Ex07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 204));
		frame.setBounds(100, 100, 700, 476);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		closingWindows(frame);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));   // LABEL NOME
		lblNewLabel.setBounds(211, 33, 78, 42);
		frame.getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(211, 74, 256, 42);
		frame.getContentPane().add(txtNome);         //DIGITACAO NOME
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));   // LABEL SENHA
		lblNewLabel_1.setBounds(211, 262, 78, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(211, 303, 256, 42);
		frame.getContentPane().add(txtSenha);       //DIGITACAO SENHA
		
		lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));        // LABEL EMAIL
		lblNewLabel_2.setBounds(210, 150, 78, 44);
		frame.getContentPane().add(lblNewLabel_2);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(211, 189, 256, 39);
		frame.getContentPane().add(txtEmail);         //DIGITACAO EMAIL
		txtEmail.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		btnEntrar.addActionListener(new ActionListener() {                                           // BOTAO ENTRAR
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
			
				
				
			if(txtNome.getText().isEmpty()) 
			{
				JOptionPane.showMessageDialog(null, "Por favor preencha o campo nome!");
				txtNome.requestFocus();
			}
			
			else if (txtEmail.getText().isEmpty()) 
			{
				JOptionPane.showMessageDialog(null, "Por favor preencha o campo Email!");
				txtEmail.requestFocus();
			}
			
			else if (txtSenha.getPassword().length == 0) 
			{
				JOptionPane.showMessageDialog(null, "Por favor preencha o campo Senha!");
				txtSenha.requestFocus();
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Bem vindo ao nosso sistema!");
			}
			}                                                                             // SOLICITANDO O PREENCHIMENTO DOS CAMPOS
			
			
		});
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEntrar.setBounds(184, 367, 107, 43);
		frame.getContentPane().add(btnEntrar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(UIManager.getColor("ColorChooser.foreground"));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {                            // BOTAO LIMPAR
			txtNome.setText("");
			txtEmail.setText("");
			txtSenha.setText("");
			}
			
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpar.setBounds(380, 367, 114, 43);
		frame.getContentPane().add(btnLimpar);
	}
}