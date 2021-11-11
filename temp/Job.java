package ch.meng.jobeffects;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "job_entity")
@Entity
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class Job implements Comparable {
    public static final String APPEND_SIGN = ", ";
    public static final String EMPTYSTRING = "";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String company = EMPTYSTRING;
    private String contact = EMPTYSTRING;
    private String companyRecruiter = EMPTYSTRING;
    private String contactRecruiter = EMPTYSTRING;
    private String phoneRecruiter = EMPTYSTRING;
    private String emailRecruiter = EMPTYSTRING;
    private String street = EMPTYSTRING;
    private String zip = EMPTYSTRING;
    private String city = EMPTYSTRING;
    private String email = EMPTYSTRING;
    private String phone = EMPTYSTRING;
    private String website = EMPTYSTRING;
    private String jobDescription = EMPTYSTRING;
    private String jobDescriptionUrl = EMPTYSTRING;
    private String jobNotes = EMPTYSTRING;
    private String salary = EMPTYSTRING;
    private String portalUrl = EMPTYSTRING;
    private String portalUsername = EMPTYSTRING;
    private String portalPW = EMPTYSTRING;
    private String source = EMPTYSTRING;
    private String rating = EMPTYSTRING;
    private String title = EMPTYSTRING;

    private String jobPicture = EMPTYSTRING;
    private String contactPicture = EMPTYSTRING;
    private String contactRecruiterPicture = EMPTYSTRING;
    List<JobEvent> events = new ArrayList<>();

    @Override
    public String toString() {
        return getPrioString(company, companyRecruiter, APPEND_SIGN) +
                getPrioString(contact, contactRecruiter, APPEND_SIGN) +
                getPrioString(phone, phoneRecruiter, APPEND_SIGN) +
                getPrioString(email, emailRecruiter, "");
    }

    public String getPrioString(String prio, String secondary, String appendSign) {
        if (prio != null && !prio.isEmpty()) return prio + appendSign;
        if (secondary != null && !secondary.isEmpty()) return secondary + appendSign;
        return "";
    }

    public String getStringForSearch() {
        var text = new StringBuilder()
                .append(company)
                .append(contact)
                .append(phone)
                .append(email)
                .append(companyRecruiter)
                .append(contactRecruiter)
                .append(phoneRecruiter)
                .append(emailRecruiter)
                .append(website)
                .append(street).toString();
        return text.toLowerCase().replaceAll("\\s", "");
    }

    private String removeWhitespaces(String text) {
        return text.toLowerCase().replaceAll("\\s", "");
    }

    private String cleanStringForFilename(String text) {
        return text.toLowerCase().replaceAll("\\s", "_");
    }

    public String buildRecruiterContactFilename() {
        if(!contactRecruiter.isEmpty() && !companyRecruiter.isEmpty())
            return cleanStringForFilename(contactRecruiter) + "@" + removeWhitespaces(companyRecruiter);
        if(!emailRecruiter.isEmpty()) return emailRecruiter;
        return "";
    }

    public String buildContactFilename() {
        if(!contact.isEmpty() && !company.isEmpty())
            return cleanStringForFilename(contact) + "@" + removeWhitespaces(company);
        if(!email.isEmpty()) return email;
        return "";
    }

    public String buildCompanyFilename() {
        if(company.isEmpty() || (street.isEmpty() && city.isEmpty())) return "";
        return cleanStringForFilename(company) + "@" + cleanStringForFilename(street) + "@" + cleanStringForFilename(city);
    }

    JobEvent getLastJobEventType() {
        if(!getEvents().isEmpty()) return getEvents().get(getEvents().size()-1);
        return new JobEvent();
    }

    JobEventType getLastJobEventTypeType() {
        if(!getEvents().isEmpty()) return getEvents().get(getEvents().size()-1).getJobEventType();
        return JobEventType.Closed;
    }

    boolean isActive() {
        return switch (getLastJobEventTypeType()) {
            case Rejected, Closed, Cancellation, Pending -> false;
            default -> true;
        };
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
