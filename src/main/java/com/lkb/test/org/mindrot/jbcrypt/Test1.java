package com.lkb.test.org.mindrot.jbcrypt;

public class Test1 {
    public static void main(String[] args) {
        String gensalt=BCrypt.gensalt();//创建随机盐
        System.out.println(gensalt);
//        $2a$10$AHFUbZMjAqLTUjH8lTLjsOPFZzJNuWGChAZqdXYZ.86VKgZ.GeQly

//        $2a$10$bn97vY4l9NlkcwmknJFvwOkKChRPSCwBxlWKpK/Syk8D66gdiyW8C
        String password=BCrypt.hashpw("123456",gensalt);
        System.out.println(password);
    }
}
