package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AiModelDeployed extends AbstractEvent {

    private Long id;

    public AiModelDeployed(AiModel aggregate) {
        super(aggregate);
    }

    public AiModelDeployed() {
        super();
    }
}
//>>> DDD / Domain Event
