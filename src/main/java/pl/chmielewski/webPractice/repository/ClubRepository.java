package pl.chmielewski.webPractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.chmielewski.webPractice.models.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {

}
