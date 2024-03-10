package br.edu.sample.strategy.service.impl.freightstrategy;


import br.edu.sample.strategy.domain.enumeration.Organization;
import br.edu.sample.strategy.service.Freight;
import br.edu.sample.strategy.service.FreightStrategyDiscovery;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FreightStrategyDiscoveryImpl implements FreightStrategyDiscovery {

    private final Map<Organization, Freight> freightStrategies;

    public FreightStrategyDiscoveryImpl(ApplicationContext context, Map<Organization, Freight> freightStrategies, Map<Organization, Freight> freightStrategies1) {
        this.freightStrategies = Organization.getOrganizations().stream().collect(
                HashMap::new,
                (map, organization) -> map.put(organization, context.getBean(organization.getFreightStrategy())),
                HashMap::putAll
        );

    }


    @Override
    public Freight findImplementation(Organization organization) {
        return freightStrategies.get(organization);
    }

}
