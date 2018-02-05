package feature.deployer.resources.redmine;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class IssueCustomFieldsResource {

	// Id
	private Integer id;
	
	// Name
	private String name;
	
	// Value
	private String value;
	
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getId());
		hcb.append(getName());
		hcb.append(getValue());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof IssueCustomFieldsResource)) {
			return false;
		}
		IssueCustomFieldsResource other = (IssueCustomFieldsResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getId(), other.getId());
		eqb.append(getName(), other.getName());
		eqb.append(getValue(), other.getValue());
		return eqb.isEquals();
	}
}
