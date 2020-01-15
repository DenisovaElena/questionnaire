package ru.gbuac.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "user")
public class User extends NamedEntity {

    @SafeHtml
    @Column(name = "firstname")
    private String firstname;

    @SafeHtml
    @Column(name = "lastname")
    private String lastname;

    @SafeHtml
    @Column(name = "patronym")
    private String patronym;

    @SafeHtml
    @Column(name = "position")
    private String position;

    @SafeHtml
    @Column(name = "email")
    private String email;

    @SafeHtml
    @Column(name = "phone")
    private String phone;

    @SafeHtml
    @Column(name = "photo")
    private String photo;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "role_users",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;
}
