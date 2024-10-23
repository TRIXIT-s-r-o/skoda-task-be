package cz.trixit.skoda.skodatendrchallengesandrewards.domain.model;

import cz.trixit.skoda.skodatendrchallengesandrewards.domain.model.enums.RewardState;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reward {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    @Enumerated(EnumType.STRING)
    private RewardState state;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "reward")
    private Set<Challenge> challenges;
}
