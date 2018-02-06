package feature.deployer.resources.deploy;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class TomcatAPIResource {

	// Tomcat's manager-script user
	private String user;
	
	// Tomcat's manager-script user
	private String password;
	
	// Tomcat's host
	private String host;
	
	// Tomcat's port
	private String port;
	
	// War
	private String warPath;

	// Context
	private String context;
	
	
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

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
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
		hcb.append(getHost());
		hcb.append(getPort());
		hcb.append(getWarPath());
		hcb.append(getContext());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof TomcatAPIResource)) {
			return false;
		}
		TomcatAPIResource other = (TomcatAPIResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getUser(), other.getUser());
		eqb.append(getPassword(), other.getPassword());
		eqb.append(getHost(), other.getHost());
		eqb.append(getPort(), other.getPort());
		eqb.append(getWarPath(), other.getWarPath());
		eqb.append(getContext(), other.getContext());
		return eqb.isEquals();
	}
}
