package testeNeomind;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MapearHorario {

	GregorianCalendar horario = new GregorianCalendar();
	
	public int getHora() {

		int hora = horario.get(Calendar.HOUR);

		return hora;
	}

	public int getMinuto() {

		int minuto = horario.get(Calendar.MINUTE);

		return minuto;
	}


}
