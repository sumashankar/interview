package uk.geoplace.interview.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uk.geoplace.interview.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}