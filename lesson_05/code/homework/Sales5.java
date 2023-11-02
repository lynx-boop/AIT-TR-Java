package homework;

public class Sales5 {
    public static void main(String[] args) {
        //объявляем цену товара
        double a = 12;
        double b = 8;
        //объявляем количество, взятое покупателем
        int aCount = 3;
        int bCount = 6;
        //объявляем скидку на каждую категорию товара
        int aDiscount = 10;
        int bDiscount = 7;
        //объявляем дополнительную скидку
        int additionalDiscount = 5;
        //считаем, сколько денег покупатель потратит без скидки
        double aTotal = a*aCount;
        double bTotal = b*bCount;
        //применяем к каждой категории свою скидку таким образом:
        //в Java нет специального оператора для подсчета процента от конкретного числа
        //поэтому используем математику 4-го класса и считаем процент вручную
        //процент от какого-то числа можно посчитать, если это число умножить на необходимое количество процентов
        //и разделить на 100
        //чтобы получить итоговую сумму со скидкой, из итоговой суммы просто вычтем расчитанную скидку:
        double discountedTotal = (aTotal - aTotal*aDiscount/100) + (bTotal - bTotal*bDiscount/100);

        if (discountedTotal > 100) {//проверяем, получилась ли сумма со всеми скидками больше, чем 100
            discountedTotal -= discountedTotal*additionalDiscount/100;//расчитываем скидку и вычитаем ее
            System.out.println("Итого к оплате с учетом всех скидок: " + discountedTotal);
    } else {
            System.out.println("Сумма покупок меньше 100 евро, дополнительных скидок нет.");
            System.out.println("Итого к оплате: "+ discountedTotal);//тут выводим сумму, если доп.скидка не примнняется
        }
}
}