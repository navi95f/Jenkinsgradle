/**
 * 
 * The main class of this project
 * @author acer
 *
 */
public class GetPrima{
	/**
	 * 
	 * @param edad
	 * @param estadoCivil
	 * @param sexo
	 * @return
	 */
	public int getPrima(int edad, String estadoCivil, String sexo) {
		int result = 200;
		
		if (edad >= 18 && edad <= 80){
					if (sexo.toUpperCase().equals("M") || sexo.toUpperCase().equals("H")) {
							if (estadoCivil.toLowerCase().equals("soltero") || 
									estadoCivil.toLowerCase().equals("casado") || 
									estadoCivil.toLowerCase().equals("divorciado") || 
									estadoCivil.toLowerCase().equals("viudo")) {
								if (estadoCivil.toLowerCase().equals("soltero")) {
									result += 100;
								}
								if (edad > 60){
									result += 100;
								}
								if (edad < 29){
									result += 200;
									if (sexo.toUpperCase().equals("H")) {
										result += 100;
									}
								}
								return result;
							}
						}	
		}
		return -1;
	}
}