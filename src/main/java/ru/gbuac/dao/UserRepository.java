package ru.gbuac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.gbuac.model.User;
import ru.gbuac.to.UserTo;

import java.util.List;

@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Integer> {
    @Transactional
    @Modifying
    @Query("DELETE FROM User u WHERE u.id=:id")
    int delete(@Param("id") int id);

    @Query("SELECT new ru.gbuac.to.UserTo(e.id, CONCAT(e.lastname, ' ', e.firstname, ' ', e.patronym), e.phone, e" +
            ".position) " +
            "FROM Employee e ORDER BY e.lastname ASC")
    List<UserTo> getAll();

    @Query("SELECT e FROM Employee e WHERE lower(e.name)=lower(:name)")
    User getByName(@Param("name") String name);
}
