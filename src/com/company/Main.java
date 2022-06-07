package com.company;
public class Main {
    public static void main(String[] args) {

        Person[] A = Log.createArrayOf100Persons(getNames(), getSurnames());
        Log.printP(A);

    }
        public static String[] getNames() {
            return new String[]{"Лёша\n" ,
                    "Тёма\n",
                    "Вадик\n" ,
                    "Вова\n" ,
                    "Валя\n" ,
                    "Даня\n" ,
                    "Деня\n" ,
                    "Дима\n" ,
                    "Егор\n" ,
                    "Кира\n" ,
                    "Лёня\n" ,
                    "Макс\n" ,
                    "Мотя\n" ,
                    "Никита\n" ,
                    "Олег\n" ,
                    "Паша\n" ,
                    "Петя\n" ,
                    "Рома\n" ,
                    "Серёжа\n" ,
                    "Стас"};
        }

        public static String[] getSurnames() {
            return new String[]{"Смирнов\n" ,
                    "Кузнецов\n" ,
                    "Попов\n" ,
                    "Васильев\n" ,
                    "Петров\n" ,
                    "Соколов\n" ,
                    "Михайлов\n" ,
                    "Новиков\n" ,
                    "Фёдоров\n" ,
                    "Морозов\n" ,
                    "Волков\n" ,
                    "Алексеев\n" ,
                    "Лебедев\n" ,
                    "Семёнов\n" ,
                    "Егоров\n" ,
                    "Павлов\n" ,
                    "Козлов\n" ,
                    "Степанов\n" ,
                    "Николаев\n" ,
                    " "};
        }
    }













