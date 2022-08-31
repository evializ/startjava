import java.lang.*;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 18;
        double  height = 1.76;
        boolean maleGender = true;
        String name = "Sergey";
        if(age > 20) {
            System.out.println("Вы ещё молоды.");
        } else {
            System.out.println("Вам уже больше 20, пора покорять вершины.");
        }
        if(!maleGender) {
            System.out.println("Вы женщина?");
        } else {
            System.out.println("Вы мужчина.");
        }
        if(height < 1.80) {
            System.out.println("А вы не такой высокий как кажетесь");
        } else {
            System.out.println("С вашим ростом можно успешно играть в баскетбол.");
        }
        char firstLetterName = name.charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Возможно вас зовут Michail.");
        } else if(firstLetterName == 'I') {
            System.out.println("Возможно вас зовут Irina.");
        } else {
            System.out.println("Затрудняюсь предположить как вас зовут.");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 5;
        int num2 = 13;
        if(num1 > num2) {
            System.out.println("Число " + num1 + "больше числа " + num2);
        } else if(num1 == num2) {
            System.out.println("Числа " + num1 + " и " + num2 + " равны");
        } else {
            System.out.println("Число " + num2 + " больше числа " + num1);
        }

        System.out.println("\n3. Работа с числом");
        int num3 = -8;
        if(num3 != 0) {
            if((num3 % 2) == 0) {
                if(num3 > 0) {
                    System.out.println("Число " + num3 + " является чётным и положительным.");
                } else {
                    System.out.println("Число " + num3 + " является чётным и отрицательным.");
                }
            } else {
                if(num3 > 0) {
                    System.out.println("Число " + num3 + " является нечётным и положительным.");
                } else {
                    System.out.println("Число " + num3 + " является нечётным и отрицательным.");
                }
            }
        } else {
            System.out.println("Число равно нулю.");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 247;
        num2 = 247;
        System.out.println("Первое число = " + num1 + "\n" +
                "Второе число = " + num2);
        int a1 = num1 / 100;
        int a2 = num2 / 100;
        if(a1 == a2) {
            System.out.println("Цифра " + a1 + " одинакова в обоих числах." + "\n" +
                    " и находится в 1 разряде");
        }
        int b1 = (num1 / 10) % 10;
        int b2 = (num2 / 10) % 10;
        if(b1 == b2) {
            System.out.println("Цифра " + b1 + " одинакова в обоих числах." + "\n" +
                    " и находится во 2 разряде");
        }
        int c1 = num1 % 10;
        int c2 = num2 % 10;
        if(c1 == c2) {
            System.out.println("Цифра " + c1 + " одинакова в обоих числах." + "\n" +
                    " и находится в 3 разряде");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char charCode = '\u0057';
        System.out.println(charCode);
        if(charCode >= 'a' && charCode <= 'z') {
            System.out.println("Это маленькая буква");
        } else if(charCode >= 'A' && charCode <= 'Z') {
            System.out.println("Это большая буква");
        } else if(charCode >= '0' && charCode <= '9') {
            System.out.println("Это число");
        } else {
            System.out.println("Символ не является буквой или числом");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300_000;
        double interest = 0;
        double depositInterest = 0;
        System.out.println("Сумма вклада = " + deposit + " руб.");
        if(deposit < 100_000) {
            interest = deposit * 0.05;
            depositInterest = deposit + interest;
            System.out.println("Начисленный процент = " + (int) interest + " руб." + "\n" +
                    "Итоговая сумма вклада = " + (int) depositInterest + " руб.");
        } else if(deposit >= 100_000 && deposit >= 300_000) {
            interest = deposit * 0.07;
            depositInterest = deposit + interest;
            System.out.println("Начисленный процент = " + (int) interest + " руб." + "\n" +
                    "Итоговая сумма вклада = " + (int) depositInterest + " руб.");
        } else if(deposit > 300_000) {
            interest = deposit * 0.1;
            depositInterest = deposit + interest;
            System.out.println("Начисленный процент = " + (int) interest + " руб." + "\n" +
                    "Итоговая сумма вклада = " + (int) depositInterest + " руб.");
        }

        System.out.println("\n7. Определение оценки по предметам");
        int historyInterest = 59;
        int programmingInterest = 91;
        int historyScore = 0;
        int programmingScore = 0;
        if(historyInterest > 91) {
            historyScore = 5;
        } else if(historyInterest > 73) {
            historyScore = 4;
        } else if(historyInterest > 60) {
            historyScore = 3;
        } else if(historyInterest <=60) {
            historyScore = 2;
        }
        if(programmingInterest > 91) {
            programmingScore = 5;
        } else if(programmingInterest > 73) {
            programmingScore = 4;
        } else if(programmingInterest > 60) {
            programmingScore = 3;
        } else if(programmingInterest <=60) {
            programmingScore = 2;
        }
        System.out.println("Оценка " + historyScore + " по Истории" + "\n" +
                "Оценка " + programmingScore + " по Программированию");
        int averageScore = (historyScore + programmingScore) / 2;
        int averagePercentage = (historyInterest + programmingInterest) / 2;
        System.out.println("Средний бал по предметам: " + averageScore + "\n" +
                "Средний процент по предметам: " + averagePercentage);

        System.out.println("\n8. Расчет прибыли");
        int rentPremises = 5000;
        int averageSales = 13000;
        int costPrice = 9000;
        int annualRevenue = (averageSales * 12) - (costPrice * 12) - (rentPremises * 12);
        if(annualRevenue > 0) {
            System.out.println("Прибыль за год: +" + annualRevenue);
        } else {
            System.out.println("Прибыль за год:" + annualRevenue);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        deposit = 567;
        a1 = deposit / 100;
        b1 = (deposit / 10) % 10;
        c1 = deposit % 10;
        int x = 0;
        if(b1 > 5) {
            x = (b1 - 5) * 10;
            b1 = 5;
            c1 += x;
        }
        int depositTest = (a1 * 100) + (b1 * 10) + c1;
        System.out.println("Банкомат выдал:" + "\n" +
                "Номиналом 100 USD - " + a1 + " банкнот," + "\n" +
                "Номиналом 10 USD - " + b1 + " банкнот," + "\n" +
                "Номиналом 1 USD - " + c1 + " банкнот." + "\n" +
                "Итого банкоматом выдано " + depositTest + " USD.");
    }
}