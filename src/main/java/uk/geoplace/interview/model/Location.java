package uk.geoplace.interview.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;


@Entity
@Table(name = "locations")
@Getter
@Setter
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "uprn")
    private BigInteger uprn;

    @Column(name = "authcode")
    private Integer authcode;

    @Column(name = "building_description")
    private String building_description;

    public Location() {
    }
    public Location(BigInteger uprn, Integer authcode, String building_description) {
        this.uprn = uprn;
        this.authcode = authcode;
        this.building_description = building_description;
    }

}
