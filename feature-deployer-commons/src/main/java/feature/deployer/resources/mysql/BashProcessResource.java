package feature.deployer.resources.mysql;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class BashProcessResource {
		
	// PID
	private Integer pid;
	
	// PROCESS_NAME
	private String processName;
	
	// PROCESS_DESCRIPTION
	private String processDescription;
	
	// ASSOCIATED_PID
	private Integer associatedPid;
	
	// ASSOCIATED_PROCESS_NAME
	private String associatedProcessName; 
	
	// TYPE_DESCRIPTION
	private String typeDescription;
	

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessDescription() {
		return processDescription;
	}

	public void setProcessDescription(String processDescription) {
		this.processDescription = processDescription;
	}

	public Integer getAssociatedPid() {
		return associatedPid;
	}

	public void setAssociatedPid(Integer associatedPid) {
		this.associatedPid = associatedPid;
	}

	public String getAssociatedProcessName() {
		return associatedProcessName;
	}

	public void setAssociatedProcessName(String associatedProcessName) {
		this.associatedProcessName = associatedProcessName;
	}

	public String getTypeDescription() {
		return typeDescription;
	}

	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getPid());
		hcb.append(getProcessName());
		hcb.append(getProcessDescription());
		hcb.append(getTypeDescription());
		hcb.append(getAssociatedPid());
		hcb.append(getAssociatedProcessName());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof BashProcessResource)) {
			return false;
		}
		BashProcessResource other = (BashProcessResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getPid(), other.getPid());
		eqb.append(getProcessName(), other.getProcessName());
		eqb.append(getProcessDescription(), other.getProcessDescription());
		eqb.append(getTypeDescription(), other.getTypeDescription());
		eqb.append(getAssociatedPid(), other.getAssociatedPid());
		eqb.append(getAssociatedProcessName(), other.getAssociatedProcessName());		
		return eqb.isEquals();
	}
}
