package bsf.domain;

import bsf.SummaryApplication;
import bsf.domain.SummaryCreated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Summary_table")
@Data
//<<< DDD / Aggregate Root
public class Summary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String summaryId;

    private String dataType;

    private String content;

    @PostPersist
    public void onPostPersist() {
        SummaryCreated summaryCreated = new SummaryCreated(this);
        summaryCreated.publishAfterCommit();
    }

    public static SummaryRepository repository() {
        SummaryRepository summaryRepository = SummaryApplication.applicationContext.getBean(
            SummaryRepository.class
        );
        return summaryRepository;
    }

    public void create() {
        //implement business logic here:

    }
}
//>>> DDD / Aggregate Root
