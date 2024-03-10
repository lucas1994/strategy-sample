package br.edu.sample.strategy.domain.enumeration;

import br.edu.sample.strategy.exception.BadRequestException;
import br.edu.sample.strategy.service.Freight;
import br.edu.sample.strategy.service.impl.freightstrategy.DHLFreight;
import br.edu.sample.strategy.service.impl.freightstrategy.FedexFreight;
import br.edu.sample.strategy.service.impl.freightstrategy.UPSFreight;

import java.util.List;

public enum Organization {
    DHL(DHLFreight.class),
    FEDEX(FedexFreight.class),
    UPS(UPSFreight.class);

    private final Class<? extends Freight> freightStrategy;

    Organization(Class<? extends Freight> freightStrategy) {
        this.freightStrategy = freightStrategy;
    }

    public Class<? extends Freight> getFreightStrategy() {
        return freightStrategy;
    }

    public static Organization fromString(String organizationString) throws EnumConstantNotPresentException {
        for (Organization organization : Organization.values()) {
            if (organization.name().equalsIgnoreCase(organizationString)) {
                return organization;
            }
        }
        throw new BadRequestException("Not found " + organizationString);
    }

    public static List<Organization> getOrganizations() {
        return List.of(values());
    }
}
