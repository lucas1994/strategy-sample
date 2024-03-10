package br.edu.sample.strategy.service.impl.freightstrategy;

import br.edu.sample.strategy.domain.Quote;
import br.edu.sample.strategy.service.Freight;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


@Component
@Qualifier("UPS")
public class UPSFreight implements Freight {

    Double valueByDistancePivot = 1.2;

    @Override
    public BigDecimal quotePrice(Quote quote) {
        if (quote.getDistance() > 10000) {
            return BigDecimal.valueOf(100000);
        }
        return BigDecimal.valueOf(valueByDistancePivot * quote.getWeight());
    }
}
