package cz.trixit.skoda.skodatendrchallengesandrewards.dto;

import lombok.Data;

@Data
public class PaymentIntentDto {
    private Long amount;
    private String currency;
}
