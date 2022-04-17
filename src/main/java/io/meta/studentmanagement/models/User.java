package io.meta.studentmanagement.models;

import io.meta.studentmanagement.models.enums.RoleType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "user_table")
@Getter
@Setter
public class User {
    @Id
    @Column(name = "user_id")
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence")
    @GeneratedValue(strategy = SEQUENCE, generator = "user_sequence")
    private int id;
    @Column(name = "role_type", nullable = false)
    @Enumerated
    private RoleType role;
}
