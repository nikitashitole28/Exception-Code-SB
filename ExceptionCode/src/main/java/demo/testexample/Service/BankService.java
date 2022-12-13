package demo.testexample.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.testexample.Model.BankModel;
import demo.testexample.Repository.BankRepository;
import demo.testexample.exception.ResourceNotFound;


@Service
public class BankService {
	
	@Autowired
	BankRepository bankRepository;

	public List<BankModel> getAllBank() {
		List<BankModel> ff = (List<BankModel>) bankRepository.findAll();
		
		return ff;
	}

	public void saveBank(BankModel bankModel) {
		bankRepository.save(bankModel);
		
	}
	
	public void updatebank(BankModel bm, Integer id) {
		if(bankRepository.existsById(id)) {
		Optional<BankModel> findById = bankRepository.findById(id);
		BankModel bb = findById.get();
		bb.setId(bm.getId());
		bb.setBname(bm.getBname());
		bb.setAddress(bm.getAddress());
		bankRepository.save(bb);
		}
		else {
			throw new ResourceNotFound("bank id is not available");
		}
	}


	public void deletebank(Integer id) {
		bankRepository.deleteById(id);
		
	}

	

}
