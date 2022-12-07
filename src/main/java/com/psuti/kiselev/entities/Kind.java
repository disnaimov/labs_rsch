package com.psuti.kiselev.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name ="kinds")
public class Kind implements Serializable {
   @Id
    @Column(name = "name", nullable = false)
    private String name;
}
