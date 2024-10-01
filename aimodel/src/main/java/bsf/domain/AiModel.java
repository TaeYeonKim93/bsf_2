package bsf.domain;

import bsf.AimodelApplication;
import bsf.domain.AiModelCreated;
import bsf.domain.AiModelDeployed;
import bsf.domain.AiModelTrained;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "AiModel_table")
@Data
//<<< DDD / Aggregate Root
public class AiModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long modelId;

    private String modelName;

    private Integer status;

    @PostPersist
    public void onPostPersist() {
        AiModelCreated aiModelCreated = new AiModelCreated(this);
        aiModelCreated.publishAfterCommit();

        AiModelTrained aiModelTrained = new AiModelTrained(this);
        aiModelTrained.publishAfterCommit();

        AiModelDeployed aiModelDeployed = new AiModelDeployed(this);
        aiModelDeployed.publishAfterCommit();
    }

    public static AiModelRepository repository() {
        AiModelRepository aiModelRepository = AimodelApplication.applicationContext.getBean(
            AiModelRepository.class
        );
        return aiModelRepository;
    }

    public void create() {
        //implement business logic here:

    }

    public void training() {
        //implement business logic here:

    }

    public void deploy() {
        //implement business logic here:

    }
}
//>>> DDD / Aggregate Root
