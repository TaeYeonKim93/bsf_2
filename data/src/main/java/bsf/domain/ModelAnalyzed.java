package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ModelAnalyzed extends AbstractEvent {

    private Long id;

    public ModelAnalyzed(RiskData aggregate) {
        super(aggregate);
    }

    public ModelAnalyzed() {
        super();
    }
}
//>>> DDD / Domain Event
