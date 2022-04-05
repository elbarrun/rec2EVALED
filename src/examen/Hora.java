package examen;
/**
 * 
 * @author IkerOchoa
 *
 */
public class Hora {
	
	public static boolean horaValida;
/**
 * 
 * @param segundos
 * @param minutos
 * @param horas
 * @return
 */
	public static boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		/**
		 * Condición para que las horas, minutos y segundos sean mayores o igual que 0
		 */
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			/**
			 * la hora no será válida si la hora es mayor que 23
			 */
			if (horas > 23) {
				horaValida = false;
			/**
			 * la hora no será válida si los minutos son mayores que 59
			 */
			} else if (minutos > 59) {
				horaValida = false;
			/**
			 * la hora no será válida si los segundos son mayores que 59
			 */
			} else if (segundos > 59) {
				horaValida = false;
			}
		/**
		 * Devuelve la hora es falsa
		 */
		} else {
			horaValida = false;
		}
		/**
		 * Devuelve que la hora será válida
		 */
		return horaValida;
	}
}