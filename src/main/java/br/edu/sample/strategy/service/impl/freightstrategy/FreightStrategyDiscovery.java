package br.edu.sample.strategy.service.impl.freightstrategy;


import br.edu.sample.strategy.domain.enumeration.Organization;
import br.edu.sample.strategy.service.Freight;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FreightStrategyDiscovery {

    private final Map<Organization, Freight> freightStrategies;

    public FreightStrategyDiscovery(ApplicationContext context, Map<Organization, Freight> freightStrategies, Map<Organization, Freight> freightStrategies1) {
        this.freightStrategies = Organization.getOrganizations().stream().collect(
                HashMap::new,
                (map, organization) -> map.put(organization, context.getBean(organization.getFreightStrategy())),
                HashMap::putAll
        );

    }


    public Freight find(Organization organization) {
        return freightStrategies.get(organization);
    }

}
