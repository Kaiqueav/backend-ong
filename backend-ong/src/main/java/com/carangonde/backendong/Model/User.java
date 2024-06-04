package com.carangonde.backendong.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "User")
@Table(name = "User")
public class User {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(unique = true)
    private String email;
    @NotNull
    @Size(min = 6,  message = "A senha deve ter 6 caracteres")
    private String password;
    @Temporal(TemporalType.DATE)
    private Date birthday;
}
