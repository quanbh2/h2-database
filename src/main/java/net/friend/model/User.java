package net.friend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "career")
    private String career;
}
