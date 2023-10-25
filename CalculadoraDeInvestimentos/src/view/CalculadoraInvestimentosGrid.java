package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Investimento;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraInvestimentosGrid extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel contentPane_1;
	private JTextField txtDepMensal;

	private JTextField txtJuroM;

	private JLabel lblTotalInvest;

	private JButton btnNewButton;

	private JTextField txtNumMes;

	private JLabel lblEspaco1;

	private JLabel lblEspacoTotal;

	private JButton btnCalcular;

	private JMenuBar menuBar;

	private JMenu mnNewMenu;

	private JMenuItem mntmNewMenuItem;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
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
		setBounds(100, 100, 372, 206);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		menuBar = new JMenuBar();

		setJMenuBar(menuBar);

		

		mnNewMenu = new JMenu("AJUDA");

		menuBar.add(mnNewMenu);

		

		mntmNewMenuItem = new JMenuItem("sobre ");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuSobre janela = new MenuSobre();
				janela.setVisible(true);
				
			}
		});

		mnNewMenu.add(mntmNewMenuItem);

		contentPane_1 = new JPanel();

		contentPane_1.setBackground(new Color(243, 243, 243));

		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));



		setContentPane(contentPane_1);

		contentPane_1.setLayout(new GridLayout(5, 2, 0, 0));
		
				
		
				JLabel lblDepMensal = new JLabel("Depósito Mensal R$:");
				contentPane_1.add(lblDepMensal);
				lblDepMensal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		panel = new JPanel();
		contentPane_1.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
				
		
				txtDepMensal = new JTextField();
				panel.add(txtDepMensal);
				
						txtDepMensal.setColumns(10);
		
				
		
				JLabel lblNumMes = new JLabel("Num. de meses:");
				contentPane_1.add(lblNumMes);
				lblNumMes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		panel_1 = new JPanel();
		contentPane_1.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		

		txtNumMes = new JTextField();
		panel_1.add(txtNumMes);

		txtNumMes.setColumns(10);
		
				
		
				JLabel lblJuroM = new JLabel("Juros ao mês %:");
				contentPane_1.add(lblJuroM);
				lblJuroM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		panel_2 = new JPanel();
		contentPane_1.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		

		txtJuroM = new JTextField();
		panel_2.add(txtJuroM);

		txtJuroM.setColumns(10);
		
				
		
				lblTotalInvest = new JLabel("Total Investido + juros R$:");
				contentPane_1.add(lblTotalInvest);
				lblTotalInvest.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
				
		
				lblEspacoTotal = new JLabel("");
				
						contentPane_1.add(lblEspacoTotal);

		

		lblEspaco1 = new JLabel("");

		contentPane_1.add(lblEspaco1);
		
		panel_3 = new JPanel();
		contentPane_1.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
				
		
				btnCalcular = new JButton("CALCULAR");
				panel_3.add(btnCalcular);
				btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 12));
				
						btnCalcular.addActionListener(new ActionListener() {
				
							public void actionPerformed(ActionEvent e) {
				               double deposito = Double.valueOf(txtDepMensal.getText());
				               int meses = Integer.valueOf(txtNumMes.getText());
				               double juros = Double.valueOf(txtJuroM.getText());
				               Investimento i = new Investimento(meses, juros, deposito);
				               double total = i.calculaTotal();
				               lblEspacoTotal.setText(String.format("%.2f", total));
				
								
				
								
				
								
				
								
				
							}
				
						});
		
	}

}
