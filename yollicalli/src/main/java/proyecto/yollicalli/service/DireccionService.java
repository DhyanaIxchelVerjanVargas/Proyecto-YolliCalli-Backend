package proyecto.yollicalli.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import proyecto.yollicalli.model.Direccion;

@Service
public class DireccionService {
	
	public final ArrayList<Direccion> list = new ArrayList<Direccion>();
	
	public DireccionService() {
		
		list.add(new Direccion("Tata Jesucristo", "San Antonio, Iztapalapa", "CDMX", "CDMX", "09900"));
		list.add(new Direccion("Cuitláhuac", "San Lorenzo, Xochimilco", "CDMX", "CDMX", "09800"));
		list.add(new Direccion("Juan Escutia", "San Miguel, Texcoco", "Estado de México", "Estado de México", "09900"));
		list.add(new Direccion("Guillermo Prieto", "Barranca del Muerto, La Piedad", "Colima", "Colima", "09900"));
	}//DireccionService

	public ArrayList<Direccion> getAllDirecciones() {

		return list;
	}//getAllDirecciones

	public Direccion getDireccion(int direccionId) {
		Direccion tmpDireccion = null;
		for (Direccion direccion : list) {
			if(direccion.getId()==direccionId) {
				tmpDireccion=direccion;
				break;
			}// if ==
		}//foreach
		return tmpDireccion;
	}//getDireccion

	public Direccion addDireccion(Direccion direccion) {
		Direccion tmpDireccion=null;
		if(list.add(direccion)){
			tmpDireccion=direccion;
		}//if
		return tmpDireccion;
	}//addDireccion

	public Direccion deleteDireccion(int direccionId) {
		Direccion tmpDireccion = null;
		for (Direccion direccion : list) {
			if(direccion.getId()==direccionId) {
				tmpDireccion=direccion;
				list.remove(tmpDireccion);
				break;
			}// if ==
		}//foreach
		return tmpDireccion;
	}

	public Direccion updateDireccion(int direccionId, String calle, String municipio_alcaldia, String estado,
			String ciudad, String cp) {
		Direccion tmpDireccion = null;
		for (Direccion direccion : list) {
			if(direccion.getId()==direccionId) {
				tmpDireccion=direccion;
				if (calle.length()!=0) direccion.setCalle(calle);
				if (municipio_alcaldia.length()!=0) direccion.setMunicipio_alcaldia(municipio_alcaldia);
				if (estado.length()!=0) direccion.setEstado(estado);
				if (ciudad.length()!=0) direccion.setCiudad(ciudad);
				if (cp.length()!=0) direccion.setCp(cp);
				break;
			}// if ==
		}//foreach
		
		return tmpDireccion;
	}//updateDireccion
	
}//class DireccionService
