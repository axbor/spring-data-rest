package se.cygni.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import se.cygni.springdata.entity.Admin;

import java.util.List;

public interface AdminRepository extends CrudRepository<Admin, Long> {

    List<Admin> findByPresenterListFirstNameContains(@Param("q") String name);

}
