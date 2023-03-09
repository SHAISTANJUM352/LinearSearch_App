import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LinearSearch extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinearSearch frame = new LinearSearch();
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
	public LinearSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LINEAR  SEARCH");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(141, 23, 293, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter 5 Numbers");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_1.setBounds(22, 84, 179, 24);
		contentPane.add(lblNewLabel_1);
		
		JTextArea ta1 = new JTextArea();
		ta1.setForeground(new Color(0, 0, 0));
		ta1.setFont(new Font("Cambria", Font.BOLD, 20));
		ta1.setBackground(new Color(245, 245, 245));
		ta1.setBounds(219, 82, 199, 22);
		contentPane.add(ta1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Key to Search");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(22, 139, 199, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("RESULT");
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Cambria", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(201, 195, 156, 24);
		contentPane.add(lblNewLabel_1_2);
		
		JTextArea ta2 = new JTextArea();
		ta2.setForeground(new Color(0, 0, 0));
		ta2.setFont(new Font("Cambria", Font.BOLD, 20));
		ta2.setBackground(new Color(245, 245, 245));
		ta2.setBounds(219, 136, 197, 22);
		contentPane.add(ta2);
		
		JTextArea tar = new JTextArea();
		tar.setForeground(new Color(0, 0, 0));
		tar.setFont(new Font("Cambria", Font.BOLD, 20));
		tar.setBackground(new Color(245, 245, 245));
		tar.setBounds(123, 235, 257, 31);
		contentPane.add(tar);
		
		JButton btnNewButton = new JButton("LINEAR SEARCH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to linear search
				String data1=ta1.getText();
				String key=ta2.getText();
				String arr[]=data1.split(" ");
					
				for(int i=0;i<=arr.length-1;i++)
				{
					if(Integer.valueOf(arr[i]) == Integer.valueOf(key))
						{						
						tar.setText("key found at index: "+i);
						break;
						}									
							tar.setText("key not found");
					  	}
				}
			
		});
		btnNewButton.setBackground(new Color(220, 220, 220));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 18));
		btnNewButton.setBounds(141, 288, 215, 31);
		contentPane.add(btnNewButton);
	}

}
