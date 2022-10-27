package unidad20Maven.ProyectoUD20Maven.ejercicio8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Ejercicio8App extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio8App frame = new Ejercicio8App();
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
	public Ejercicio8App() {
		addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				System.out.println("Hola");
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad a convertir");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(37, 25, 153, 19);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(235, 27, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Euros-Pesetas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField_1.setText(String.valueOf(Double.parseDouble(textField.getText())*166.386));
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Errores everywhere!");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(73, 82, 133, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pesetas-Euros");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					textField_1.setText(String.valueOf(Double.parseDouble(textField.getText())/166.386));
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Errores everywhere!");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(246, 82, 145, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(173, 136, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(73, 196, 74, 13);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyChar()=='a') {
					try {
						textField_1.setText(String.valueOf(Double.parseDouble(textField.getText())*166.386));
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Errores everywhere!");
					}}
					else if(ke.getKeyChar()=='b') {
						try {
							textField_1.setText(String.valueOf(Double.parseDouble(textField.getText())/166.386));
						}catch(Exception ex) {
							JOptionPane.showMessageDialog(null, "Errores everywhere!");
						}
					} else {
						textField.setText("");
						textField_1.setText("");
				}
			}
		});
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setEnabled(false);
		textField_1.setBounds(246, 195, 145, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton_2.addKeyListener(new KeyListener() {

		    @Override
		    public void keyTyped(KeyEvent e) {

		    }

		    @Override
		    public void keyReleased(KeyEvent e) {

		    }

		    @Override
		    public void keyPressed(KeyEvent e) {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		            System.out.println("Hello");
		            JOptionPane.showMessageDialog(null, "Enter key pressed !");
		        }

		    }
		});
	}
	
}
