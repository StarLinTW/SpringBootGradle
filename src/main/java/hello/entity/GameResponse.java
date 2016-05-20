package hello.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "game_reponses")
public class GameResponse{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String userId;
	private Timestamp createDate;
	private String MSGID;
	private String B;
	private String VER;
	private String RID;
	private String NRID;
	private String BPL;
	private String LB;
	private String RS;
	private String TW;
	private String WC;
	private String CW;
	private String NFG;
	private String TFG;
	private String CFGG;
	private String FID;
	private String MUL;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getMSGID() {
		return MSGID;
	}
	public void setMSGID(String mSGID) {
		MSGID = mSGID;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	public String getVER() {
		return VER;
	}
	public void setVER(String vER) {
		VER = vER;
	}
	public String getRID() {
		return RID;
	}
	public void setRID(String rID) {
		RID = rID;
	}
	public String getNRID() {
		return NRID;
	}
	public void setNRID(String nRID) {
		NRID = nRID;
	}
	public String getBPL() {
		return BPL;
	}
	public void setBPL(String bPL) {
		BPL = bPL;
	}
	public String getLB() {
		return LB;
	}
	public void setLB(String lB) {
		LB = lB;
	}
	public String getRS() {
		return RS;
	}
	public void setRS(String rS) {
		RS = rS;
	}
	public String getTW() {
		return TW;
	}
	public void setTW(String tW) {
		TW = tW;
	}
	public String getWC() {
		return WC;
	}
	public void setWC(String wC) {
		WC = wC;
	}
	public String getCW() {
		return CW;
	}
	public void setCW(String cW) {
		CW = cW;
	}
	public String getNFG() {
		return NFG;
	}
	public void setNFG(String nFG) {
		NFG = nFG;
	}
	public String getTFG() {
		return TFG;
	}
	public void setTFG(String tFG) {
		TFG = tFG;
	}
	public String getCFGG() {
		return CFGG;
	}
	public void setCFGG(String cFGG) {
		CFGG = cFGG;
	}
	public String getFID() {
		return FID;
	}
	public void setFID(String fID) {
		FID = fID;
	}
	public String getMUL() {
		return MUL;
	}
	public void setMUL(String mUL) {
		MUL = mUL;
	}
}
