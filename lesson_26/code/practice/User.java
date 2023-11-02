package practice;
import java.util.Arrays;
//// k_l_b_1963@hotmail.com
//
///*
//1) @ exists and only one -> @ только одна
//2) dot after @  -> после @ должна быть среди символов как минимум одна точка
//3) after last dot minimum 2 symbols -> после последней точки должно быть минимум 2 символа
//4) alphabetic, digits, _ , - , . , @ -> разрешены буквы алфавита, цифры и некоторые символы
//
//1) min 8 symbols
//        2) min one symbol of uppercase
//        3) min one symbol of lowercase
//        4) min one digit
//        5) min one special symbol (!%@*&)
public class User {
    // поля класса
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(validateEmail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " isn't valid");

        }
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if(validatePassword(password)) {
            this.password = password;
        } else {
            System.out.println("Password isn't valid");
        }
    }

    private boolean validateEmail(String email) {
        int indexAt = email.indexOf('@'); //ищем индекс собачки
        //если найденный индекс не является последним в эмейле, тогда вернем false, потому что адрес будет невалиден
        if(indexAt == -1 || indexAt != email.lastIndexOf('@')) {
            return false;
        }
        if(email.indexOf('.', indexAt) == -1) { //не нашлась точка после собаки
            return false;
        }
        //наша точка должна быть дальше как минимум на 2 символа от конца, т.к. домена на 1 букву быть не может
        if(email.indexOf('.') >= email.length() - 2) {
           return false;
        }
        // проверка на допустимые символы
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if(!((c >= 'A' && c <='Z') ||
                    (c >= 'a' && c <= 'z') ||
                    (c >= '0' && c <= '9') ||
                    (c == '_') ||
                    (c == '-') ||
                    (c == '.') ||
                    (c == '@'))) {
                return false;
            }
        }
        return true;
    }

    public boolean validatePassword(String password) {
        boolean[] validPassword = new boolean[5];
        int checkNum = 0;

        //длина пароля должна быть не менее 8 символов
        int passwordLength = password.length();
        if(passwordLength >= 8) {
           validPassword[checkNum] = true;
        }
        checkNum++;
        System.out.println(checkNum);
        System.out.println(Arrays.toString(validPassword));

        //минимум один символ в uppercase
        char[] passwordArray = password.toCharArray();
        for (char c : passwordArray) {
            if(Character.isUpperCase(c)) {
                validPassword[checkNum] = true;
                break;
            }
        }
        checkNum++;
        System.out.println(checkNum);
        System.out.println(Arrays.toString(validPassword));

        //минимум один символ в lowerrcase
       for (char c : passwordArray) {
            if(Character.isLowerCase(c)) {
                validPassword[checkNum] = true;
                break;
            }
        }
        checkNum++;
        System.out.println(checkNum);
        System.out.println(Arrays.toString(validPassword));

        //минимум одна цифра
        for (char c : passwordArray) {
            if(Character.isDigit(c)) {
                validPassword[checkNum] = true;
                break;
            }
        }
        checkNum++;
        System.out.println(checkNum);
        System.out.println(Arrays.toString(validPassword));

        //минимум один спец символ (!%@*&)
        for (char c : passwordArray) {
            if((c == '!') || (c == '%') ||
                    (c == '@') || (c == '*') || (c == '&')) {
                validPassword[checkNum] = true;
                break;
            }
        }
        checkNum++;
        System.out.println(checkNum);
        System.out.println(Arrays.toString(validPassword));

        //если все элементы массива true - возвращаем true, если хотя бы один - false, возвращаем false
        for (int i = 0; i < validPassword.length; i++) {
            if(!validPassword[i]){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return email.equals(user.email);
    }
}
