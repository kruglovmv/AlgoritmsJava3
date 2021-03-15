package com.company;

import java.util.*;

public class Main {
        static final int maxSize = 5;
        public static void main(String[] args) {
                //Задание №3.1
                System.out.println("Задание №3.1");
                Integer [] array = createArray(maxSize);
                long time = System.nanoTime();
                Collection<Integer> collection = Arrays.asList(array);
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на создание коллекции из массива, нс: " + time);
                time = System.nanoTime();
                List<Integer> list = Arrays.asList(array);
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на создание списка из массива, нс: " + time);
                //Задание №3.2-3.3
                System.out.println("Задание №3.2-3.3");
                System.out.println("Простой список:");
                List <Integer> arrayList = new ArrayList<>(list);
                System.out.println(arrayList);
                time = System.nanoTime();
                arrayList.add(10);
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на добавление элемента в список, нс: " + time);
                System.out.println(arrayList);
                time = System.nanoTime();
                arrayList.remove(2);
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на удаление элемента из списка по индексу, нс: " + time);
                System.out.println(arrayList);
                time = System.nanoTime();
                arrayList.remove((Integer) 10);
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на удаление элемента из списка по элементу, нс: " + time);
                System.out.println(arrayList);
                time = System.nanoTime();
                arrayList.add(arrayList.size(), 20);
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на добавление элемента по индексу, нс: " + time);
                System.out.println(arrayList);
                time = System.nanoTime();
                arrayList.get(arrayList.size()-1);
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на получение элемента по индексу, нс: " + time);
                System.out.println(arrayList);
                time = System.nanoTime();
                arrayList.set(0, 0);
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на замену элемента по индексу, нс: " + time);
                System.out.println(arrayList);
                //Задание №3.4
                System.out.println("Задание №3.4");
                System.out.println("Связанный список:");
                TimeTestLinkedList test = new TimeTestLinkedList(new LinkedList<>(list));
                System.out.println(test.getObjectTest());
                test.testAdd(10);
                System.out.println(test.getObjectTest());
                test.testRemove(2);
                System.out.println(test.getObjectTest());
                test.testRemove((Integer) 10);
                System.out.println(test.getObjectTest());
                test.testAdd(test.getObjectTest().size(),10);
                System.out.println(test.getObjectTest());
                test.testGet(test.getObjectTest().size()-1);
                System.out.println(test.getObjectTest());
                test.testSet(0,0);
                System.out.println(test.getObjectTest());
                test.testAddLast(0);
                System.out.println(test.getObjectTest());
                test.testAddFirst(123);
                System.out.println(test.getObjectTest());
                System.out.println("Связанный список объектов MyClass:");
                TimeTestLinkedList<MyClass> test2 = new TimeTestLinkedList();
                System.out.println(test2.getObjectTest());
                test2.testAdd(new MyClass("Zero"));
                MyClass myClassObject = new MyClass("One");
                test2.testAdd(myClassObject);
                System.out.println(test2.getObjectTest());
                test2.testRemove(0);
                System.out.println(test2.getObjectTest());
                test2.testRemove(myClassObject);
                System.out.println(test2.getObjectTest());
                test2.testAdd(test2.getObjectTest().size(), new MyClass("Second"));
                System.out.println(test2.getObjectTest());
                test2.testGet(test2.getObjectTest().size()-1);
                System.out.println(test2.getObjectTest());
                test2.testSet(0, new MyClass("Third"));
                System.out.println(test2.getObjectTest());
                test2.testAddLast(new MyClass("Fourth"));
                System.out.println(test2.getObjectTest());
                test2.testAddFirst(new MyClass("Fifth"));
                System.out.println(test2.getObjectTest());
                //Задание №3.5
                System.out.println("Задание №3.5");
                System.out.println("Работа с итератором:");
                test2.testAdd(myClassObject);
                System.out.println(test2.getObjectTest());
                ListIterator <MyClass> myClassIterator = test2.getObjectTest().listIterator();
                time = System.nanoTime();
                myClassObject = myClassIterator.next();
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на получение следующего элемента в списке через итератор, нс: " + time);
                time = System.nanoTime();
                myClassObject = myClassIterator.previous();
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на получение предыдущего элемента в списке через итератор, нс: " + time);
                time = System.nanoTime();
                boolean flag = myClassIterator.hasNext();
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на проверку наличия следующего элемента в списке через итератор, нс: " + time);
                time = System.nanoTime();
                flag = myClassIterator.hasPrevious();
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на проверку наличия предыдущего элемента в списке через итератор, нс: " + time);
                time = System.nanoTime();
                int index = myClassIterator.previousIndex();
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на получение индекса предыдущего элемента в списке через итератор, нс: " + time);
                time = System.nanoTime();
                index = myClassIterator.nextIndex();
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на получение индекса следующего элемента в списке через итератор, нс: " + time);
                time = System.nanoTime();
                myClassIterator.remove();
                time= System.nanoTime()-time;
                System.out.println("Время затраченное на удаление последнего элемента полученного через итератор в списке, нс: " + time);
                System.out.println(test2.getObjectTest());
        }
        private static Integer[] createArray(int size) {
                Integer [] array = new Integer[size];
                for (int j = 0; j < array.length; j++) {
                        array[j] = new Random().nextInt(1000)-500;
                }
                return array;
        }
}

