package hello.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Payloads")
public class Payload {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String GN;
	private String PID;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGN() {
		return GN;
	}
	public void setGN(String gN) {
		GN = gN;
	}
	public String getPID() {
		return PID;
	}
	public void setPID(String pID) {
		PID = pID;
	}
}
