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

public class Modal extends Course {
    private String titulo_model_curso;
    @Column(unique = true)
    private String desc_model_curso;

}
