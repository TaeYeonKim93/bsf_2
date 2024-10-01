package bsf.domain;

import bsf.DataApplication;
import bsf.domain.DataInserted;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TrainData_table")
@Data
//<<< DDD / Aggregate Root
public class TrainData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long dataId;

    private Integer dataType;

    private Long size;

    private Date createAt;

    private String dataValue;

    @PostPersist
    public void onPostPersist() {
        DataInserted dataInserted = new DataInserted(this);
        dataInserted.publishAfterCommit();
    }

    public static TrainDataRepository repository() {
        TrainDataRepository trainDataRepository = DataApplication.applicationContext.getBean(
            TrainDataRepository.class
        );
        return trainDataRepository;
    }

    public void link() {
        //implement business logic here:

    }

    public void insert() {
        //implement business logic here:

    }
}
//>>> DDD / Aggregate Root
