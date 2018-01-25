package feature.deployer.resources.deploy;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class TomcatAPIResources {

	// Tomcat's manager-script user
	public String user;
	
	// Tomcat's manager-script user
	public String password;
	
	// War
	public String warPath;

	// Context
	public String context;
	
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWarPath() {
		return warPath;
	}

	public void setWarPath(String warPath) {
		this.warPath = warPath;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getUser());
		hcb.append(getPassword());
		hcb.append(getWarPath());
		hcb.append(getWarPath());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof TomcatAPIResources)) {
			return false;
		}
		TomcatAPIResources other = (TomcatAPIResources) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getUser(), other.getUser());
		eqb.append(getUser(), other.getPassword());
		eqb.append(getUser(), other.getWarPath());
		eqb.append(getUser(), other.getWarPath());
		return eqb.isEquals();
	}
}
