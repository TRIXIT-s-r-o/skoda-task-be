package cz.trixit.skoda.skodatendrchallengesandrewards.service;

import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.Challenge;
import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.enums.ChallengeState;
import cz.trixit.skoda.skodatendrchallengesandrewards.domain.reposiroty.ChallengeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChallengeService {
    private final ChallengeRepository challengeRepository;

    public List<Challenge> list() {
        return challengeRepository.findAll();
    }

    public Challenge activateChallenge(Long id) {
        Challenge challenge = challengeRepository.getReferenceById(id);
        challenge.setState(ChallengeState.ACTIVE);
        return challenge;
    }

    public Challenge deactivateChallenge(Long id) {
        Challenge challenge = challengeRepository.getReferenceById(id);
        challenge.setState(ChallengeState.AVAILABLE);
        return challenge;
    }
}
