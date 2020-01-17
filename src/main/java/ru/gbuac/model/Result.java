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
import java.util.List;

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
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "quest_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Quest quest;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "result")
    private List<Answer> answers;
}
