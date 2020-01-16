package ru.gbuac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.gbuac.model.Answer;

@Transactional(readOnly = true)
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Answer a WHERE a.id=:id")
    int delete(@Param("id") int id);
}
