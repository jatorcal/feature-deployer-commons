package feature.deployer.resources.redmine;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class RedmineResource {

	// user
	private String user;
	
	// password
	private String password;
	
	// uri
	private String uri;	
	
	// moduleName
	private String moduleName;
	
	// versionOrigin
	private String versionOrigen;
		
	// versionFinal
	private String versionFinal;
	
	
	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getVersionOrigen() {
		return versionOrigen;
	}

	public void setVersionOrigen(String versionOrigen) {
		this.versionOrigen = versionOrigen;
	}

	public String getVersionFinal() {
		return versionFinal;
	}

	public void setVersionFinal(String versionFinal) {
		this.versionFinal = versionFinal;
	}

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

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getModuleName());
		hcb.append(getVersionOrigen());
		hcb.append(getVersionFinal());
		hcb.append(getUser());
		hcb.append(getPassword());
		hcb.append(getUri());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof RedmineResource)) {
			return false;
		}
		RedmineResource other = (RedmineResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getModuleName(), other.getModuleName());
		eqb.append(getVersionOrigen(), other.getVersionOrigen());
		eqb.append(getVersionFinal(), other.getVersionFinal());
		eqb.append(getPassword(), other.getPassword());
		eqb.append(getUser(), other.getUser());
		eqb.append(getUri(), other.getUri());
		return eqb.isEquals();
	}
}
