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
    TrainDataRepository trainDataRepository;

    @Autowired
    RiskDataRepository riskDataRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AiModelDeployed'"
    )
    public void wheneverAiModelDeployed_Analyze(
        @Payload AiModelDeployed aiModelDeployed
    ) {
        AiModelDeployed event = aiModelDeployed;
        System.out.println(
            "\n\n##### listener Analyze : " + aiModelDeployed + "\n\n"
        );

        // Comments //
        //1. 점유형태별 고위험군 분석
        // 2. 주택유형별 고위험군 분석
        // 3. 독립변수별 가중치 분석
        // 4. 복지자원 연관도 분석

        // Sample Logic //
        RiskData.analyze(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AiModelTrained'"
    )
    public void wheneverAiModelTrained_Analyze(
        @Payload AiModelTrained aiModelTrained
    ) {
        AiModelTrained event = aiModelTrained;
        System.out.println(
            "\n\n##### listener Analyze : " + aiModelTrained + "\n\n"
        );

        // Comments //
        //1. 점유형태별 고위험군 분석
        // 2. 주택유형별 고위험군 분석
        // 3. 독립변수별 가중치 분석
        // 4. 복지자원 연관도 분석

        // Sample Logic //
        RiskData.analyze(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
