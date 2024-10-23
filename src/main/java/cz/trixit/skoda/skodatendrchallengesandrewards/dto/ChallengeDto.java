package cz.trixit.skoda.skodatendrchallengesandrewards.dto;

import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.enums.ChallengeState;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ChallengeDto {
    private Long id;
    private String title;
    private String description;
    private Integer experiencePoints;
    private String imageUrl;
    private BigDecimal progress;
    private ChallengeState state;
    private RewardDto reward;
}
