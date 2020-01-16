package ru.gbuac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.gbuac.model.Result;

@Transactional(readOnly = true)
public interface ResultRepository extends JpaRepository<Result, Integer> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Result r WHERE r.id=:id")
    int delete(@Param("id") int id);
}
