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
    StatisticRepository statisticRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RiskAnalyzed'"
    )
    public void wheneverRiskAnalyzed_Update(
        @Payload RiskAnalyzed riskAnalyzed
    ) {
        RiskAnalyzed event = riskAnalyzed;
        System.out.println(
            "\n\n##### listener Update : " + riskAnalyzed + "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
