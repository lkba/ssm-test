package com.lkb.test.org.mindrot.jbcrypt;

public class Test2 {
    public static void main(String[] args) {

        boolean checkps=BCrypt.checkpw("123456","2a$10$bn97vY4l9NlkcwmknJFvwOkKChRPSCwBxlWKpK/Syk8D66gdiyW8C");
        System.out.println(checkps);

    }
}
