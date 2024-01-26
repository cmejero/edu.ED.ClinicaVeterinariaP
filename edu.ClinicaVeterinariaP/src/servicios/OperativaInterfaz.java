package servicios;

import java.util.List;

import dtos.EsclavoDto;
import dtos.PacienteDto;

public interface OperativaInterfaz {
	
	public void crearNuevoPaciente(List<PacienteDto> listaPacientes, List<EsclavoDto> listaEsclavos);
	
}
