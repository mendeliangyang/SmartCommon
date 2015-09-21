/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smart.common.DataFormat;

/**
 *
 * @author Administrator
 */
public class Packet {

    private byte[] buf = null;

    /**
     * 将int转为低字节在前，高字节在后的byte数组
     */
    public static byte[] toLH(int n) {
        byte[] b = new byte[4];
        b[0] = (byte) (n & 0xff);
        b[1] = (byte) (n >> 8 & 0xff);
        b[2] = (byte) (n >> 16 & 0xff);
        b[3] = (byte) (n >> 24 & 0xff);
        return b;
    }

    /**
     * 将float转为低字节在前，高字节在后的byte数组
     */
    public static byte[] toLH(float f) {
        return toLH(Float.floatToRawIntBits(f));
    }

    /**
     * 构造并转换
     */
    public Packet(int packetID, int packetLen, String packetBody) {
        byte[] temp = null;

        buf = new byte[packetBody.getBytes().length + 8];
        temp = toLH(packetID);
        System.arraycopy(temp, 0, buf, 0, temp.length);

        temp = toLH(packetLen);
        System.arraycopy(temp, 0, buf, 4, temp.length);

        System.arraycopy(packetBody.getBytes(), 0, buf, 8, packetBody.length());

    }

    /**
     * 返回要发送的数组
     */
    public byte[] getBuf() {
        return buf;
    }

    //int2byte
    public static byte[] intToByte(int n) {

        byte[] b = new byte[4];

        b[0] = (byte) (n >> 24);

        b[1] = (byte) (n >> 16);

        b[2] = (byte) (n >> 8);

        b[3] = (byte) (n);

        return b;

    }

    public static void int2byte(int n, byte buf[], int offset) {
        buf[offset] = (byte) (n >> 24);
        buf[offset + 1] = (byte) (n >> 16);
        buf[offset + 2] = (byte) (n >> 8);
        buf[offset + 3] = (byte) n;
    }

    // 字节类型转成int类型
    public static int byte2int(byte b[]) {

        return b[3] & 0xff | (b[2] & 0xff) << 8 | (b[1] & 0xff) << 16
                | (b[0] & 0xff) << 24;

    }

    //byte 数组与 int 的相互转换
    public static int byteArrayToInt(byte[] b) {
        return b[3] & 0xFF
                | (b[2] & 0xFF) << 8
                | (b[1] & 0xFF) << 16
                | (b[0] & 0xFF) << 24;
    }

    public static byte[] intToByteArray1(int a) {
        return new byte[]{
            (byte) ((a >> 24) & 0xFF),
            (byte) ((a >> 16) & 0xFF),
            (byte) ((a >> 8) & 0xFF),
            (byte) (a & 0xFF)
        };
    }

//short2byte
    public static byte[] short2byte(int n) {

        byte b[] = new byte[2];

        b[0] = (byte) (n >> 8);

        b[1] = (byte) n;

        return b;

    }

// long到byte的转换
    public static byte[] long2byte(long n) {

        byte b[] = new byte[8];

        b[0] = (byte) (int) (n >> 56);

        b[1] = (byte) (int) (n >> 48);

        b[2] = (byte) (int) (n >> 40);

        b[3] = (byte) (int) (n >> 32);

        b[4] = (byte) (int) (n >> 24);

        b[5] = (byte) (int) (n >> 16);

        b[6] = (byte) (int) (n >> 8);

        b[7] = (byte) (int) n;

        return b;

    }
    /* *
     * Convert byte[] to hex string.这里我们可以将byte转换成int，然后利用Integer.toHexString(int)
     *来转换成16进制字符串。  
     * @param src byte[] data  
     * @return hex string  
     */

    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    public static byte[] intToByteArray(final int integer) {
        int byteNum = (40 - Integer.numberOfLeadingZeros(integer < 0 ? ~integer : integer)) / 8;
        byte[] byteArray = new byte[4];

        for (int n = 0; n < byteNum; n++) {
            byteArray[3 - n] = (byte) (integer >>> (n * 8));
        }

        return (byteArray);
    }

    public static int byteArrayToInt(byte[] b, int offset) {
        int value = 0;
        for (int i = 0; i < 4; i++) {
            int shift = (4 - 1 - i) * 8;
            value += (b[i + offset] & 0x000000FF) << shift;
        }
        return value;
    }
    /**
     * 发送测试
     */
//    public static void main(String[] args) {
//        try {
//            String tmp = “test string
//            !”;
//Socket sock = new Socket(
//            ”127.0.0.1″, 8888);
//sock.getOutputStream().write(
//                    new Packet(123, tmp.length(), tmp).getBuf());
//            sock.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
