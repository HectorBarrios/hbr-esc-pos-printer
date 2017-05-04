package com.hectorbarrios.printer.exceptions;

public class PrinterServiceException extends Exception {

    public PrinterServiceException(String message) {
        super(message);
    }

    public PrinterServiceException(Exception e) {
        super(e);
    }

}
