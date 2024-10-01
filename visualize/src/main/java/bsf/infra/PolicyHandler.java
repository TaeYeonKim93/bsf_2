package bsf.infra;

import bsf.config.kafka.KafkaProcessor;
import bsf.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    VisualizeRepository visualizeRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RiskAnalyzed'"
    )
    public void wheneverRiskAnalyzed_UpdateMap(
        @Payload RiskAnalyzed riskAnalyzed
    ) {
        RiskAnalyzed event = riskAnalyzed;
        System.out.println(
            "\n\n##### listener UpdateMap : " + riskAnalyzed + "\n\n"
        );

        // Comments //
        //1. 최저주거위기지역 위치
        // 2. 주거빈곤지역 위치
        // 3. 주변복지자원 위치

        // Sample Logic //
        Visualize.updateMap(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
