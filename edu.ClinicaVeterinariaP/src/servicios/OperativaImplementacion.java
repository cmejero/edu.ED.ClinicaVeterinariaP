package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.EsclavoDto;
import dtos.PacienteDto;

public class OperativaImplementacion implements OperativaInterfaz{

	@Override
	public void crearNuevoPaciente(List<PacienteDto> listaPacientes, List<EsclavoDto> listaEsclavos) {
		
		PacienteDto paciente = new PacienteDto();
		Scanner sc = new Scanner(System.in);
		System.out.println("PACIENTE");
		System.out.println("Indique el id: ");
		paciente.setIdPaciente(sc.nextLong());
		System.out.println("Indique el nombre: ");
		paciente.setNombrePaciente(sc.next());
		System.out.println("Indique el edad: ");
		paciente.setEdadPaciente(sc.nextInt());
		System.out.println("Indique el fecha de nacimiento: ");
		paciente.setFchNacimientoPaciente(sc.next());
		System.out.println("Indique el sexo biológico (M/F): ");
		paciente.setSexoBiologicoPaciente(sc.next().charAt(0));
		System.out.println("Indique la especie: ");
		paciente.setEspeciePaciente(sc.next());
		System.out.println("El esclavo existe (s/n): ");
		
		if(sc.next().charAt(0) == 'n') {
			paciente.setIdEsclavo(crearNuevoEclavo(listaEsclavos,sc));
			
		}else {
			int contador = 0;
			do {
				contador=0;
				System.out.println("Indique el id del esclavo: ");
				long idEsclavoIndicado = sc.nextLong();
				
				for(EsclavoDto esclavo : listaEsclavos) {
					if(idEsclavoIndicado == esclavo.getIdEsclavo()) {
						contador++;
						paciente.setIdEsclavo(idEsclavoIndicado);
					}
				}			
			}while(contador==0);			
		}
		listaPacientes.add(paciente);
	}
	
	private long crearNuevoEclavo(List<EsclavoDto> listaEsclavos, Scanner sc) {
		System.out.println("ESCLAVO");
		System.out.println("Indique el id: ");
		long id = sc.nextLong();
		System.out.println("Indique el nombre: ");
		String nombre = sc.next();
		System.out.println("Indique apellidos: ");
		String apellidos = sc.next();
		System.out.println("Indique el telefono: ");
		String telefono = sc.next();
		System.out.println("Indique el dni: ");
		String dni = sc.next();
		
		EsclavoDto esclavo = new EsclavoDto(id,nombre,apellidos,dni,telefono);
		listaEsclavos.add(esclavo);
		
		
		return id;		
	}

}
