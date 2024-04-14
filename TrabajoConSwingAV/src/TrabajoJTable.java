import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class TrabajoJTable extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrabajoJTable frame = new TrabajoJTable();
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
	public TrabajoJTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JTable tablaPlanetas=new JTable(datosFilas, nombresColumnas);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		contentPane.add(new JScrollPane(tablaPlanetas), BorderLayout.CENTER);
		JButton botonImprimir=new JButton("Imprimir tabla");
		botonImprimir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				try {
					tablaPlanetas.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		contentPane.add(botonImprimir, BorderLayout.SOUTH);
		setContentPane(contentPane);	
	}
	
	private String [] nombresColumnas= {"Nombre", "Radio", "Lunas", "Gaseoso"};
	
	private Object [][] datosFilas= {
			
			{"Mercurio", 2440, 0, false},
			{"Vanus", 6052, 0, false},
			{"Tierra", 6378, 1, false},
			{"Marte", 3397, 2, false},
			{"Júpiter", 71492, 16, true},
			{"Saturno", 60268, 18, true},
			{"Urano", 25559, 17, true},
			{"Neptuno", 24766, 8, true},
			{"Plutón", 1137, 1, false}
			
	};

}
