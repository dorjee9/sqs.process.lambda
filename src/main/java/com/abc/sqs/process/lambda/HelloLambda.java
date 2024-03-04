package com.abc.sqs.process.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloLambda implements RequestHandler<String,String> {

    @Override
    public String handleRequest(String input, Context context) {
        LambdaLogger lambdaLogger = context.getLogger();
        lambdaLogger.log("JDK Version: "+System.getProperty("java.version"));
        return input.toUpperCase();
    }
}
