package cz.trixit.skoda.skodatendrchallengesandrewards.domain.reposiroty;

import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeRepository extends JpaRepository<Challenge, Long> {
}
