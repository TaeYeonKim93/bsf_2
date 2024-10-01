package bsf.domain;

import bsf.VisualizeApplication;
import bsf.domain.MapCreated;
import bsf.domain.MapUpdated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Visualize_table")
@Data
//<<< DDD / Aggregate Root
public class Visualize {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String mapId;

    private String dataType;

    private String geoData;

    @PostPersist
    public void onPostPersist() {
        MapUpdated mapUpdated = new MapUpdated(this);
        mapUpdated.publishAfterCommit();

        MapCreated mapCreated = new MapCreated(this);
        mapCreated.publishAfterCommit();
    }

    public static VisualizeRepository repository() {
        VisualizeRepository visualizeRepository = VisualizeApplication.applicationContext.getBean(
            VisualizeRepository.class
        );
        return visualizeRepository;
    }

    public void create() {
        //implement business logic here:

    }

    //<<< Clean Arch / Port Method
    public static void updateMap(RiskAnalyzed riskAnalyzed) {
        //implement business logic here:

        /** Example 1:  new item 
        Visualize visualize = new Visualize();
        repository().save(visualize);

        */

        /** Example 2:  finding and process
        
        repository().findById(riskAnalyzed.get???()).ifPresent(visualize->{
            
            visualize // do something
            repository().save(visualize);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
