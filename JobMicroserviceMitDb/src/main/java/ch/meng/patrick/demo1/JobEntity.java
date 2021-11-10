package ch.meng.patrick.demo1;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
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
}