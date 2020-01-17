package ru.gbuac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.gbuac.model.Question;

import java.util.List;

@Transactional(readOnly = true)
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Question q WHERE q.id=:id")
    int delete(@Param("id") int id);

    @Query("SELECT q FROM Question q WHERE q.quest.id=:questId ORDER BY q.ordering ASC")
    List<Question> getAll(@Param("questId") int questId);
}
