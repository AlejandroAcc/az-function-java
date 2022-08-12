package com.microsoft.azure.functions.worker.handler;

public class GracefulTerminationException extends Exception {

    public GracefulTerminationException() {
    }

    public GracefulTerminationException(String message) {
        super(message);
    }

    public GracefulTerminationException(String message, Throwable cause) {
        super(message, cause);
    }

    public GracefulTerminationException(Throwable cause) {
        super(cause);
    }

    public GracefulTerminationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
