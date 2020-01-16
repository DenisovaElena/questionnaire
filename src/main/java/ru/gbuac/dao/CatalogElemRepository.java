package ru.gbuac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.gbuac.model.CatalogElem;

@Transactional(readOnly = true)
public interface CatalogElemRepository extends JpaRepository<CatalogElem, Integer> {
    @Transactional
    @Modifying
    @Query("DELETE FROM CatalogElem c WHERE c.id=:id")
    int delete(@Param("id") int id);
}
