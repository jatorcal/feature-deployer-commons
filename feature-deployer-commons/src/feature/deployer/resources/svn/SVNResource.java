package feature.deployer.resources.svn;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class SVNResource {

	// SVN User
	private String user;
	
	// SVN Password
	private String password;
	
	// SVN Path
	private String svnPath;
	
	// Temp Path
	private String tempPath;

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

	public String getSvnPath() {
		return svnPath;
	}

	public void setSvnPath(String svnPath) {
		this.svnPath = svnPath;
	}

	public String getTempPath() {
		return tempPath;
	}

	public void setTempPath(String tempPath) {
		this.tempPath = tempPath;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getUser());
		hcb.append(getPassword());
		hcb.append(getSvnPath());
		hcb.append(getTempPath());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof MVNResource)) {
			return false;
		}
		MVNResource other = (MVNResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getUser(), other.getUser());
		eqb.append(getPassword(), other.getPassword());
		eqb.append(getSvnPath(), other.getSvnPath());
		eqb.append(getTempPath(), other.getTempPath());
		return eqb.isEquals();
	}
}
