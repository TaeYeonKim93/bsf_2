package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AiModelHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AiModel>> {

    @Override
    public EntityModel<AiModel> process(EntityModel<AiModel> model) {
        return model;
    }
}
