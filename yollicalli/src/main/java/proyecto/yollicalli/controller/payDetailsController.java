package proyecto.yollicalli.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.yollicalli.model.PayDetails;
import proyecto.yollicalli.service.PayDetailsService;

@RestController
@RequestMapping(path="/api/detallesDePago")
public class payDetailsController {
	
	private final PayDetailsService payDetailsService;
	
	@Autowired
	public payDetailsController(PayDetailsService payDetailsService) {
		this.payDetailsService = payDetailsService;
	}

	@GetMapping
	public ArrayList<PayDetails> getPayDetails() {
		return payDetailsService.getAllPayDetails();
	}
	
	//POST
	@PostMapping
	public PayDetails addPayDetails(@RequestBody PayDetails payDetails){
		return payDetailsService.addPayDetails(payDetails);
	}
	
	//PUT
	@PutMapping (path="{purchaseId}")
	public PayDetails updatePayDetails(@PathVariable ("purchaseId") int purchaseId, 
			@RequestBody PayDetails payDetails){
		return payDetailsService.updatePayDetails(purchaseId, Double.valueOf(payDetails.getAmount()));	
	}
		
	//DELETE
	@DeleteMapping (path="{purchaseId}")
	public PayDetails deletePayDetails(@PathVariable ("purchaseId") int purchaseId){
		return payDetailsService.deletePayDetails(purchaseId);
	}
}
