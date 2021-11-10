package ch.meng.patrick.demo1;

import javax.persistence.*;

@Table(name = "job_entity")
@Entity
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "company")
    private String company;
    ;@Column(name = "contact")
    private String contact;
    @Column(name = "companyRecruiter")
    private String companyRecruiter;
    @Column(name = "contactRecruiter")
    private String contactRecruiter;
    @Column(name = "phoneRecruiter")
    private String phoneRecruiter;
    @Column(name = "emailRecruiter")
    private String emailRecruiter;
    @Column(name = "street")
    private String street;
    @Column(name = "zip")
    private String zip;
    @Column(name = "city")
    private String city;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "website")
    private String website;

    @Column(name = "jobDescriptionUrl")
    private String jobDescriptionUrl;
    @Column(name = "jobDescription", length = 8000)
    private String jobDescription;
    @Column(name = "jobNotes", length = 8000)
    private String jobNotes;

    @Column(name = "salary")
    private String salary;
    @Column(name = "portalUrl")
    private String portalUrl;
    @Column(name = "portalUsername")
    private String portalUsername;
    @Column(name = "portalPW")
    private String portalPW;
    @Column(name = "source")
    private String source;
    @Column(name = "jobPicture")
    private String jobPicture;
    @Column(name = "contactPicture")
    private String contactPicture;
    @Column(name = "contactRecruiterPicture")
    private String contactRecruiterPicture;

    public void setContactRecruiterPicture(String contactRecruiterPicture) {
        this.contactRecruiterPicture = contactRecruiterPicture;
    }

    public String getContactRecruiterPicture() {
        return contactRecruiterPicture;
    }

    public void setContactPicture(String contactPicture) {
        this.contactPicture = contactPicture;
    }

    public String getContactPicture() {
        return contactPicture;
    }

    public void setJobPicture(String jobPicture) {
        this.jobPicture = jobPicture;
    }

    public String getJobPicture() {
        return jobPicture;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setPortalPW(String portalPW) {
        this.portalPW = portalPW;
    }

    public String getPortalPW() {
        return portalPW;
    }

    public void setPortalUsername(String portalUsername) {
        this.portalUsername = portalUsername;
    }

    public String getPortalUsername() {
        return portalUsername;
    }

    public void setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
    }

    public String getPortalUrl() {
        return portalUrl;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setJobNotes(String jobNotes) {
        this.jobNotes = jobNotes;
    }

    public String getJobNotes() {
        return jobNotes;
    }

    public void setJobDescriptionUrl(String jobDescriptionUrl) {
        this.jobDescriptionUrl = jobDescriptionUrl;
    }

    public String getJobDescriptionUrl() {
        return jobDescriptionUrl;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }

    public void setEmailRecruiter(String emailRecruiter) {
        this.emailRecruiter = emailRecruiter;
    }

    public String getEmailRecruiter() {
        return emailRecruiter;
    }

    public void setPhoneRecruiter(String phoneRecruiter) {
        this.phoneRecruiter = phoneRecruiter;
    }

    public String getPhoneRecruiter() {
        return phoneRecruiter;
    }

    public void setContactRecruiter(String contactRecruiter) {
        this.contactRecruiter = contactRecruiter;
    }

    public String getContactRecruiter() {
        return contactRecruiter;
    }

    public void setCompanyRecruiter(String companyRecruiter) {
        this.companyRecruiter = companyRecruiter;
    }

    public String getCompanyRecruiter() {
        return companyRecruiter;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}