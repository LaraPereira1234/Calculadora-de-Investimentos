package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculadoraInvestimentosGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblJurosM;
	private JLabel lblDepMensal;
	private JLabel lblNumMes;
	private JTextField txtDepMensal;
	private JTextField txtNumMes;
	private JTextField txtJurosM;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentosGrid frame = new CalculadoraInvestimentosGrid();
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
	public CalculadoraInvestimentosGrid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 164);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDepMensal = new JLabel("Depósito mensal R$:");
		lblDepMensal.setBounds(0, 10, 111, 15);
		lblDepMensal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblDepMensal);
		
		lblNumMes = new JLabel("Num. de meses:");
		lblNumMes.setBounds(0, 36, 89, 15);
		lblNumMes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNumMes);
		
		lblJurosM = new JLabel("Juros ao mês:");
		lblJurosM.setBounds(0, 62, 75, 15);
		lblJurosM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblJurosM);
		
		JLabel lblJurosInvest = new JLabel("Total investimentos + juros R$:");
		lblJurosInvest.setBounds(0, 88, 171, 15);
		lblJurosInvest.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblJurosInvest);
		
		txtDepMensal = new JTextField();
		txtDepMensal.setBounds(194, 6, 161, 25);
		contentPane.add(txtDepMensal);
		txtDepMensal.setColumns(10);
		
		txtNumMes = new JTextField();
		txtNumMes.setText("");
		txtNumMes.setBounds(194, 32, 161, 25);
		contentPane.add(txtNumMes);
		txtNumMes.setColumns(10);
		
		txtJurosM = new JTextField();
		txtJurosM.setText("");
		txtJurosM.setBounds(194, 56, 161, 25);
		contentPane.add(txtJurosM);
		txtJurosM.setColumns(10);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(194, 99, 161, 23);
		contentPane.add(btnCalcular);
	}

}
