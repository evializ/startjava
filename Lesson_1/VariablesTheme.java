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
            System.out.println("Мой компьютер собран на базе процессора Intel" + sym +
                    " Core i3, имеет " + core + " ядра, тактовой частотой " + freqCpu + " ГГц." + "\n" +
                    "В нём установлено " + sizeRam + " Гб оперативной памяти, " + numberHdd +
                    " жестких диска (общий объем " + sizeHdd + " Гб).");
        }
        
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        double discount = (pricePen + priceBook) * 0.11;
        double discountPrice = (pricePen + priceBook) - discount;
        System.out.println("Сумма скидки будет равна " + discount + " руб." + "\n" +
                "Общая стоимость покупки с учётом скидки " + discountPrice + " руб.");

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a" + "\n" +
                "   J   a a  v   v  a a " + "\n" +
                "J  J  aaaaa  V V  aaaaa" + "\n" +
                " JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println(byteMax + " " + ++byteMax + " " + --byteMax);
        System.out.println(shortMax + " " + ++shortMax + " " + --shortMax);
        System.out.println(intMax + " " + ++intMax + " " + --intMax);
        System.out.println(longMax + " " + ++longMax + " " + --longMax);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c;
        System.out.println("Изменение значений переменных местами с помощью третьей переменной" + "\n" +
                "Исходное значение переменной а: " + a + "\n" +
                "Исходное значение переменной b: " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("Новое значение переменной а: " + a + "\n" +
                "Новое значение переменной b: " + b + "\n" +
                "Изменение значений переменных местами с помощью арифметических операций" + "\n" +
                "Исходное значение переменной а: " + a + "\n" +
                "Исходное значение переменной b: " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новое значение переменной а: " + a + "\n" +
                "Новое значение переменной b: " + b + "\n" +
                "Изменение значений переменных местами с помощью побитовой операции" + "\n" +
                "Исходное значение переменной а: " + a + "\n" +
                "Исходное значение переменной b: " + b);
        a ^= b;
        b = a ^ b;
        a ^= b;
        System.out.println("Новое значение переменной а: " + a + "\n" +
                "Новое значение переменной b: " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char codeA = 35;
        char codeB = 38;
        char codeC = 64;
        char codeD = 94;
        char undLine = 95;
        System.out.println("Код символа " + (int)codeA + " - " + codeA + "\n" +
                "Код символа " + (int)codeB + " - " + codeB + "\n" +
                "Код символа " + (int)codeC + " - " + codeC + "\n" +
                "Код символа " + (int)codeD + " - " + codeD + "\n" +
                "Код символа " + (int)undLine + " - " + undLine);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int num1 = 123;
        int x = num1 / 100;
        int y = (num1 / 10) % 10;
        int z = num1 % 10;
        System.out.println("Число " + num1 + " содержит:" + "\n" +
                "I. " + x + " сотен" + "\n" +
                "II. " + y + " десятков" + "\n" +
                "III. " + z + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char bracketL = '(';
        char bracketR = ')';
        char space = ' ';
        System.out.println("" +  space +  space + space + space + slash + backSlash + "\n" +
                space + space + space + slash + space +  space + backSlash + "\n" +
                space + space + slash + undLine + bracketL + space + bracketR + backSlash + "\n" +
                space + slash + space +  space +  space + space + space + space + backSlash + "\n" +
                slash + undLine + undLine + undLine + undLine + slash + backSlash + undLine +
                undLine + backSlash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        int num2 = 345;
        x = num2 / 100;
        y = (num2 / 10) % 10;
        z = num2 % 10;
        int sum = x + y + z;
        int prod = x * y * z;
        System.out.println("I. Сумма цифр числа " + num2 + " = " + sum + "\n" +
                "II. Произведение цифр числа " + num2 + " = " + prod);

        System.out.println("\n10. Преобразование секунд");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int min = (totalSeconds % 3600) / 60;
        int sec = totalSeconds % 60;
        System.out.println(hours + ":" + min + ":" + sec);
    }
}