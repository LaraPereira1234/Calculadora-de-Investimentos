package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculadoraInvestimentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDepositoMensal;
	private JTextField txtNumMeses;
	private JTextField txtJurosMes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInvestimentos frame = new CalculadoraInvestimentos();
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
	public CalculadoraInvestimentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepositoMensal = new JLabel("Depósito mensal R$:");
		lblDepositoMensal.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblDepositoMensal.setBounds(59, 11, 122, 14);
		contentPane.add(lblDepositoMensal);
		
		txtDepositoMensal = new JTextField();
		txtDepositoMensal.setBounds(37, 28, 154, 20);
		contentPane.add(txtDepositoMensal);
		txtDepositoMensal.setColumns(10);
		
		JLabel lblNumMeses = new JLabel("Num. de meses:");
		lblNumMeses.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumMeses.setBounds(69, 59, 97, 14);
		contentPane.add(lblNumMeses);
		
		txtNumMeses = new JTextField();
		txtNumMeses.setBounds(37, 75, 154, 20);
		contentPane.add(txtNumMeses);
		txtNumMeses.setColumns(10);
		
		JLabel lblJurosMes = new JLabel("Juros ao mês %:");
		lblJurosMes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJurosMes.setBounds(69, 106, 96, 14);
		contentPane.add(lblJurosMes);
		
		txtJurosMes = new JTextField();
		txtJurosMes.setBounds(37, 121, 154, 20);
		contentPane.add(txtJurosMes);
		txtJurosMes.setColumns(10);
		
		JLabel lblInvestidosJuros = new JLabel("Total investidos + juros R$:");
		lblInvestidosJuros.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInvestidosJuros.setBounds(37, 152, 164, 14);
		contentPane.add(lblInvestidosJuros);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(69, 177, 97, 23);
		contentPane.add(btnCalcular);
	}
}
