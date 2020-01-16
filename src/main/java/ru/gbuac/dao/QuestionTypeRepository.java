package ru.gbuac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.gbuac.model.QuestionType;

@Transactional(readOnly = true)
public interface QuestionTypeRepository extends JpaRepository<QuestionType, Integer> {
    @Transactional
    @Modifying
    @Query("DELETE FROM QuestionType q WHERE q.id=:id")
    int delete(@Param("id") int id);
}
