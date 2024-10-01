package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class MapUpdated extends AbstractEvent {

    private Long id;

    public MapUpdated(Visualize aggregate) {
        super(aggregate);
    }

    public MapUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
