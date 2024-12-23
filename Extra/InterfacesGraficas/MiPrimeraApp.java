import javax.swing.*;

class MiPrimeraApp extends JFrame {

		JLabel jLabel; // Etiqueta
		JPanel jPanel; // Panel
		JButton jButton; // Botón
		
		// Constructor
		public MiPrimeraApp () {
		
			jLabel = new JLabel();
			jPanel = new JPanel();
			jButton = new JButton();
			
			jButton.setText("Enviar datos"); // Texto en el botón
			setTitle("Mi primera aplicación");
			setSize(600,400);
			setVisible(true);
					
		}

	public static void main(String[] args) {
	
		// Permite ejecutar la aplicación
		java.awt.EventQueue.invokeLater(new Runnable() {
		
		@Override
		public void run() {
		
			new MiPrimeraApp();
		
		}
		
		});
	
	}

}