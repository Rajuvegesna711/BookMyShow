package com.vegesna.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class City extends BaseModel {
    private String name;
    @OneToMany
    private List<Theatre> theatres;
    private String address;
}
