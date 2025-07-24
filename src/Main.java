//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Подзадание 1");
        String str = "Я выполняю задание на Java. Пока всё получается!";
        int length = str.length();
        char firstChar = str.charAt(0);
        String containsJava = "нет";
        if (str.indexOf("Java") != -1){
            containsJava = "да";
            System.out.printf("Длина строки: %d. Первый символ: %s. Содержит Java: %s.", length, firstChar, containsJava);
        }
        else{
            System.out.printf("Длина строки: %d. Первый символ: %s. Содержит Java: %s.", length, firstChar, containsJava);
        }


        System.out.println();
        System.out.println();
        System.out.println("Подзадание 2");
        String str2 = "Это тестовая строка для нахождения подстроки.";
        String str3 = "Пока всё успешно!";
        String str4 = "Здесь надо найти индекс слова Java.";
        System.out.println("Найденная подстрока: " + str2.substring(4, 19));
        System.out.println(str3.toUpperCase());
        System.out.println("Индекс слова Java: " + str4.indexOf("Java"));


        System.out.println();
        System.out.println("Подзадание 3");
        String name1 = "хлеб";
        int price1 = 75;
        int count1 = 2;
        String name2 = "молоко";
        int price2 = 95;
        int count2 = 2;
        String name3 = "яйца";
        int price3 = 60;
        int count3 = 2;
        System.out.printf("Вы купили %s, количество: %d, итоговая стоимость: %d рублей.", name1, count1, price1 * count1);
        System.out.println();
        System.out.printf("Вы купили %s, количество: %d бутылки, итоговая стоимость: %d рублей.", name2, count2, price2 * count2);
        System.out.println();
        System.out.printf("Вы купили %s, количество: %d коробки, итоговая стоимость: %d рублей.", name3, count3, price3 * count3);
    }
}