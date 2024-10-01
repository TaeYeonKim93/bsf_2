package bsf.infra;

import bsf.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class TrainDataHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TrainData>> {

    @Override
    public EntityModel<TrainData> process(EntityModel<TrainData> model) {
        return model;
    }
}
