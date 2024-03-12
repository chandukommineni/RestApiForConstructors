package api.RestAPI.repositories;

import api.RestAPI.model.Constructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface constructorRepository extends JpaRepository<Constructor,Integer> {
     List<Constructor> findByname(String name);
}
