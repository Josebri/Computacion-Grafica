package graficos;
import java.awt.Toolkit;
import java.awt.Dimension;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado marco = new MarcoCentrado();
		
		marco.setVisible(true);
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("Comp Graf2");

	}

}

class MarcoCentrado extends JFrame {
	
	public MarcoCentrado () {

		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanioPantalla=miPantalla.getScreenSize();

		int alturaPantalla = tamanioPantalla.height;
		
		int anchoPantalla = tamanioPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
	}
}
//Nombre: Jose Briceño C.I:29.930.427
