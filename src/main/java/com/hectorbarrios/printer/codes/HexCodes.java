package com.hectorbarrios.printer.codes;

public class HexCodes {
    public static final byte[] EURO_CODE = {27, 116, 19};
    public static final byte[] INIT_CODE = {27, 64};
    public static final byte[] FONT_A_CODE = {27, 77, 0};
    public static final byte[] FONT_B_CODE = {27, 77, 1};
    public static final byte[] FONT_C_CODE = {27, 77, 48};
    public static final byte[] FONT_D_CODE = {27, 77, 49};
    public static final byte[] ALIGN_LEFT_CODE = {27, 97, 48};
    public static final byte[] ALIGN_CENTER_CODE = {27, 97, 49};
    public static final byte[] ALIGN_RIGHT_CODE = {27, 97, 50};
    public static final byte[] NEW_LINE_CODE = {10};
    public static final byte[] FONT_SMALL_CODE = {29, 33, 0};
    public static final byte[] FONT_NORMAL_CODE = {29, 33, 16};
    public static final byte[] FONT_BIG_CODE = {29, 33, 32};
    public static final byte[] DOUBLE_STRIKE_MODE_ON_CODE = {27, 71, 1};
    public static final byte[] DOUBLE_STRIKE_MODE_OFF_CODE = {27, 71, 0};
    public static final byte[] DOUBLE_HEIGHT_MODE_ON_CODE = {27, 33, 17};
    public static final byte[] DOUBLE_HEIGHT_MODE_OFF_CODE = {27, 33, 0};
    public static final byte[] EMPHASIZED_MODE_ON_CODE = {27, 0};
    public static final byte[] EMPHASIZED_MODE_OFF_CODE = {27, 1};
    public static final byte[] UNDERLINE_2_DOT_CODE = {27, 45, 50};
    public static final byte[] UNDERLINE_1_DOT_CODE = {27, 45, 49};
    public static final byte[] UNDERLINE_0_DOT_CODE = {27, 45, 48};
    public static final byte[] FEED_AND_CUT_CODE = {29, 'V', 66, 0};
    public static final byte[] OPEN_CASH_DRAWER_CODE = {27, 70, 0, 60, 120};
}
