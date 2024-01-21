package practice.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String role;
}
