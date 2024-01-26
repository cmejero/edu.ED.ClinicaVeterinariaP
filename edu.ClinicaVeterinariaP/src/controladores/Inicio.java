package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.EsclavoDto;
import dtos.PacienteDto;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

public class Inicio {

	public static void main(String[] args) {		
		
		List<PacienteDto> listaPacientes = new ArrayList<PacienteDto>();
		//ArrayList<PacienteDto> arrayListPaciente = new ArrayList<PacienteDto>();
		//PacienteDto[] arrayPaciente = new PacienteDto[100];
		List<EsclavoDto> listaEsclavos = new ArrayList<EsclavoDto>();
		
		OperativaInterfaz oi = new OperativaImplementacion();
		oi.crearNuevoPaciente(listaPacientes, listaEsclavos);
		for(PacienteDto paciente : listaPacientes) {
			System.out.println(paciente.toString());
		}
		for(EsclavoDto esclavo : listaEsclavos) {
			System.out.println(esclavo.toString());
		}
		
	}

}
