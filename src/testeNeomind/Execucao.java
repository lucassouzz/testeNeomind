package testeNeomind;

public class Execucao {

	public int executar() {

		MapearHorario mapearHorario = new MapearHorario();
		HorarioParaAngulo horarioParaAngulo = new HorarioParaAngulo();

		int hora = mapearHorario.getHora();

		int minuto = mapearHorario.getMinuto();

		int horaEmAngulo = horarioParaAngulo.converterHoraParaAngulo(hora);

		int minutoEmAngulo = horarioParaAngulo.converterMinutoParaAngulo(minuto);

		System.out.println("Hora atual: " + hora + "h | Angulo do ponteiro: " + horaEmAngulo + "�");
		System.out.println("Minuto atual: " + minuto + "m | Angulo do ponteiro: " + minutoEmAngulo + "�");

		int anguloEntrePonteiros = minutoEmAngulo - horaEmAngulo;

		if (anguloEntrePonteiros < 0) {
			anguloEntrePonteiros = anguloEntrePonteiros * -1;
		}

		return anguloEntrePonteiros;
	}

}
