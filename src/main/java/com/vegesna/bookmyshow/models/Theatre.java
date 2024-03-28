package com.vegesna.bookmyshow.models;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Data
@Entity
public class Theatre extends BaseModel {
    private String name;
//    @Getter
//    @Setter
    @OneToMany
    private List<Screen> screens;
}
