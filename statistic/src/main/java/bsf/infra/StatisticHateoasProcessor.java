package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class StatisticHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Statistic>> {

    @Override
    public EntityModel<Statistic> process(EntityModel<Statistic> model) {
        return model;
    }
}
