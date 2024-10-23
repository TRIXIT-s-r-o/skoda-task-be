package cz.trixit.skoda.skodatendrchallengesandrewards.dto;

import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.enums.RewardState;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RewardDto {
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private RewardState state;
}
