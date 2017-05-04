package com.hectorbarrios.printer.services;

import com.hectorbarrios.printer.beans.Config;
import com.hectorbarrios.printer.beans.Ticket;
import com.hectorbarrios.printer.exceptions.PrinterServiceException;
import com.hectorbarrios.printer.helpers.PrinterHelper;
import org.apache.log4j.Logger;

import javax.print.*;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashPrintServiceAttributeSet;
import javax.print.attribute.standard.PrinterName;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PrinterService {

    // Logger
    private final Logger LOGGER = Logger.getLogger(PrinterService.class);

    // Beans
    private final Config config;
    private final Ticket ticket;

    // Helpers
    private PrinterHelper helper = new PrinterHelper();

    // Global
    private ByteArrayOutputStream baos;
    private PrintStream printStream;

    public PrinterService(Config config, Ticket ticket) throws PrinterServiceException {
        this.config = config;
        this.ticket = ticket;

        // Init baos and printstream
        this.baos = new ByteArrayOutputStream();
        try {
            this.printStream = new PrintStream(this.baos, true, "Cp858");
        } catch (UnsupportedEncodingException e) {
            LOGGER.error("Error initializing the PrinterService.", e);
            throw new PrinterServiceException(e);
        }
    }

    public void print() throws PrinterServiceException {

        // Init printer
        printStream.print(helper.initialize());

        // Set Euro encoding
        printStream.print(helper.euro());

        // Add the header with the logo
        this.addHeader();

        // Add Information below the header
        this.addHeaderInformation();

        // Add table structure before add the product line
        this.addTableStructure();

        // Add all the product lines needed
        this.addLine();

        // Add information before the footer
        this.addFooterInformation();

        // Add the footer
        this.addFooter();

        // Feed paper and cut
        printStream.print(helper.feedAndCutPaper());

        // Open cash drawer
        printStream.print(helper.openCashDrawer());

        // Send the whole stream to the printer and generate the ticket
        printTicket(baos.toByteArray());

    }

    private boolean printTicket(byte[] b) {
        AttributeSet attrSet;
        DocPrintJob job;
        DocFlavor flavor;
        Doc doc;
        try {
            attrSet = new HashPrintServiceAttributeSet(new PrinterName(this.config.getPrinterName(), null));
            job = PrintServiceLookup.lookupPrintServices(null, attrSet)[0].createPrintJob();
            flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
            doc = new SimpleDoc(b, flavor, null);
            job.print(doc, null);
        } catch (PrintException e) {
            LOGGER.error("An exception appears trying to print the ticket. " +
                    "Do you have your printer with name " + this.config.getPrinterName() + " connected?", e);
            return false;
        }
        return true;
    }

    private void addHeader() {
        // TODO
    }

    private void addHeaderInformation() {
        // TODO
    }

    private void addTableStructure() {
        // TODO
    }

    private void addLine() {
        // TODO
    }

    private void addFooterInformation() {
        // TODO
    }

    private void addFooter() {
        // TODO
    }
}
