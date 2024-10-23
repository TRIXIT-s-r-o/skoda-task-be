package cz.trixit.skoda.skodatendrchallengesandrewards.controller;

import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.Reward;
import cz.trixit.skoda.skodatendrchallengesandrewards.dto.RewardDto;
import cz.trixit.skoda.skodatendrchallengesandrewards.mapper.RewardMapper;
import cz.trixit.skoda.skodatendrchallengesandrewards.service.RewardService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@Tags({@Tag(name = "Rewards")})
@RequiredArgsConstructor
@Transactional
public class RewardController {
    private final RewardService rewardService;
    private final RewardMapper rewardMapper;

    @GetMapping("/rewards")
    public List<RewardDto> list() {
        return rewardService.list().stream().map(rewardMapper::toDto).toList();
    }

    @PostMapping("/rewards/{id}")
    public RewardDto useReward(@PathVariable("id") Long id) {
        Reward reward = rewardService.useReward(id);
        return rewardMapper.toDto(reward);
    }
}
