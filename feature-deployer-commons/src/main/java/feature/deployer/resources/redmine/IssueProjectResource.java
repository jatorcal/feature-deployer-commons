package feature.deployer.resources.redmine;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class IssueProjectResource {

	// Id
	private Integer id;
	
	// Project's Name
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getId());
		hcb.append(getName());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof IssueProjectResource)) {
			return false;
		}
		IssueProjectResource other = (IssueProjectResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getId(), other.getId());
		eqb.append(getName(), other.getName());
		return eqb.isEquals();
	}
}
