package cz.trixit.skoda.skodatendrchallengesandrewards.service;

import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.Reward;
import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.enums.RewardState;
import cz.trixit.skoda.skodatendrchallengesandrewards.domain.reposiroty.RewardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RewardService {
    private final RewardRepository rewardRepository;

    public List<Reward> list() {
        return rewardRepository.findAll();
    }

    public Reward useReward(Long id) {
        Reward reward = rewardRepository.getReferenceById(id);
        reward.setState(RewardState.USED);
        return reward;
    }
}
