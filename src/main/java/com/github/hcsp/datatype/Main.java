package com.github.hcsp.datatype;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }
    // 给出两个数字字符串a和b，返回其中的数字相加后的字符串结果。
    // 例如，给定a="123",b="456"，返回"579"，因为123+456=579
    // 注意，若参数为null，则当作0处理，即add("123", null)=="123", add(null, null)=="0"
    public static String add(String a, String b) {
        Integer c;
        if (a == null){
            c = 0;
        }else {
            c = Integer.parseInt(a);
        }
        Integer d;
        if (b == null){
            d = 0;
        }else {
            d = Integer.parseInt(b);
        }
        return Integer.toString(c + d);

    }
}
