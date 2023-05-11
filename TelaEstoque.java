package TelaEstoque;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.Dimension;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

public class TelaEstoque extends JFrame {

	private JPanel contentPane;
	private JTextField pesquisatextField;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEstoque frame = new TelaEstoque();
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
	public TelaEstoque() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 434);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel estoqueLabel = new JLabel("ESTOQUE");
		estoqueLabel.setFont(new Font("Arial", Font.BOLD, 15));
		estoqueLabel.setBounds(36, 11, 80, 14);
		contentPane.add(estoqueLabel);
		
		JLabel pesquisaLabel = new JLabel("PESQUISAR PRODUTOS");
		pesquisaLabel.setBounds(36, 52, 115, 14);
		contentPane.add(pesquisaLabel);
		
		pesquisatextField = new JTextField();
		pesquisatextField.setBounds(161, 49, 152, 20);
		contentPane.add(pesquisatextField);
		pesquisatextField.setColumns(10);
		
		JButton pesquisaButton = new JButton("PESQUISAR");
		pesquisaButton.setBounds(334, 48, 89, 23);
		contentPane.add(pesquisaButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 95, 473, 114);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "PRODUTO", "COR", "P", "M", "G", "GG", "PRE\u00C7O"
			}
		));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 227, 742, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("CADASTRAR NOVO PRODUTO");
		lblNewLabel.setBounds(36, 240, 170, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(64, 265, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PRODUTO");
		lblNewLabel_2.setBounds(258, 265, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("COR");
		lblNewLabel_3.setBounds(468, 265, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TAMANHO");
		lblNewLabel_4.setBounds(60, 303, 69, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(130, 265, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(322, 262, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(524, 262, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 300, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setBounds(322, 361, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("PREÇO");
		lblNewLabel_5.setBounds(258, 303, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(322, 300, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
