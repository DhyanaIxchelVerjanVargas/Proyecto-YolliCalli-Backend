package proyecto.yollicalli.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Service;

import proyecto.yollicalli.model.ResumenPedido;

@Service
public class ResumenPedidoService {
	public final ArrayList<ResumenPedido> listaPedidos = new ArrayList<ResumenPedido>();
	
	public ResumenPedidoService() {
		
		listaPedidos.add( new ResumenPedido(new Date(), "En proceso") );
		listaPedidos.add( new ResumenPedido(new Date(), "En proceso") );
		listaPedidos.add( new ResumenPedido(new Date(), "Enviado") );
		listaPedidos.add( new ResumenPedido(new Date(), "Entregado") );
		
	}//constructor
	
	public ArrayList<ResumenPedido> getResumenes() {
		return listaPedidos;
	}

	public ResumenPedido getResumen(int pedidoId) {
		ResumenPedido resumenTemporal = null;
		for (ResumenPedido resumen : listaPedidos) {
			if(resumen.getId() == pedidoId) {
				resumenTemporal = resumen;
				break;
			}
		}
		return resumenTemporal;
	}

	public ResumenPedido addResumen(ResumenPedido resumenPedido) {
		ResumenPedido resumenTemporal = null;
		if(listaPedidos.add(resumenPedido)) {
			resumenTemporal = resumenPedido;
		}
		return resumenTemporal;
	}

	public ResumenPedido updateResumen(int pedidoId, String estadoPedido) {
		ResumenPedido resumenTemporal = null;
		for (ResumenPedido resumen : listaPedidos) {
			if(resumen.getId() == pedidoId) {
				if(estadoPedido != null) resumen.setEstado(estadoPedido);
				resumenTemporal = resumen;
				break;
			}
		}
		return resumenTemporal;
	}

	public ResumenPedido deleteResumen(int pedidoId) {
		ResumenPedido resumenTemporal = null;
		for (ResumenPedido resumen : listaPedidos) {
			if(resumen.getId() == pedidoId) {
				resumenTemporal = resumen;
				listaPedidos.remove(resumen);
				break;
			}
		}
		return resumenTemporal;
	}

	

}
