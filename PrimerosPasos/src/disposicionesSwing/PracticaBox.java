package disposicionesSwing;

import javax.swing.*;

public class PracticaBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBox miMarco=new MarcoBox();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
	}
}

class MarcoBox extends JFrame{
	
	public MarcoBox() {
		
		setTitle("Disposición BOx");
		
		setBounds(700,400,200,200);
		
		// -----------primer Box-------------------
		
		JLabel nUsuario=new JLabel("Nombre");
		
		JTextField cUsuario=new JTextField(10);
		
		// para que no redimencione el tamaño del JTextField el usuario
		cUsuario.setMaximumSize(cUsuario.getPreferredSize());
		
		//crea la primera caja horizontal
		Box cajaUsuario=Box.createHorizontalBox();
		
		cajaUsuario.add(nUsuario);
		
		// crea una separacion
		cajaUsuario.add(Box.createHorizontalStrut(10));
		
		cajaUsuario.add(cUsuario);
		
		// ----------------Segunda caja--------------------
		
		JLabel nPass=new JLabel("Contraseña");
		
		JTextField cPass=new JTextField(10);
		
		// para que no redimencione el tamaño del JTextField el usuario
		cPass.setMaximumSize(cPass.getPreferredSize());
		
		//crea la primera caja horizontal
		Box cajaPassword=Box.createHorizontalBox();
		
		cajaPassword.add(nPass);
		
		cajaPassword.add(Box.createHorizontalStrut(10));
		
		cajaPassword.add(cPass);
		
		// ------------ tercer Box -------------------
		
		JButton boton1= new JButton("OK");
		
		JButton boton2= new JButton("Cancelar");
		
		Box cajaBotones=Box.createHorizontalBox();
		
		cajaBotones.add(boton1);

		cajaBotones.add(Box.createGlue());
		
		cajaBotones.add(boton2);
		
		//------------- Vertical Box ----------------
		
		Box cajaVertical=Box.createVerticalBox();
		
		cajaVertical.add(cajaUsuario);
		cajaVertical.add(cajaPassword);
		cajaVertical.add(cajaBotones);
		
		add(cajaVertical);
	}
}
