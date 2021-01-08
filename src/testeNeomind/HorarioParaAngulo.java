package testeNeomind;

public class HorarioParaAngulo {

	public int converterHoraParaAngulo(int hora) {
		/*
		 * O relogio de ponteiro completa uma volta após se passar 12 horas então foi
		 * dividio o total de 12 horas por 360º onde cheguei a 30º por horas.
		 */
 
		int anguloHora = 30 * hora;

		return anguloHora;
	}

	public int converterMinutoParaAngulo(int minuto) {
		/*
		 * 00:00h representa o angulo de 0º 
		 * 00:15h representa o angulo de 45º
		 * 00:30h representa o angulo de 180º 
		 * 00:45h representa o angulo de 225º
		 * 00:59h representa o angulo de 360º
		 */
		int anguloMinuto = 0;
		int novoMinuto = 0;
		
		if (minuto <= 15) {
			anguloMinuto = minuto * 3; //Dentro de 15 minutos temos 45º então 45º/15 = 3º por minuto
		} else if (minuto > 15 && minuto <= 30) {
			novoMinuto = minuto - 15;
			anguloMinuto = (novoMinuto * 9) + 45;
			/*
			 * 30 minutos se refere a 180º, 180º subtraindo os 45º ja percorridos nos
			 * primeiros 15 minutos resulta em 135º,  135/15m = 9º cada minuto
			 */
		} else if (minuto > 30 && minuto <= 45) {
			novoMinuto = minuto - 30;
			anguloMinuto = (novoMinuto * 3) + 180;
			/*
			 * 45 minutos se refere a 225º, 225º - 180º ja percorridos no 30 minutos que se passaram
			 *  resulta em 45º / 15 = 3º cada minuto;
			 */
		}else if (minuto > 45 && minuto <=59) {
			novoMinuto = minuto - 45;
			anguloMinuto = (novoMinuto * 9) + 225;
			/*
			 * Ao dar uma volta completa temos 360º, 360º - 225º ja percorridos nos 45 minutos que se passaram
			 * resulta em 135º / 15 = 9º cada minuto.
			 */
		}

		return anguloMinuto;
	}
}
