package br.edu.sample.strategy.resource;


import br.edu.sample.strategy.domain.QuoteBuilder;
import br.edu.sample.strategy.domain.enumeration.Organization;
import br.edu.sample.strategy.resource.response.FreightResponse;
import br.edu.sample.strategy.service.FreightService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("freight")
public class FreightResource {

    private final FreightService freightService;


    public FreightResource(FreightService freightService) {
        this.freightService = freightService;

    }

    @PostMapping("quote")
    private FreightResponse quoteFreight(@RequestParam("organization") String organization,
                                         @RequestParam("weight") Double weight,
                                         @RequestParam("distance") Double distance) {

        return new FreightResponse(freightService.quote(QuoteBuilder.builder()
                .withWeight(weight)
                .withOrganization(Organization.fromString(organization))
                .withDistance(distance)
                .build()));

    }
}
