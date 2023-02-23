import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;



public class Interfaz {
	private static ArrayList<String> opciones= new ArrayList<String>(Arrays.asList("De pesos a dolar","De pesos a euro","De pesos a libras","De pesos a yen","De pesos a won coreano","De dolar a pesos","De euros a pesos","De libras a pesos","De yen a pesos","De wones a pesos"));
	
	public static void main(String[] args) {
		boolean isRunning=true;
		String result="";
		
		while(isRunning) {
			int opcion=menuOpcion();
			
			String res=JOptionPane.showInputDialog(null,"Ingrese la cantidad a convertir").toString();
			double cant=comprobarDouble(res);
			
			if(cant!=0) {
			
				switch(opcion) {
					case 0:
						result=Conversiones.peso_dolar(cant);
						break;
					case 1:
						result=Conversiones.peso_euro(cant);
						break;
					case 2:
						result=Conversiones.peso_libra(cant);
						break;
					case 3:
						result=Conversiones.peso_yen(cant);
						break;
					case 4:
						result=Conversiones.peso_won(cant);
						break;
					case 5:
						result=Conversiones.dolar(cant);
						break;
					case 6:
						result=Conversiones.euro(cant);
						break;
					case 7:
						result=Conversiones.libra(cant);
						break;
					case 8:
						result=Conversiones.yen(cant);
						break;
					case 9:
						result=Conversiones.won(cant);
						break;
					
				}
				
				JOptionPane.showMessageDialog(null,result);
				if(JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?")!=JOptionPane.OK_OPTION ) {
					isRunning=false;
				}
			}
		}
		
		
	
	}


	public static int menuOpcion() {

		Object respuesta=JOptionPane.showInputDialog(null,"Elija la moneda a la que deseas convertir tu dinero","Menu",JOptionPane.QUESTION_MESSAGE, null, opciones.toArray(),opciones.toArray()[0]);
		comprobar(respuesta);
		
		
		return opciones.indexOf(respuesta);
	}
	
	public static void comprobar(Object respuesta) {
		
		if(respuesta==null) {
			System.exit(0);
		}
	}
	
public static double comprobarDouble(String respuesta) {
		double Value=0;
		try {
			Value=Double.parseDouble(respuesta);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Solo puede ingresar numeros");
		}
		
		return Value;
	}

}