package models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "author")
public class AuthorEntity {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name", unique = true)
    private String name;
}
