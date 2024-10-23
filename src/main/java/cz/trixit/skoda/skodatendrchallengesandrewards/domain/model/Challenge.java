package cz.trixit.skoda.skodatendrchallengesandrewards.domain.model;

import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.enums.ChallengeState;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Challenge {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private Integer experiencePoints;
    private String imageUrl;
    private BigDecimal progress;
    @Enumerated(EnumType.STRING)
    private ChallengeState state;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "reward_id")
    private Reward reward;
}
