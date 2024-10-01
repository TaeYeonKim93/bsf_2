package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VisualizeHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Visualize>> {

    @Override
    public EntityModel<Visualize> process(EntityModel<Visualize> model) {
        return model;
    }
}
