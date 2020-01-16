package ru.gbuac.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "quest")
public class Quest extends NamedEntity {

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "is_active")
    private Boolean isActive;
}
