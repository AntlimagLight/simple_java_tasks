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
        "\n Скорость процессора(ггц):"+ ghz + "\n Оперативка(мб):"+ ram +"\n Питание(квт):"+ power 
        +"\n Ух ты, да это же число Пи:"+ pi);

        System.out.print("\n\n №2 Расчет стоимости товара со скидкой \n");
        int product1 = 100;
        int product2 = 200;
        byte discountPercentage = 11;
        float priceDiscount = (product1 + product2) / 100 * discountPercentage;
        float total = product1 + product2 - priceDiscount;
        System.out.print(" Общая сумма скидки:" + priceDiscount + "\n Итого со скидкой:" + total);

        System.out.print("\n\n №3 Вывод на консоль слова JAVA \n");
        System.out.print("    J    a  v     v  a   \n    J   a a  v   v  a a  \n");
        System.out.print(" J  J  aaaaa  V V  aaaaa \n  JJ  a     a  V  a     a");

        System.out.print("\n\n №4 Отображение min и max значений числовых типов данных\n");
        byte by = 127;
        short sh = 32767;
        int in = 2147483647;
        long lo = 9223372036854775807l;
        System.out.print(" Первоначальное значение:" + by +" "+ sh + " " + in + " " + lo);
        by++;
        sh++;
        in++;
        lo++;
        System.out.print("\n Инкремент " + by +" "+ sh + " " + in + " " + lo);
        by--;
        sh--;
        in--;
        lo--;
        System.out.print("\n Декремент " + by +" "+ sh + " " + in + " " + lo);

        System.out.print("\n\n №5 Перестановка значений переменных\n");
        double first = 1.1d;
        double second = 2.2d;
        //Первый способ
        System.out.print(" Перестановка при помощи третьей переменной - исходные значения: " 
        + first +" / "+ second + " ");
        double tmp = first;
        first = second;
        second = tmp;
        System.out.print("| значения после перестановки: " + first +" / "+ second + " ");
        //Второй способ
        System.out.print("\n Перестановка при помощи арефметических операции - исходные значения: "
        + first +" / "+ second + " ");
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.print("| значения после перестановки: " + first +" / "+ second + " ");
        //Третий способ
        System.out.print("\n Перестановка при помощи побитовых операции - исходные значения: " 
        + first +" / "+ second + " ");
        first = first * 10;
        second = second * 10;
        int firstInt = (int)first;
        int secondInt = (int)second;
        firstInt = firstInt << 1;
        secondInt = secondInt >> 1;
        first = (double)firstInt / 10;
        second = (double)secondInt / 10;
        System.out.print("| значения после перестановки: " + first +" / "+ second + " ");
        //Это колдунство что, правда будет применяться на практике? 
        //Или все ради понимания движения битов?

        System.out.print("\n\n №6 Вывод символов и их кодов\n");
        byte a = 35;
        byte b = 38;
        byte c = 64;
        byte d = 94;
        byte e = 95;
        System.out.println(" " + a +" - " + (char) a + "\n " + b +" - " + (char) b + "\n "
        + c +" - " + (char) c + "\n " + d +" - " + (char) d + "\n " + e +" - " + (char) e);

        System.out.print("\n\n №7 Произведение и сумма цифр числа \n");
        int startNum = 345;
        int hun = startNum / 100;
        int ten = startNum / 10 % 10;
        int one = startNum % 100 % 10;
        System.out.println(" Произведение цифр числа: "+ startNum + " = "+ one*ten*hun + 
        "\n Сумма цифр числа: "+ startNum + " = "+(one+ten+hun));

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
