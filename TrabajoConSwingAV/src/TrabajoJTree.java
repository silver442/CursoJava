import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;

public class TrabajoJTree extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrabajoJTree frame = new TrabajoJTree();
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
	public TrabajoJTree() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		DefaultMutableTreeNode nRaiz=new DefaultMutableTreeNode("Mundo");
	
		DefaultMutableTreeNode nPais=new DefaultMutableTreeNode("Colombia");
		
		nRaiz.add(nPais); // indicar que el segundo nodo es hijo del primero
	
		DefaultMutableTreeNode rAndina=new DefaultMutableTreeNode("Andina");
		
		nPais.add(rAndina);
		
		DefaultMutableTreeNode rCaribe=new DefaultMutableTreeNode("Caribe");
		
		nPais.add(rCaribe);
		
		
		JTree MArbol=new JTree();
		
		contentPane.add(MArbol, BorderLayout.NORTH);
	}

}
