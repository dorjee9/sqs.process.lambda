package com.abc.sqs.process.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;

public class LambdaSqs implements RequestHandler<SQSEvent, Void> {

    @Override
    public Void handleRequest(SQSEvent sqsEvent, Context context) {
        LambdaLogger logger = context.getLogger();
        try {
            for (SQSEvent.SQSMessage message : sqsEvent.getRecords()) {
                logger.log(message.getBody());
            }
        } catch (Exception ex) {
            logger.log("Exception handling batch seed request."+ex);
            throw ex;
        }
        return null;
    }
}