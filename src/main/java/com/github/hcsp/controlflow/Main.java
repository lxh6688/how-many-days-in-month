package com.github.hcsp.controlflow;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Main {
    public static void main(String[] args) {
        System.out.println(howManyDaysInMonth(0));
        System.out.println(howManyDaysInMonth(1));
        System.out.println(howManyDaysInMonth(5));
        System.out.println(howManyDaysInMonth(9));
        System.out.println(howManyDaysInMonth(11));
    }

    /**
     * 输入一个月份，返回该月份在平年的天数或者"非法输入"
     *
     * <p>最好使用switch语句
     *
     * <p>例如，输入2，返回"2月有28天"；输入12，返回"12月有31天"。若输入的是1~12之外的值，返回"非法输入"
     *
     * @param month 月份
     * @return 结果字符串
     */
    public static String howManyDaysInMonth(int month) {
        String result;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = String.format("%d月有%d天", month, 31);
                break;
            case 2:
                result = String.format("%d月有%d天", month, 28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = String.format("%d月有%d天", month, 30);
                break;
            default:
                result = "非法输入";
        }
        return result;
    }
}
