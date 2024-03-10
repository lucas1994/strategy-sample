package br.edu.sample.strategy.service.impl;

import br.edu.sample.strategy.domain.Quote;
import br.edu.sample.strategy.service.Freight;
import br.edu.sample.strategy.service.FreightService;
import br.edu.sample.strategy.service.FreightStrategyDiscovery;
import br.edu.sample.strategy.service.impl.freightstrategy.FreightStrategyDiscoveryImpl;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class FreightServiceImpl implements FreightService {

    private final FreightStrategyDiscovery freightStrategyDiscovery;

    public FreightServiceImpl(FreightStrategyDiscoveryImpl freightStrategyDiscovery) {
        this.freightStrategyDiscovery = freightStrategyDiscovery;
    }


    @Override
    public BigDecimal quote(Quote quote) {
        final Freight freight = freightStrategyDiscovery.findImplementation(quote.getOrganization());
        return freight.quotePrice(quote);
    }
}
