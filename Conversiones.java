
public class Conversiones {
	private static double dolar=0.0051;
	private static double euro=0.0048;
	private static double libra=0.0043;
	private static double yen=0.69;
	private static double won=6.64;
	private static double cant;
	
	//CONVERSIONES DE PESO
	public static String peso_dolar(double pesos) {
		cant=pesos*dolar;
		return "Tienes "+cant+" dolares";
	}
	public static String peso_euro(double pesos) {
		cant=pesos*euro;
		return "Tienes "+cant+" euros";
	}
	public static String peso_libra(double pesos) {
		cant=pesos*libra;
		return "Tienes "+cant+" libras";
	}
	public static String peso_yen(double pesos) {
		cant=pesos*yen;
		return "Tienes "+cant+" yenes";
	}
	public static String peso_won(double pesos) {
		cant=pesos*won;
		return "Tienes "+cant+" wones";
	}
	
	//OTRAS CONVERSIONES
	public static String dolar(double pesos) {
		cant=pesos/dolar;
		return "Tienes "+cant+" pesos";
	}
	public static String euro(double pesos) {
		cant=pesos/euro;
		return "Tienes "+cant+" pesos";
	}
	public static String libra(double pesos) {
		cant=pesos/libra;
		return "Tienes "+cant+" pesos";
	}
	public static String yen(double pesos) {
		cant=pesos/yen;
		return "Tienes "+cant+" pesos";
	}
	public static String won(double pesos) {
		cant=pesos/won;
		return "Tienes "+cant+" pesos";
	}

}
