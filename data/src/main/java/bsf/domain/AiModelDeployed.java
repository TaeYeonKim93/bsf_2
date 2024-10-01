package bsf.domain;

import bsf.domain.*;
import bsf.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AiModelDeployed extends AbstractEvent {

    private Long id;
}
