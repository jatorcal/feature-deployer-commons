package feature.deployer.resources.mvn;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class MVNResource {

	private String mvnProjectPath;

	public String getMvnProjectPath() {
		return mvnProjectPath;
	}

	public void setMvnProjectPath(String mvnProjectPath) {
		this.mvnProjectPath = mvnProjectPath;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getMvnProjectPath());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof MVNResource)) {
			return false;
		}
		MVNResource other = (MVNResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getMvnProjectPath(), other.getMvnProjectPath());
		return eqb.isEquals();
	}
}
