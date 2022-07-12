public class VariablesTheme {
    public static void main(String[] args) {
        System.out.print(" №1 Создание переменных и вывод их значений на консоль \n");
        byte systemBitDepth = 64;
        short cores = 2;
        int ram = 4000;
        long power = 700l;
        float ghz  = 2.83f;
        double pi = 3.1415926535d;
        boolean processing = true;
        char os ='W';
        System.out.print(" Система:" + os +"\n Разрядность:"+ systemBitDepth + 
                "\n Работоспособность:" + processing +"\n Кол-во ядер:"+ cores + 
                "\n Скорость процессора(ггц):"+ ghz + "\n Оперативка(мб):"+ ram +"\n Питание(квт):"
                + power +"\n Ух ты, да это же число Пи:"+ pi);

        System.out.print("\n\n №2 Расчет стоимости товара со скидкой \n");
        int priceGoodsX = 100;
        int priceGoodsY = 200;
        byte discountPercentage = 11;
        float priceDiscount = (priceGoodsX + priceGoodsY) / 100 * discountPercentage;
        float total = priceGoodsX + priceGoodsY - priceDiscount;
        System.out.print(" Общая сумма скидки:" + priceDiscount + "\n Итого со скидкой:" + total);

        System.out.print("\n\n №3 Вывод на консоль слова JAVA \n");
        System.out.print("    J    a  v     v  a   \n    J   a a  v   v  a a  \n");
        System.out.print(" J  J  aaaaa  V V  aaaaa \n  JJ  a     a  V  a     a");

        System.out.print("\n\n №4 Отображение min и max значений числовых типов данных\n");
        byte byteMaxMin = 127;
        short shortMaxMin = 32767;
        int intMaxMin = 2147483647;
        long longMaxMin = 9223372036854775807l;
        System.out.print(" Первоначальное значение:" + byteMaxMin + " " + shortMaxMin + " " +
                intMaxMin + " " + longMaxMin);
        byteMaxMin++;
        shortMaxMin++;
        intMaxMin++;
        longMaxMin++;
        System.out.print("\n Инкремент " + byteMaxMin + " " + shortMaxMin + " " + intMaxMin + " " +
                longMaxMin);
        byteMaxMin--;
        shortMaxMin--;
        intMaxMin--;
        longMaxMin--;
        System.out.print("\n Декремент " + byteMaxMin + " " + shortMaxMin + " " + intMaxMin + " " +
                longMaxMin);

        System.out.print("\n\n №5 Перестановка значений переменных\n");
        double num1 = 1.1d;
        double num2 = 2.2d;
        //Первый способ
        System.out.print(" Перестановка при помощи третьей переменной - исходные значения: " 
        + num1 +" / "+ num2 + " ");
        double tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.print("| значения после перестановки: " + num1 +" / "+ num2 + " ");
        //Второй способ
        System.out.print("\n Перестановка при помощи арифметических операции - исходные значения: "
                + num1 +" / "+ num2 + " ");
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.print("| значения после перестановки: " + num1 +" / "+ num2 + " ");
        //Третий способ
        System.out.print("\n Перестановка при помощи побитовых операции - исходные значения: " 
        + num1 +" / "+ num2 + " ");
        num1 *= 10;
        num2 *= 10;
        int num1Int = (int) num1;
        int num2Int = (int) num2;
        num1Int = num1Int << 1;
        num2Int = num2Int >> 1;
        num1 = (double) num1Int / 10;
        num2 = (double) num2Int / 10;
        System.out.print("| значения после перестановки: " + num1 +" / "+ num2 + " ");

        System.out.print("\n\n №6 Вывод символов и их кодов\n");
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;
        System.out.println(" " + (byte) codeChar1 +" - " + codeChar1 + "\n " + (byte) codeChar2 + 
                " - " + codeChar2 + "\n " + (byte) codeChar3 +" - " + codeChar3 + "\n " +
                (byte) codeChar4 + " - " + codeChar4 + "\n " + (byte) codeChar5 + " - " +
                codeChar5);

        System.out.print("\n\n №7 Произведение и сумма цифр числа \n");
        int srcNum = 345;
        int hundreds = srcNum / 100;
        int tens = srcNum / 10 % 10;
        int units = srcNum % 10;
        System.out.println(" Произведение цифр числа: "+ srcNum + " = "+ units * tens * hundreds + 
                "\n Сумма цифр числа: "+ srcNum + " = "+ (hundreds + tens + units));

        System.out.print("\n\n №8 Вывод на консоль ASCII-арт Дюка \n");
        char ln = '/';
        char rn = (char) 92; 
        //Вот тут я не понял, сколько раз не вводил с клавиатуры символ или не копировал с сайта,
        //компилятор его не распознавал и выдавал ошибку. error: unclosed character literal Почему?
        //Выкрутился так, но буду благодарен за ответ.
        char bl = '_';
        char ls = '(';
        char rs = ')';
        char p = ' ';
        String row1 = String.valueOf(p) + String.valueOf(p) + String.valueOf(p) + String.valueOf(p)
                + String.valueOf(ln) + String.valueOf(rn) + String.valueOf(p) + String.valueOf(p) + 
                String.valueOf(p) + String.valueOf(p) + String.valueOf(p);
        String row2 = String.valueOf(p) + String.valueOf(p) + String.valueOf(p) + String.valueOf(ln)
                + String.valueOf(p) + String.valueOf(p) + String.valueOf(rn) + String.valueOf(p) + 
                String.valueOf(p) + String.valueOf(p) + String.valueOf(p);
        String row3 = String.valueOf(p) + String.valueOf(p) + String.valueOf(ln) +
                String.valueOf(bl) + String.valueOf(ls) + String.valueOf(p) + String.valueOf(rs) + 
                String.valueOf(rn) + String.valueOf(p) + String.valueOf(p) + String.valueOf(p);
        String row4 = String.valueOf(p) + String.valueOf(ln) + String.valueOf(p) + String.valueOf(p)
                + String.valueOf(p) + String.valueOf(p) + String.valueOf(p) + String.valueOf(p) + 
                String.valueOf(rn) + String.valueOf(p) + String.valueOf(p);
        String row5 = String.valueOf(ln) + String.valueOf(bl) + String.valueOf(bl) + 
                String.valueOf(bl) + String.valueOf(bl) + String.valueOf(ln) + String.valueOf(rn) + 
                String.valueOf(bl) + String.valueOf(bl) + String.valueOf(rn) + String.valueOf(p);
        System.out.println(row1 + "\n" + row2 + "\n" + row3 + "\n" + row4 + "\n" + row5 );

        System.out.print("\n\n №9 Отображение количества сотен, десятков и единиц числа \n");
        int startNum2 = 123;
        int hun2 = startNum2 / 100;
        int ten2 = startNum2 / 10 % 10;
        int one2 = startNum2 % 100 % 10;
        System.out.println(" Число: "+ startNum2 + " содержить "+ hun2 + " сотен, "+ ten2 + 
                " десятков, "+ one2 + " единиц.");

        System.out.print("\n\n №10 Преобразование секунд \n");
        int allsec = 86399;
        int min = allsec / 60 % 60;
        int sec = allsec % 60;
        int hou = allsec / 3600;
        System.out.println(" " + hou +":" + min +":"+ sec);
    }
}
