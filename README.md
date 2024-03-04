#generate zip file as generate jar cause failure in lambda function execution
mvn clean package
#add policy to enable to receive the messages from sqs queue
#Batching window is not supported for FIFO queues as it is only applicable for Standart type
