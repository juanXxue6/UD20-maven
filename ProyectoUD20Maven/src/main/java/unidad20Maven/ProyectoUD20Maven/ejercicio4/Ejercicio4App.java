package unidad20Maven.ProyectoUD20Maven.ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio4App extends JFrame {
	static private String txt ="";
	private JPanel contentPane;
	JTextPane txtpn = new JTextPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4App frame = new Ejercicio4App();
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
	public Ejercicio4App() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0) {
				txtpn.setText(txtpn.getText()+"\n Se activa la ventana");
			}
			@Override
			public void windowIconified(WindowEvent e) {
				txtpn.setText(txtpn.getText()+"\n Se iconiza la ventana");
			}
			@Override
			public void windowOpened(WindowEvent e) {
				txtpn.setText(txtpn.getText()+"\n Se abre la ventana");
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
				txtpn.setText(txtpn.getText()+"\n Se deiconiza ventana");
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		txtpn.setText(txtpn.getText()+"\n Se crea el pane");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eventos:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 89, 83, 27);
		contentPane.add(lblNewLabel);
		txtpn.setText(txtpn.getText()+"\n Se crea el label");
		
		txtpn.setBounds(87, 34, 310, 197);
		contentPane.add(txtpn);
	}
}
