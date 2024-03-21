package proyecto.yollicalli.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import proyecto.yollicalli.model.Compra;

@Service
public class CompraService {

	public final ArrayList<Compra> list = new ArrayList<Compra>();
	
	public CompraService() {
		list.add(new Compra(1250.35, 180.00));
		list.add(new Compra(256.00, 180.00));
		list.add(new Compra(380.50, 180.00));
		list.add(new Compra(450.87, 180.00));
	}
	
	public ArrayList<Compra> getAllCompras(){
		return list;
	}// getAllCompras

	
	public Compra getCompra(int compraId) {
		Compra tmpCompra = null;
		for (Compra compra : list) {
			if(compra.getId() == compraId) {
				tmpCompra = compra;
				break;
			}
		}
		return tmpCompra;
	}// getCompra

	public Compra addCompra(Compra compra) {
		Compra tmpCompra = null;
		if(list.add(compra)) {
			tmpCompra = compra;
		}
		return tmpCompra;
	}

	public Compra deleteCompra(int compraId) {
		Compra tmpCompra = null;
		for (Compra compra : list) {
			if(compra.getId() == compraId) {
				tmpCompra = compra;
				list.remove(tmpCompra);
				break;
			}
		}
		return tmpCompra;
	}

	
	public Compra updateCompra(int compraId, Double subtotal, Double envio) {
		Compra tmpCompra = null;
		for (Compra compra : list) {
			if(compra.getId() == compraId) {
				if(subtotal.doubleValue() > 0) compra.setSubtotal(subtotal);
				if(envio.doubleValue() > 0) compra.setEnvio(envio);
				compra.setTotal(compra.getSubtotal() + compra.getEnvio());
				tmpCompra = compra;
				break;
			}
		}
		return tmpCompra;
	}
	
	/*
	public Compra updateCompra(int compraId, Double subtotal, Double envio) {
		Compra tmpCompra = null;
		for (Compra compra : list) {
			if(compra.getId() == compraId) {
				if(subtotal != null) compra.setSubtotal(subtotal);
				if(envio != null) compra.setEnvio(envio);
				compra.setTotal(compra.getSubtotal() + compra.getEnvio());
				tmpCompra = compra;
				break;
			}
		}
		return tmpCompra;
	}
	*/

}
