package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;
import java.util.Set;

public class BrandEntity {
    @Id
    @Column(name="company_name")
    private String companyName;

    @Column(name="siretNumber", length = 11)
    private String siretNumber;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private BrandType type;

    @ManyToOne
    private Set<ProductEntity> product;
}