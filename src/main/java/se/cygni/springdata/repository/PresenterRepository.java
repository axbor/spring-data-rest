package se.cygni.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import se.cygni.springdata.entity.Presenter;

import java.util.List;

public interface PresenterRepository extends CrudRepository<Presenter, Long> {

    List<Presenter> findByLastName(@Param("q") String name);

}