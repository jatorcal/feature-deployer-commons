package feature.deployer.resources.redmine;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class IssueParentResource {

	// Id
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getId());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof IssueParentResource)) {
			return false;
		}
		IssueParentResource other = (IssueParentResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getId(), other.getId());
		return eqb.isEquals();
	}
}
