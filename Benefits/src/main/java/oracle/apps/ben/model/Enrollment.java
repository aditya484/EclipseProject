package oracle.apps.ben.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "enrollment")
@XmlType
public class Enrollment {

	private long prttEnrtRsltId;
	private Date enrtCvgStrtDt;
	private Date enrtCvgThruDt;
	private int pgmId;
	private int plId;
	private int oiplId;
	private int optId;
	private String sspnddFlag;
	private String interimFlag;
	private String enrtMthdCd;
	private String uom;
	private int bnftAmt;
	private String pgmName;
	private String plTypName;
	private String plName;
	private String optName;
	private long perInLerId;
	
	public long getPrttEnrtRsltId() {
		return prttEnrtRsltId;
	}
	public void setPrttEnrtRsltId(long prttEnrtRsltId) {
		this.prttEnrtRsltId = prttEnrtRsltId;
	}
	public Date getEnrtCvgStrtDt() {
		return enrtCvgStrtDt;
	}
	public void setEnrtCvgStrtDt(Date enrtCvgStrtDt) {
		this.enrtCvgStrtDt = enrtCvgStrtDt;
	}
	public Date getEnrtCvgThruDt() {
		return enrtCvgThruDt;
	}
	public void setEnrtCvgThruDt(Date enrtCvgThruDt) {
		this.enrtCvgThruDt = enrtCvgThruDt;
	}
	public int getPgmId() {
		return pgmId;
	}
	public void setPgmId(int pgmId) {
		this.pgmId = pgmId;
	}
	public int getPlId() {
		return plId;
	}
	public void setPlId(int plId) {
		this.plId = plId;
	}
	public int getOiplId() {
		return oiplId;
	}
	public void setOiplId(int oiplId) {
		this.oiplId = oiplId;
	}
	public int getOptId() {
		return optId;
	}
	public void setOptId(int optId) {
		this.optId = optId;
	}
	public String getSspnddFlag() {
		return sspnddFlag;
	}
	public void setSspnddFlag(String sspnddFlag) {
		this.sspnddFlag = sspnddFlag;
	}
	public String getInterimFlag() {
		return interimFlag;
	}
	public void setInterimFlag(String interimFlag) {
		this.interimFlag = interimFlag;
	}
	public String getEnrtMthdCd() {
		return enrtMthdCd;
	}
	public void setEnrtMthdCd(String enrtMthdCd) {
		this.enrtMthdCd = enrtMthdCd;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public int getBnftAmt() {
		return bnftAmt;
	}
	public void setBnftAmt(int bnftAmt) {
		this.bnftAmt = bnftAmt;
	}
	public String getPgmName() {
		return pgmName;
	}
	public void setPgmName(String pgmName) {
		this.pgmName = pgmName;
	}
	public String getPlTypName() {
		return plTypName;
	}
	public void setPlTypName(String plTypName) {
		this.plTypName = plTypName;
	}
	public String getPlName() {
		return plName;
	}
	public void setPlName(String plName) {
		this.plName = plName;
	}
	public String getOptName() {
		return optName;
	}
	public void setOptName(String optName) {
		this.optName = optName;
	}
	
	public long getPerInLerId() {
		return perInLerId;
	}
	public void setPerInLerId(long perInLerId) {
		this.perInLerId = perInLerId;
	}
	@Override
	public String toString() {
		return "Enrollment [prttEnrtRsltId=" + prttEnrtRsltId + ", enrtCvgStrtDt=" + enrtCvgStrtDt + ", enrtCvgThruDt="
				+ enrtCvgThruDt + ", pgmName=" + pgmName + ", plTypName=" + plTypName + ", plName=" + plName
				+ ", optName=" + optName + "]";
	}
	
	
	
}
