package proyecto.yollicalli.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import proyecto.yollicalli.model.PayDetails;

@Service
public class PayDetailsService {

	public final ArrayList<PayDetails> list = new ArrayList<PayDetails>();
	
	public PayDetailsService() {
		list.add( new PayDetails(49.90));
		list.add( new PayDetails(231.00));
		list.add( new PayDetails(1225.90));
		list.add( new PayDetails(779.00));		
		}
	
	public ArrayList<PayDetails> getAllPayDetails() {
		// TODO Auto-generated method stub
		return list;
	}

	public PayDetails getPayDetails(int purchaseId) {
		// TODO Auto-generated method stub
		PayDetails tmpPayment = null;
		for (PayDetails payDetails : list) {
			if (purchaseId == payDetails.getId()) {
				tmpPayment = payDetails;
				break;
			}
		}
		return tmpPayment;
	}
	
	public PayDetails addPayDetails(PayDetails payDetails) {
		// TODO Auto-generated method stub
		PayDetails tmpPayment = null;
		if (list.add(payDetails)) {
			tmpPayment = payDetails;
		}
		return tmpPayment;
	}

	public PayDetails deletePayDetails(int purchaseId) {
		// TODO Auto-generated method stub
		PayDetails tmpPayment = null;
		for (PayDetails payDetails : list) {
			if (purchaseId == payDetails.getId()) {
				tmpPayment = payDetails;
				list.remove(payDetails);
				break;
			}
		}
		return tmpPayment;
	}

	public PayDetails updatePayDetails(int purchaseId, Double amount) {
		// TODO Auto-generated method stub
		PayDetails tmpPayment = null;
		for (PayDetails payDetails : list) {
			if (purchaseId == payDetails.getId()) {
				tmpPayment = payDetails;
				if (amount!=null) payDetails.setAmount(amount);
				break;
			}
		}
		return tmpPayment;
	}
}
