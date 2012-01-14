package dades;


import java.util.Date;

public class BonsHotelsId implements java.io.Serializable {

	private Float quotaFixa;
	private Float quotaVariable;
	
	public BonsHotelsId(float quotaFixa, float quotaVariable) {
		this.quotaFixa = quotaFixa;
		this.quotaVariable = quotaVariable;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((quotaFixa == null) ? 0 : quotaFixa.hashCode());
		result = prime * result
				+ ((quotaVariable == null) ? 0 : quotaVariable.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BonsHotelsId other = (BonsHotelsId) obj;
		if (quotaFixa == null) {
			if (other.quotaFixa != null)
				return false;
		} else if (!quotaFixa.equals(other.quotaFixa))
			return false;
		if (quotaVariable == null) {
			if (other.quotaVariable != null)
				return false;
		} else if (!quotaVariable.equals(other.quotaVariable))
			return false;
		
		return true;
	}

}
