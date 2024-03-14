package api.RestAPI.repositories;

import api.RestAPI.model.Constructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface constructorRepository extends JpaRepository<Constructor,Integer> {
     List<Constructor> findByname(String name);
     @Query("SELECT e FROM Constructor e ORDER BY e.rating DESC")
     public List<Constructor> findTopByratingDesc();


}
