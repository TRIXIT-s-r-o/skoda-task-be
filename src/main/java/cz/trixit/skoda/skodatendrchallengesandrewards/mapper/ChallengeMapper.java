package cz.trixit.skoda.skodatendrchallengesandrewards.mapper;

import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.Challenge;
import cz.trixit.skoda.skodatendrchallengesandrewards.dto.ChallengeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChallengeMapper {

    private final RewardMapper rewardMapper;

    public ChallengeDto toDto(Challenge data) {
        if (data == null) {
            return null;
        }

        return ChallengeDto.builder()
                .id(data.getId())
                .title(data.getTitle())
                .description(data.getDescription())
                .state(data.getState())
                .imageUrl(data.getImageUrl())
                .experiencePoints(data.getExperiencePoints())
                .progress(data.getProgress())
                .reward(rewardMapper.toDto(data.getReward()))
                .build();
    }

    public Challenge toData(ChallengeDto dto) {
        if (dto == null) {
            return null;
        }

        return Challenge.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .state(dto.getState())
                .imageUrl(dto.getImageUrl())
                .experiencePoints(dto.getExperiencePoints())
                .progress(dto.getProgress())
                .reward(rewardMapper.toData(dto.getReward()))
                .build();
    }
}
