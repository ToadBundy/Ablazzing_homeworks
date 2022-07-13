package package_1;

import java.util.Arrays;

/**
 * Домашка №1
 */
public class homework1 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        System.out.println("********************************");
        System.out.println("Base level task 1 ");
        System.out.println("********************************");
        //Дано (переменные ниже менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        String mystr = hi + world + newLine;
        System.out.print(mystr);
        //Привести к правильному виду (Ниже) используя String.trim()
        mystr = hi.trim() + world.toLowerCase()+newLine;
        System.out.print(mystr);
        //затроить (Можно вызвать тольку одну команду System.out.printl n())
        System.out.println();
        System.out.print(mystr.repeat(3));
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!


        //Задача №2
        System.out.println("******************************");
        System.out.println("Base level task 2");
        System.out.println("******************************");
        //Создать переменные с ростом (!в метрах), весом в кило.
        float height = 1.83f;
        float weight = 74.8f;
        float index;
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        index = weight/(height * height);
        //Пример результата вывода на экран:
        System.out.println("height = "+height + ", weight= "+weight);
        System.out.println("index = " + index);
        //21.0345645

        //Задача №3
        System.out.println("******************************");
        System.out.println("Base level task 3");
        System.out.println("******************************");
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        char [] array = new char[]{'a','b','c','d','e'};
        String str = new String(array);
        System.out.println(str);
        array[3] = 'h';
        str = new String(array);
        System.out.println(str);
        //Ожидаемый результат:
        //abcde
        //abche


        //Продвинутый уровень
        //Задача №1
        System.out.println("*******************");
        System.out.println("Advanced level task 1");
        System.out.println("*******************");
        //Произвести преобразование текста "234" в число типа int и прибавить к этому числу длину строки "some_text"
        str = "234";
        String text = "some_text";
        int num = Integer.parseInt(str);
        System.out.println(num + text.length());
        //Задача №2
        System.out.println("********************");
        System.out.println("Advanced level task 2");
        System.out.println("********************");
        double a = 3;
        double b = 5;
        double c = Math.pow((a+b), 2);
        System.out.println(c);
        //Посчитать (a+b)^2 = ?, при a=3, b=5

        //Задача №3
        System.out.println("********************");
        System.out.println("Advanced level task 3");
        System.out.println("********************");
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        int[] array_num1 = new int[] {1,2,5,7,10};
        int[] array_num2 = new int[] {2,3,2,17,15};
        int[] result = new int[3*array_num1.length];
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        System.arraycopy(array_num1,0,result, 0, array_num1.length);
        System.arraycopy(array_num2,0,result, array_num1.length, array_num2.length);
        result[10] = array_num1[0]*array_num2[0];
        result[11] = array_num1[1]*array_num2[1];
        result[12] = array_num1[2]*array_num2[2];
        result[13] = array_num1[3]*array_num2[3];
        result[14] = array_num1[4]*array_num2[4];
        System.out.println(Arrays.toString(result));
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

        //Задача №4
        System.out.println("********************");
        System.out.println("Advanced level task 4");
        System.out.println("********************");
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов, вывести на экран
        String line = "Hello world!";
        line =  line.replaceAll("l", "r");
        line = line.toUpperCase();
        System.out.println(line.substring(0,8));

        //Экспертный уровень
        System.out.println("********************");
        System.out.println("Expert level task 1");
        System.out.println("********************");
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        String js_text = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
        int start = js_text.indexOf("<data>");
        int fin = js_text.indexOf("</data>");
        String data = js_text.substring(start+6, fin);
        String phone_number = data.split(";")[0];
        String email = data.split(";")[1];
        String name = data.split(";")[2];
        phone_number = phone_number.substring(0,4) + "***" +phone_number.substring(7);
        String email_adrress = email.split("@")[0];
        String email_mail = email.split("@")[1];
        email = email_adrress.substring(0, email_adrress.length()-1) +"*@" + "*".repeat(email_mail.split("\\.")[0].length())+"."+email_mail.split("\\.")[1];

        String name_first = name.split(" ")[0];
        String name_second = name.split(" ")[1];
        String name_third = name.split(" ")[2];
        name_first = name_first.substring(0,1)+"*".repeat(name_first.length()-2) + name_first.substring(name_first.length() - 1, name_first.length());
        name_third = name_third.substring(0,1) + ".";
        name = name_first +" "+ name_second + " " + name_third;
        System.out.println(phone_number);
        System.out.println(email);
        System.out.println(name);

        //Примеры возможного текста:
        //Входящий стринг <client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>
        //Вернет - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //Входящий - <client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>
        //Вернет - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
    }
}
