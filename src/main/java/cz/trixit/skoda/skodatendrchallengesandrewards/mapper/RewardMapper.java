package cz.trixit.skoda.skodatendrchallengesandrewards.mapper;

import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.Reward;
import cz.trixit.skoda.skodatendrchallengesandrewards.dto.RewardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RewardMapper {

    public RewardDto toDto(Reward data) {
        if (data == null) {
            return null;
        }

        return RewardDto.builder()
                .id(data.getId())
                .title(data.getTitle())
                .description(data.getDescription())
                .state(data.getState())
                .imageUrl(data.getImageUrl())
                .build();
    }

    public Reward toData(RewardDto dto) {
        if (dto == null) {
            return null;
        }

        return Reward.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .state(dto.getState())
                .imageUrl(dto.getImageUrl())
                .build();
    }
}
