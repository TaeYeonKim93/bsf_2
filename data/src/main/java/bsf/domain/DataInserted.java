package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DataInserted extends AbstractEvent {

    private Long id;

    public DataInserted(TrainData aggregate) {
        super(aggregate);
    }

    public DataInserted() {
        super();
    }
}
//>>> DDD / Domain Event
