package cz.trixit.skoda.skodatendrchallengesandrewards.controller;

import com.stripe.StripeClient;
import com.stripe.exception.StripeException;
import com.stripe.param.PaymentIntentCreateParams;
import cz.trixit.skoda.skodatendrchallengesandrewards.dto.PaymentIntentDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tags({@Tag(name = "Payments")})
@RequiredArgsConstructor
@Transactional
public class PaymentsController {

    private final StripeClient stripeClient;

    @PostMapping(value = "/payments/initiate", produces = "application/json")
    public String initiate(PaymentIntentDto paymentIntentDto) throws StripeException {
        PaymentIntentCreateParams params =
                PaymentIntentCreateParams
                        .builder()
                        .setAmount(paymentIntentDto.getAmount())
                        .setCurrency(paymentIntentDto.getCurrency())
                        .build();
        return this.stripeClient.paymentIntents().create(params).toJson();
    }
}
