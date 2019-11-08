package oracle.apps.ben.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import oracle.apps.ben.model.Enrollment;

public class EnrollmentMapper implements RowMapper<Enrollment>{

	public Enrollment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Enrollment enrt = new Enrollment();
		enrt.setPrttEnrtRsltId(rs.getLong(1));
		enrt.setEnrtCvgStrtDt(rs.getDate(2));
		enrt.setEnrtCvgThruDt(rs.getDate(3));
		enrt.setPgmId(rs.getInt(4));
		enrt.setPlId(rs.getInt(5));
		enrt.setOiplId(rs.getInt(6));
		enrt.setOptId(rs.getInt(7));
		enrt.setSspnddFlag(rs.getString(8));
		enrt.setInterimFlag(rs.getString(9));
		enrt.setEnrtMthdCd(rs.getString(10));
		enrt.setUom(rs.getString(11));
		enrt.setBnftAmt(rs.getInt(12));
		enrt.setPgmName(rs.getString(13));
		enrt.setPlTypName(rs.getString(14));
		enrt.setPlName(rs.getString(15));
		enrt.setOptName(rs.getString(16));
		enrt.setPerInLerId(rs.getLong(17));
		return enrt;
	}
}
