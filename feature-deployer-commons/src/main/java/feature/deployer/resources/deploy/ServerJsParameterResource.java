package feature.deployer.resources.deploy;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class ServerJsParameterResource {

	// parameterName
	private String parameterName;
	
	// parameterValue
	private String parameterValue;

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getParameterValue() {
		return parameterValue;
	}

	public void setParameterValue(String parameterValue) {
		this.parameterValue = parameterValue;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getParameterName());
		hcb.append(getParameterValue());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof ServerJsParameterResource)) {
			return false;
		}
		ServerJsParameterResource other = (ServerJsParameterResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getParameterName(), other.getParameterName());
		eqb.append(getParameterValue(), other.getParameterValue());
		return eqb.isEquals();
	}
	
}
