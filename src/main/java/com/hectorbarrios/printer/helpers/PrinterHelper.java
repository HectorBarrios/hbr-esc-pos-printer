package com.hectorbarrios.printer.helpers;

import static com.hectorbarrios.printer.codes.HexCodes.*;

public class PrinterHelper {
    public String initialize() {
        return new String(INIT_CODE);
    }

    public String euro() {
        return new String(EURO_CODE);
    }

    public String chooseFontA() {
        return new String(FONT_A_CODE);
    }

    public String chooseFontB() {
        return new String(FONT_B_CODE);
    }

    public String chooseFontC() {
        return new String(FONT_C_CODE);
    }

    public String chooseFontD() {
        return new String(FONT_D_CODE);
    }

    public String chooseFont(int Options) {
        switch (Options) {
            case 1: return chooseFontA();
            case 2: return chooseFontB();
            case 3: return chooseFontC();
            case 4: return chooseFontD();
            default: return chooseFontB();
        }
    }

    public String feedBack(byte lines) {
        final byte[] FEED_BACK_CODE = {27, 101, lines};
        return new String(FEED_BACK_CODE);
    }

    public String feed(byte lines) {
        final byte[] FEED_CODE = {27, 100, lines};
        return new String(FEED_CODE);
    }

    public String alignLeft() {
        return new String(ALIGN_LEFT_CODE);
    }

    public String alignCenter() {
        return new String(ALIGN_CENTER_CODE);
    }

    public String alignRight() {
        return new String(ALIGN_RIGHT_CODE);
    }

    public String newLine() {
        return new String(NEW_LINE_CODE);
    }

    public String fontSmall() {
        return new String(FONT_SMALL_CODE);
    }

    public String fontNormal() {
        return new String(FONT_NORMAL_CODE);
    }

    public String fontBig() {
        return new String(FONT_BIG_CODE);
    }

    public String characterSize(int option) {
        switch (option) {
            case 1: return fontSmall();
            case 2: return fontNormal();
            case 3: return fontBig();
            default: return fontNormal();
        }
    }

    public String doubleStrike(boolean enabled) {
        return enabled ? new String(DOUBLE_STRIKE_MODE_ON_CODE) : new String(DOUBLE_STRIKE_MODE_OFF_CODE);
    }

    public String doubleHeight(boolean enabled) {
        return enabled ? new String(DOUBLE_HEIGHT_MODE_ON_CODE) : new String(DOUBLE_HEIGHT_MODE_OFF_CODE);
    }

    public String emphasized(boolean enabled) {
        return enabled ? new String(EMPHASIZED_MODE_ON_CODE) : new String(EMPHASIZED_MODE_OFF_CODE);
    }

    public String underline2Dot() {
        return new String(UNDERLINE_2_DOT_CODE);
    }

    public String underline1Dot() {
        return new String(UNDERLINE_1_DOT_CODE);
    }

    public String underline0Dot() {
        return new String(UNDERLINE_0_DOT_CODE);
    }

    public String underLine(int Options) {
        switch (Options) {
            case 0: return underline0Dot();
            case 1: return underline1Dot();
            case 2: return underline2Dot();
            default: return underline0Dot();
        }
    }

    public String feedAndCutPaper() {
        return new String(FEED_AND_CUT_CODE);
    }

    public String openCashDrawer() {
        return new String(OPEN_CASH_DRAWER_CODE);
    }

    public String addLineSeperator() {
        return "------------------------------------------";
    }

}