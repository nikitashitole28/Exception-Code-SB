package demo.testexample.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import demo.testexample.Model.BankModel;

@Repository
public interface BankRepository extends CrudRepository<BankModel, Integer> {

}
