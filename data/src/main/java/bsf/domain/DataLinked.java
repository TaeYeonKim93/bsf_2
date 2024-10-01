package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DataLinked extends AbstractEvent {

    private Long id;

    public DataLinked() {
        super();
    }
}
//>>> DDD / Domain Event
