package br.edu.sample.strategy.service;

import br.edu.sample.strategy.domain.enumeration.Organization;

public interface FreightStrategyDiscovery {

    Freight findImplementation(Organization organization);

}
