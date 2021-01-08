package testeNeomind;

public class HorarioParaAngulo {

	public int converterHoraParaAngulo(int hora) {
		/*
		 * O relogio de ponteiro completa uma volta ap�s se passar 12 horas ent�o foi
		 * dividio o total de 12 horas por 360� onde cheguei a 30� por horas.
		 */
 
		int anguloHora = 30 * hora;

		return anguloHora;
	}

	public int converterMinutoParaAngulo(int minuto) {
		/*
		 * 00:00h representa o angulo de 0� 
		 * 00:15h representa o angulo de 45�
		 * 00:30h representa o angulo de 180� 
		 * 00:45h representa o angulo de 225�
		 * 00:59h representa o angulo de 360�
		 */
		int anguloMinuto = 0;
		int novoMinuto = 0;
		
		if (minuto <= 15) {
			anguloMinuto = minuto * 3; //Dentro de 15 minutos temos 45� ent�o 45�/15 = 3� por minuto
		} else if (minuto > 15 && minuto <= 30) {
			novoMinuto = minuto - 15;
			anguloMinuto = (novoMinuto * 9) + 45;
			/*
			 * 30 minutos se refere a 180�, 180� subtraindo os 45� ja percorridos nos
			 * primeiros 15 minutos resulta em 135�,  135/15m = 9� cada minuto
			 */
		} else if (minuto > 30 && minuto <= 45) {
			novoMinuto = minuto - 30;
			anguloMinuto = (novoMinuto * 3) + 180;
			/*
			 * 45 minutos se refere a 225�, 225� - 180� ja percorridos no 30 minutos que se passaram
			 *  resulta em 45� / 15 = 3� cada minuto;
			 */
		}else if (minuto > 45 && minuto <=59) {
			novoMinuto = minuto - 45;
			anguloMinuto = (novoMinuto * 9) + 225;
			/*
			 * Ao dar uma volta completa temos 360�, 360� - 225� ja percorridos nos 45 minutos que se passaram
			 * resulta em 135� / 15 = 9� cada minuto.
			 */
		}

		return anguloMinuto;
	}
}
