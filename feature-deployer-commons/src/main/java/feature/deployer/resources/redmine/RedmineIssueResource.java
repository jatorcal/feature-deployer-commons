package feature.deployer.resources.redmine;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class RedmineIssueResource {

	// Issue
	private IssueResource issue;
	
	public IssueResource getIssue() {
		return issue;
	}

	public void setIssue(IssueResource issue) {
		this.issue = issue;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getIssue());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof RedmineIssueResource)) {
			return false;
		}
		RedmineIssueResource other = (RedmineIssueResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getIssue(), other.getIssue());
		return eqb.isEquals();
	}
}
