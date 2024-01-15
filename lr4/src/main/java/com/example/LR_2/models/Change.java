package com.example.LR_2.models;
import com.example.LR_2.models.dto.ChangeType;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "log_table")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Change implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    @Column(nullable = false)
    private Long id;

    @Column(name = "log_type")
    @Enumerated(EnumType.STRING)
    private ChangeType changeType;

    @Column(name = "table_name")
    private String tableName;

    @Column(name = "description")
    private String description;
}
