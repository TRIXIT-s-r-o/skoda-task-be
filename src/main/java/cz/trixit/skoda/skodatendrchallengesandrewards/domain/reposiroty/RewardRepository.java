package cz.trixit.skoda.skodatendrchallengesandrewards.domain.reposiroty;

import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardRepository extends JpaRepository<Reward, Long> {
}
