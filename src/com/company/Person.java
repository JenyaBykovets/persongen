package com.company;

        public class Person {
        String name;
        String surname;
        int age;
        int weight;
        int height;

        public Person(String name, String surname, int age, int weight, int height) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        @Override
        public String toString() {
            return   name + " " + surname +
                    "  age=" + age +
                    " , weight=" + weight +
                    " kg, height=" + height + " cm";
        }
    }

