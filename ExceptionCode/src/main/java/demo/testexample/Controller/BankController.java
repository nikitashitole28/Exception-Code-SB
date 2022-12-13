package demo.testexample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.testexample.Model.BankModel;
import demo.testexample.Service.BankService;


@RestController
@RequestMapping("bank")
public class BankController {
	
	@Autowired
	BankService bankService;
	
	@GetMapping("/getbanks")
	public List<BankModel> getAllBank(){
		List<BankModel> lst=bankService.getAllBank(); 
		return lst;
	}
	
		@PostMapping("/save")
		public String saveBank(@RequestBody BankModel bankModel){
			bankService.saveBank(bankModel); 
			return "records saved successfully";
		}
		
		@PutMapping("/update/{id}")
		public String updatebank(@RequestBody BankModel emp,@PathVariable Integer id) {
			bankService.updatebank(emp,id);
				return "bank updated successfully";
			}
		
		@DeleteMapping("/delete/{id}")
		public String deletebank(@PathVariable Integer id) {
			bankService.deletebank(id);
				return "bank deleted successfully";
			}
		

}
