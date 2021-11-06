package ch.meng.patrick.demo1;

import javax.persistence.*;

@Table(name = "location_entity")
@Entity
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "zip")
    private String zip;
    ;@Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LocationEntity{" +
                "id=" + id +
                ", zip='" + zip + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}