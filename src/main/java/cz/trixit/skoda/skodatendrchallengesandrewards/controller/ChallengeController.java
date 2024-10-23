package cz.trixit.skoda.skodatendrchallengesandrewards.controller;

import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.Challenge;
import cz.trixit.skoda.skodatendrchallengesandrewards.dto.ChallengeDto;
import cz.trixit.skoda.skodatendrchallengesandrewards.mapper.ChallengeMapper;
import cz.trixit.skoda.skodatendrchallengesandrewards.service.ChallengeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@Tags({@Tag(name = "Challenges")})
@RequiredArgsConstructor
@Transactional
public class ChallengeController {
    private final ChallengeService challengeService;
    private final ChallengeMapper challengeMapper;

    @GetMapping("/challenges")
    public List<ChallengeDto> list() {
        return challengeService.list().stream().map(challengeMapper::toDto).toList();
    }

    @PostMapping("/challenges/{id}")
    public ChallengeDto activateChallenge(@PathVariable("id") Long id) {
        Challenge challenge = challengeService.activateChallenge(id);
        return challengeMapper.toDto(challenge);
    }

    @DeleteMapping("/challenges/{id}")
    public ChallengeDto deactivateChallenge(@PathVariable("id") Long id) {
        Challenge challenge = challengeService.deactivateChallenge(id);
        return challengeMapper.toDto(challenge);
    }
}
