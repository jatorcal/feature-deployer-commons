package feature.deployer.resources.redmine;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class IssueResource {

	// id
	private Integer id;
	
	// project
	private IssueProjectResource project;
	
	// tracker
	private IssueTrackerResource tracker;
	
	// status
	private IssueStatusResource status;
		
	// priority
	private IssuePriorityResource priority;
	
	// author
	private IssueAuthorResource author;
	
	// assigned_to
	private IssueAssignedToResource assigned_to;
	
	// fixed_version
	private IssueFixedVersionResource fixed_version;
	
	// parent
	private IssueParentResource parent;
	
	// subject
	private String subject;
	
	// description
	private String description;
	
	// start_date
	private String start_date;

	// done_ratio
	private Integer done_ratio;

	// estimated_hours
	private Integer estimated_hours;

	// spent_hours
	private Integer spent_hours;

	// custom_fields
	private List<IssueCustomFieldsResource> custom_fields;

	// created_on
	private Date created_on;

	// updated_on
	private Date updated_on;

	// closed_on
	private Date closed_on;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public IssueProjectResource getProject() {
		return project;
	}

	public void setProject(IssueProjectResource project) {
		this.project = project;
	}

	public IssueTrackerResource getTracker() {
		return tracker;
	}

	public void setTracker(IssueTrackerResource tracker) {
		this.tracker = tracker;
	}

	public IssueStatusResource getStatus() {
		return status;
	}

	public void setStatus(IssueStatusResource status) {
		this.status = status;
	}

	public IssuePriorityResource getPriority() {
		return priority;
	}

	public void setPriority(IssuePriorityResource priority) {
		this.priority = priority;
	}

	public IssueAuthorResource getAuthor() {
		return author;
	}

	public void setAuthor(IssueAuthorResource author) {
		this.author = author;
	}

	public IssueAssignedToResource getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(IssueAssignedToResource assigned_to) {
		this.assigned_to = assigned_to;
	}

	public IssueFixedVersionResource getFixed_version() {
		return fixed_version;
	}

	public void setFixed_version(IssueFixedVersionResource fixed_version) {
		this.fixed_version = fixed_version;
	}

	public IssueParentResource getParent() {
		return parent;
	}

	public void setParent(IssueParentResource parent) {
		this.parent = parent;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public Integer getDone_ratio() {
		return done_ratio;
	}

	public void setDone_ratio(Integer done_ratio) {
		this.done_ratio = done_ratio;
	}

	public Integer getEstimated_hours() {
		return estimated_hours;
	}

	public void setEstimated_hours(Integer estimated_hours) {
		this.estimated_hours = estimated_hours;
	}

	public Integer getSpent_hours() {
		return spent_hours;
	}

	public void setSpent_hours(Integer spent_hours) {
		this.spent_hours = spent_hours;
	}

	public List<IssueCustomFieldsResource> getCustom_fields() {
		return custom_fields;
	}

	public void setCustom_fields(List<IssueCustomFieldsResource> custom_fields) {
		this.custom_fields = custom_fields;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public Date getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}

	public Date getClosed_on() {
		return closed_on;
	}

	public void setClosed_on(Date closed_on) {
		this.closed_on = closed_on;
	}

	public int hashCode() {
		HashCodeBuilder hcb = new HashCodeBuilder();
		hcb.append(getAssigned_to());
		hcb.append(getAuthor());
		hcb.append(getClosed_on());
		hcb.append(getId());
		hcb.append(getCreated_on());
		hcb.append(getCustom_fields());
		hcb.append(getDescription());
		hcb.append(getDone_ratio());
		hcb.append(getEstimated_hours());
		hcb.append(getFixed_version());
		hcb.append(getParent());
		hcb.append(getPriority());
		hcb.append(getProject());
		hcb.append(getSpent_hours());
		hcb.append(getStart_date());
		hcb.append(getStatus());
		hcb.append(getSubject());
		hcb.append(getTracker());
		hcb.append(getUpdated_on());
		return hcb.toHashCode();
	}

	public boolean equals(Object object) {
		if (!(object instanceof IssueResource)) {
			return false;
		}
		IssueResource other = (IssueResource) object;
		EqualsBuilder eqb = new EqualsBuilder();
		eqb.append(getAssigned_to(), other.getAssigned_to());
		eqb.append(getAuthor(), other.getAuthor());
		eqb.append(getClosed_on(), other.getClosed_on());
		eqb.append(getId(), other.getId());
		eqb.append(getCreated_on(), other.getCreated_on());
		eqb.append(getCustom_fields(), other.getCustom_fields());
		eqb.append(getDescription(), other.getDescription());
		eqb.append(getDone_ratio(), other.getDone_ratio());
		eqb.append(getEstimated_hours(), other.getEstimated_hours());
		eqb.append(getFixed_version(), other.getFixed_version());
		eqb.append(getParent(), other.getParent());
		eqb.append(getPriority(), other.getPriority());
		eqb.append(getProject(), other.getProject());
		eqb.append(getSpent_hours(), other.getSpent_hours());
		eqb.append(getStart_date(), other.getStart_date());
		eqb.append(getStatus(), other.getStatus());
		eqb.append(getSubject(), other.getSubject());
		eqb.append(getTracker(), other.getTracker());
		eqb.append(getUpdated_on(), other.getUpdated_on());
		return eqb.isEquals();
	}
}
