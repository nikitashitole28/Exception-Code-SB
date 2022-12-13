package demo.testexample.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankModel {
	@Id
	private Integer id;
	private String bname;
	private String address;

}
