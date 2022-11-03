package unidad20Maven.ProyectoUD20Maven.ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3App extends JFrame {

	private JPanel contentPane;
	static int contador_boton_1=0;
	static int contador_boton_2=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3App frame = new Ejercicio3App();
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
	public Ejercicio3App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(69, 28, 111, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(256, 37, 105, 21);
		contentPane.add(lblNewLabel_1);
		
		
		
		JButton boton1 = new JButton("Boton1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador_boton_1++;
				lblNewLabel.setText("Boton1: "+contador_boton_1+" veces");
			}
		});
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton1.setBounds(69, 72, 85, 21);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("Boton2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador_boton_2++;
				lblNewLabel_1.setText("Boton2: "+contador_boton_2+" veces");
			}
		});
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton2.setBounds(256, 72, 85, 21);
		contentPane.add(boton2);
	}

}
