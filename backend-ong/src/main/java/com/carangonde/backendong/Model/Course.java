package com.carangonde.backendong.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Course {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name_curso;
    @Column(unique = true)
    private String desc_curso;

}
