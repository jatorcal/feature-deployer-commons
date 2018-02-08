package feature.deployer.resources.mysql;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class CurrentFrontDeployResource {

	// PID_BASH_PROCESS
	private Integer pidBashProcess;
	
	// PROJECT_NAME
	private String projectName;
	
	// PROJECT_DESCRIPTION
	private String projectDescription;
	
	// SERVER_PORT
	private Integer serverPort;
	
	// BACKEND_SERVER_PORT
	private Integer backendServerPort;
	
	
	public Integer getPidBashProcess() {
		return pidBashProcess;
	}

	public void setPidBashProcess(Integer pidBashProcess) {
		this.pidBashProcess = pidBashProcess;
	}

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

	public Integer getServerPort() {
		return serverPort;
	}

	public void setServerPort(Integer serverPort) {
		this.serverPort = serverPort;
	}
	
	public Integer getBackendServerPort() {
		return backendServerPort;
	}

	public void setBackendServerPort(Integer backendServerPort) {
		this.backendServerPort = backendServerPort;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getPidBashProcess());
		hcb.append(getProjectName());
		hcb.append(getProjectDescription());
		hcb.append(getServerPort());
		hcb.append(getBackendServerPort());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof CurrentFrontDeployResource)) {
			return false;
		}
		CurrentFrontDeployResource other = (CurrentFrontDeployResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getPidBashProcess(), other.getPidBashProcess());
		eqb.append(getProjectName(), other.getProjectName());
		eqb.append(getProjectDescription(), other.getProjectDescription());
		eqb.append(getServerPort(), other.getServerPort());
		eqb.append(getBackendServerPort(), other.getBackendServerPort());
		return eqb.isEquals();
	}
	
}
