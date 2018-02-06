package feature.deployer.resources.deploy;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class DeployFrontResource {

	// projectsSourceCodePath
	private String projectsSourceCodePath;
	
	// serverJsParameters
	private List<ServerJsParameterResource> serverJsParameters;
	
	public String getProjectsSourceCodePath() {
		return projectsSourceCodePath;
	}

	public void setProjectsSourceCodePath(String projectsSourceCodePath) {
		this.projectsSourceCodePath = projectsSourceCodePath;
	}	
	
	public List<ServerJsParameterResource> getServerJsParameters() {
		return serverJsParameters;
	}

	public void setServerJsParameters(List<ServerJsParameterResource> serverJsParameters) {
		this.serverJsParameters = serverJsParameters;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getProjectsSourceCodePath());
		hcb.append(getServerJsParameters());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof DeployFrontResource)) {
			return false;
		}
		DeployFrontResource other = (DeployFrontResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getProjectsSourceCodePath(), other.getProjectsSourceCodePath());
		eqb.append(getServerJsParameters(), other.getServerJsParameters());
		return eqb.isEquals();
	}
}
