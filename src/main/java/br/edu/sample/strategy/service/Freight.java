package br.edu.sample.strategy.service;

import br.edu.sample.strategy.domain.Quote;

import java.math.BigDecimal;

/**
 * Interface used to manipulate freight functions
 */
public interface Freight {
    /**
     * @param quote - Request Object with information to quote freight
     * @return dolar value to freight
     */
    BigDecimal quotePrice(Quote quote);

}
