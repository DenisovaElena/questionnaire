package ru.gbuac.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "result")
public class Result extends BaseEntity {

    @Column(name = "answer_start")
    private Time answerStart;

    @Column(name = "answer_modified")
    private Time answerModified;

    @Column(name = "username")
    private String username;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status_id")
    private Status status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "quest_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Quest quest;
}
