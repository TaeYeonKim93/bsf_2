package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class StatisticUpdated extends AbstractEvent {

    private Long id;

    public StatisticUpdated(Statistic aggregate) {
        super(aggregate);
    }

    public StatisticUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
