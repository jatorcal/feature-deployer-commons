package feature.deployer.resources.deploy;

import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import feature.deployer.resources.mysql.DefinedFrontProjectResource;

public class DeployFrontResource {

	// projectsSourceCodePath
	private String projectsSourceCodePath;
	
	// serverJsParameters
	private List<ServerJsParameterResource> serverJsParameters;
	
	// frontProject
	private DefinedFrontProjectResource frontProject;
	
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

	public DefinedFrontProjectResource getFrontProject() {
		return frontProject;
	}

	public void setFrontProject(DefinedFrontProjectResource frontProject) {
		this.frontProject = frontProject;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getProjectsSourceCodePath());
		hcb.append(getServerJsParameters());
		hcb.append(getFrontProject());
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
		eqb.append(getFrontProject(), other.getFrontProject());
		return eqb.isEquals();
	}
}
