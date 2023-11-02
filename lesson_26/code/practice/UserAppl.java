package practice;

import practice.string_builder.StringBuilderAppl;

public class UserAppl {
    public static void main(StringBuilderAppl[] args) {
        User user = new User("peter@gmail.com.", "sjkdf"); //создаем пользователя
        System.out.println(user); //печатаем его

        user.setEmail("peter@gmail.com");

        user.setPassword("sj7kGH&0.df");
        System.out.println(user);
    }
}
