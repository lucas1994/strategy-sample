package br.edu.sample.strategy.domain.enumeration;

import br.edu.sample.strategy.service.FreightService;

public interface FreightSelector {

    FreightService findFreightType();
}
