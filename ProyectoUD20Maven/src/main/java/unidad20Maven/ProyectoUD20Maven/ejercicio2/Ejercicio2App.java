package unidad20Maven.ProyectoUD20Maven.ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2App extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2App frame = new Ejercicio2App();
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
	public Ejercicio2App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(49, 21, 111, 31);
		contentPane.add(lblNewLabel);
		
		JButton boton1 = new JButton("Boton 1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setText("Boton 1");
			}
		});
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton1.setBounds(170, 20, 115, 33);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("Boton 2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Boton 2");
			}
		});
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton2.setBounds(295, 20, 103, 33);
		contentPane.add(boton2);
	}
}
