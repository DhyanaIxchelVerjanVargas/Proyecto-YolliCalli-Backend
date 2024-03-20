package proyecto.yollicalli.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import proyecto.yollicalli.model.PaymentMethod;

@Service
public class PayMethodsService {

public final ArrayList<PaymentMethod> list = new ArrayList<PaymentMethod>();
	
	public PayMethodsService() {
		list.add( new PaymentMethod("TDC"));
		list.add( new PaymentMethod("Paypal"));
		list.add( new PaymentMethod("Oxxo"));
		list.add( new PaymentMethod("TDC"));		
		}
	
	public ArrayList<PaymentMethod> getAllPayMethods() {
		// TODO Auto-generated method stub
		return list;
	}

	public PaymentMethod getPayDetails(int purchaseId) {
		// TODO Auto-generated method stub
		PaymentMethod tmpMethod = null;
		for (PaymentMethod paymentMethod : list) {
			if (purchaseId == paymentMethod.getId()) {
				tmpMethod = paymentMethod;
				break;
			}
		}
		return tmpMethod;
	}
	
	public PaymentMethod addPaymentMethod(PaymentMethod paymentMethod) {
		// TODO Auto-generated method stub
		PaymentMethod tmpMethod = null;
		if (list.add(paymentMethod)) {
			tmpMethod = paymentMethod;
		}
		return tmpMethod;
	}

	public PaymentMethod deletePaymentMethod(int purchaseId) {
		// TODO Auto-generated method stub
		PaymentMethod tmpMethod = null;
		for (PaymentMethod paymentMethod : list) {
			if (purchaseId == paymentMethod.getId()) {
				tmpMethod = paymentMethod;
				list.remove(paymentMethod);
				break;
			}
		}
		return tmpMethod;
	}

	public PaymentMethod updatePaymentMethod(int purchaseId, String method) {
		// TODO Auto-generated method stub
		PaymentMethod tmpMethod = null;
		for (PaymentMethod paymentMethod : list) {
			if (purchaseId == paymentMethod.getId()) {
				tmpMethod = paymentMethod;
				if (method!=null) paymentMethod.setNombreMetodo(method);
				break;
			}
		}
		return tmpMethod;
	}
}
