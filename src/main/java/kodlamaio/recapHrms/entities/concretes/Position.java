package kodlamaio.recapHrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="positions")

@Data
public class Position {
	
	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
  
	@Column(name="Name")
	private String name;

	public Position() {}
	
	public Position(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
