package ru.gbuac.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "answer")
public class Answer extends NamedEntity {

    @SafeHtml
    @Column(name = "rate")
    private String rate;

    @SafeHtml
    @Column(name = "wish")
    private String wish;

    @SafeHtml
    @Column(name = "goal")
    private String goal;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Question question;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "catalogelem_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private CatalogElem catalogElem;
}
