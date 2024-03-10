package br.edu.sample.strategy.domain;

import br.edu.sample.strategy.domain.enumeration.Organization;

public final class QuoteBuilder {
    private Organization organization;
    private Double weight;
    private Double distance;

    private QuoteBuilder() {
    }

    public static QuoteBuilder builder() {
        return new QuoteBuilder();
    }

    public QuoteBuilder withOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }
    
    public QuoteBuilder withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public QuoteBuilder withDistance(Double distance) {
        this.distance = distance;
        return this;
    }

    public Quote build() {
        return new Quote(organization, weight, distance);
    }
}
