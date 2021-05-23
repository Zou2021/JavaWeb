package test;

import java.util.UUID;

/**
 * @author: 邹祥发
 * @date: 2021/1/31 23:27
 */
public class Test01 {

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        str = str.replaceAll("-", "");
        System.out.println(str);
        System.out.println(str.length());
    }
}
