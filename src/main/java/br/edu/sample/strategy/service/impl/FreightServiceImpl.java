package br.edu.sample.strategy.service.impl;

import br.edu.sample.strategy.domain.Quote;
import br.edu.sample.strategy.service.Freight;
import br.edu.sample.strategy.service.FreightService;
import br.edu.sample.strategy.service.impl.freightstrategy.FreightStrategyDiscovery;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class FreightServiceImpl implements FreightService {

    private final FreightStrategyDiscovery freightStrategyDiscovery;

    public FreightServiceImpl(FreightStrategyDiscovery freightStrategyDiscovery) {
        this.freightStrategyDiscovery = freightStrategyDiscovery;
    }


    @Override
    public BigDecimal quote(Quote quote) {
        final Freight freight = freightStrategyDiscovery.find(quote.getOrganization());
        return freight.quotePrice(quote);
    }
}
