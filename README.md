#generate zip file as generate jar cause failure in lambda function execution
mvn clean package
#add policy to enable to receive the messages from sqs queue
#batch window is not applicalble to fifo sqs queue type as it is only applicable to standart type
