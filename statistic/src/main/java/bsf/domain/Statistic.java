package bsf.domain;

import bsf.StatisticApplication;
import bsf.domain.StatisticUpdated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Statistic_table")
@Data
//<<< DDD / Aggregate Root
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long statisticId;

    private Long type;

    private Long period;

    private Long value;

    @PostPersist
    public void onPostPersist() {
        StatisticUpdated statisticUpdated = new StatisticUpdated(this);
        statisticUpdated.publishAfterCommit();
    }

    public static StatisticRepository repository() {
        StatisticRepository statisticRepository = StatisticApplication.applicationContext.getBean(
            StatisticRepository.class
        );
        return statisticRepository;
    }
}
//>>> DDD / Aggregate Root
