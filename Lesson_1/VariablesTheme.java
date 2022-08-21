public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte core = 2;
        short numberHdd = 2;
        int sizeRam = 8;
        long sizeHdd = 750L;
        float freqCpu = 2.30f;
        double number = 2.30;
        char sym = 174;
        boolean isTrue = true;
        if (isTrue) {
            System.out.println("Мой компьютер собран на базе процессора Intel" + sym + " Core i3, имеет " + core + " ядра, тактовой частотой " + freqCpu + " ГГц." + "\n" +
                    "В нём установлено " + sizeRam + " Гб оперативной памяти, " + numberHdd + " жестких диска (общий объем " + sizeHdd + " Гб).");
        }
        
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        double discount = (pricePen + priceBook) * 0.11;
        double cost = (pricePen + priceBook) - discount;
        System.out.println("Сумма скидки будет равна " + discount + " руб.");
        System.out.println("Общая стоимость покупки с учётом скидки " + cost + " руб.");
        
        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        
        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte by = 127;
        short sh = 32_767;
        int in = 2_147_483_647;
        long ln = 9_223_372_036_854_775_807L;
        System.out.println(by);
        by++;
        System.out.println(by);
        by--;
        System.out.println(by);
        System.out.println(sh);
        sh++;
        System.out.println(sh);
        sh--;
        System.out.println(sh);
        System.out.println(in);
        in++;
        System.out.println(in);
        in--;
        System.out.println(in);
        System.out.println(ln);
        ln++;
        System.out.println(ln);
        ln--;
        System.out.println(ln);
        
        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c;
        System.out.println("Изменение значений переменных местами с помощью третьей переменной");
        System.out.println("Исходное значение переменной а: " + a);
        System.out.println("Исходное значение переменной b: " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("Новое значение переменной а: " + a);
        System.out.println("Новое значение переменной b: " + b);
        System.out.println("Изменение значений переменных местами с помощью арифметических операций");
        System.out.println("Исходное значение переменной а: " + a);
        System.out.println("Исходное значение переменной b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Новое значение переменной а: " + a);
        System.out.println("Новое значение переменной b: " + b);
        System.out.println("Изменение значений переменных местами с помощью побитовой операции");
        System.out.println("Исходное значение переменной а: " + a);
        System.out.println("Исходное значение переменной b: " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Новое значение переменной а: " + a);
        System.out.println("Новое значение переменной b: " + b);
        
        System.out.println("\n6. Вывод символов и их кодов");
        char chA = 35;
        char chB = 38;
        char chC = 64;
        char chD = 94;
        char undLine = 95;
        System.out.println("Код символа 35 - " + chA);
        System.out.println("Код символа 38 - " + chB);
        System.out.println("Код символа 64 - " + chC);
        System.out.println("Код символа 94 - " + chD);
        System.out.println("Код символа 95 - " + undLine);
        
        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int num1 = 123;
        int x = num1 / 100;
        int y = (num1 / 10) % 10;
        int z = num1 % 10;
        System.out.println("Число " + num1 + " содержит:" +
                "\nI. " + x + " сотен" +
                "\nII. " + y + " десятков" +
                "\nIII. " + z + " единиц");
        
        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char dashR = '/';
        char dashL = '\\';
        char bracketL = '(';
        char bracketR = ')';
        char whSp = ' ';
        System.out.println("" +  whSp +  whSp + whSp + whSp + dashR + dashL +
                "\n" + whSp + whSp + whSp + dashR + whSp +  whSp + dashL +
                "\n" + whSp + whSp + dashR + undLine + bracketL + whSp + bracketR + dashL +
                "\n" + whSp + dashR + whSp +  whSp +  whSp + whSp + whSp + whSp + dashL +
                "\n" + dashR + undLine + undLine + undLine + undLine + dashR + dashL + undLine + undLine + dashL);
        
        System.out.println("\n9. Произведение и сумма цифр числа");
        int num2 = 345;
        x = num2 / 100;
        y = (num2 / 10) % 10;
        z = num2 % 10;
        int sum = x + y + z;
        int prod = x * y * z;
        System.out.println("I. Сумма цифр числа " + num2 + " = " + sum);
        System.out.println("II. Произведение цифр числа " + num2 + " = " + prod);
        
        System.out.println("\n10. Преобразование секунд");
        int num3 = 86399;
        int hours = num3 / 3600;
        int min = (num3 % 3600) / 60;
        int sec = num3 % 60;
        System.out.println(hours + ":" + min + ":" + sec);
    }
}
