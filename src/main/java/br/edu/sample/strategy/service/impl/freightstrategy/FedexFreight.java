package br.edu.sample.strategy.service.impl.freightstrategy;

import br.edu.sample.strategy.domain.Quote;
import br.edu.sample.strategy.service.Freight;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
@Qualifier("FEDEX")
public class FedexFreight implements Freight {

    Double valueByDistancePivot = 1.2;

    Double weightMultiplierPivot = 1.10;

    @Override
    public BigDecimal quotePrice(Quote quote) {
        double valueByDistance = quote.getDistance() * valueByDistancePivot;
        double weightMultiple = quote.getWeight() * weightMultiplierPivot;
        return BigDecimal.valueOf(valueByDistance * weightMultiple);
    }
}
