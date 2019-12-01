package arcmop.blog.springbootest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import arcmop.blog.springbootest.entity.Suma;

@Repository
public interface SumaRepository extends JpaRepository<Suma, Long>{

}

