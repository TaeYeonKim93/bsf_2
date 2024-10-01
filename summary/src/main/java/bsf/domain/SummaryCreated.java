package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SummaryCreated extends AbstractEvent {

    private Long id;

    public SummaryCreated(Summary aggregate) {
        super(aggregate);
    }

    public SummaryCreated() {
        super();
    }
}
//>>> DDD / Domain Event
