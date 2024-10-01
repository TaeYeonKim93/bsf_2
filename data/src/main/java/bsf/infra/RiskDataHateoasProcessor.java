package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RiskDataHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<RiskData>> {

    @Override
    public EntityModel<RiskData> process(EntityModel<RiskData> model) {
        return model;
    }
}
