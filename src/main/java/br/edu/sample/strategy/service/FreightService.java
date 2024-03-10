package br.edu.sample.strategy.service;

import br.edu.sample.strategy.domain.Quote;

import java.math.BigDecimal;

public interface FreightService {
    /**
     * @param quote - Request Object with information to quote freight
     * @return dolar value to freight
     */
    BigDecimal quote(Quote quote);
}
