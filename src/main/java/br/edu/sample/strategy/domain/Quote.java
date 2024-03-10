package br.edu.sample.strategy.domain;

import br.edu.sample.strategy.domain.enumeration.Organization;

public class Quote {


    Organization organization;
    Double weight;
    Double distance;


    public Quote(Organization organization, Double weight, Double distance) {
        this.organization = organization;
        this.weight = weight;
        this.distance = distance;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getDistance() {
        return distance;
    }

    public Organization getOrganization() {
        return organization;
    }

}
