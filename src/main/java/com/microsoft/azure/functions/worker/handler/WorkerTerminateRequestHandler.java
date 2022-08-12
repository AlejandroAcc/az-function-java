package com.microsoft.azure.functions.worker.handler;

import com.google.protobuf.Message;
import com.microsoft.azure.functions.rpc.messages.StreamingMessage;
import com.microsoft.azure.functions.rpc.messages.WorkerTerminate;
import com.microsoft.azure.functions.worker.WorkerLogManager;

import java.util.logging.Level;

public class WorkerTerminateRequestHandler extends MessageHandler<WorkerTerminate, Message.Builder> {

    public WorkerTerminateRequestHandler() {
        super(StreamingMessage::getWorkerTerminate,
                null,
                null,
                null);
    }

    @Override
    String execute(WorkerTerminate workerTerminate, Message.Builder builder) throws Exception {
        WorkerLogManager.getSystemLogger().log(Level.INFO, "Worker terminate request received");
        throw new GracefulTerminationException();
    }
}
