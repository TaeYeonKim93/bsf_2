package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class RiskAnalyzed extends AbstractEvent {

    private Long id;

    public RiskAnalyzed(RiskData aggregate) {
        super(aggregate);
    }

    public RiskAnalyzed() {
        super();
    }
}
//>>> DDD / Domain Event
