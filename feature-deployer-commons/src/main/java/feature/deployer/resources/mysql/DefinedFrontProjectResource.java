package feature.deployer.resources.mysql;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class DefinedFrontProjectResource {

	// PROJECT_NAME
	private String projectName;
	
	// PROJECT_DESCRIPTION
	private String projectDescription;
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getProjectName());
		hcb.append(getProjectDescription());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof DefinedFrontProjectResource)) {
			return false;
		}
		DefinedFrontProjectResource other = (DefinedFrontProjectResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getProjectName(), other.getProjectName());
		eqb.append(getProjectDescription(), other.getProjectDescription());
		return eqb.isEquals();
	}
	
}
