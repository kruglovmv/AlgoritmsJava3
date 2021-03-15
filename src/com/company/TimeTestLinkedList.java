package com.company;

import java.util.LinkedList;

public class TimeTestLinkedList<T> {
    protected LinkedList<T> objectTest;

    public TimeTestLinkedList(LinkedList<T> objectTest) {
        this.objectTest = objectTest;
    }
    public TimeTestLinkedList(){
        this.objectTest = new LinkedList<>();
    }

    public LinkedList<T> getObjectTest() {
        return objectTest;
    }

    public void setObjectTest(LinkedList<T> objectTest) {
        this.objectTest = objectTest;
    }

    @Override
    public String toString() {
        return "timeTest{" +
                "objectTest=" + objectTest +
                '}';
    }

    public void testAdd(T e) {
        long time = System.nanoTime();
        this.objectTest.add(e);
        time = System.nanoTime() - time;
        System.out.println("Время затраченное на добавление элемента в список, нс: " + time);
    }

    public void testRemove(int e) {
        long time = System.nanoTime();
        this.objectTest.remove(e);
        time = System.nanoTime() - time;
        System.out.println("Время затраченное на удаление элемента из списка по индексу, нс: " + time);
    }

    public void testRemove(T e) {
        long time = System.nanoTime();
        this.objectTest.remove(e);
        time = System.nanoTime() - time;
        System.out.println("Время затраченное на удаление элемента из списка по элементу, нс: " + time);
    }

    public void testAdd(int index, T e) {
        long time = System.nanoTime();
        this.objectTest.add(index, e);
        time = System.nanoTime() - time;
        System.out.println("Время затраченное на добавление элемента по индексу, нс: " + time);
    }

    public void testGet(int index) {
        long time = System.nanoTime();
        this.objectTest.get(index);
        time = System.nanoTime() - time;
        System.out.println("Время затраченное на получение элемента по индексу, нс: " + time);
    }

    public void testSet(int index, T e) {
        long time = System.nanoTime();
        this.objectTest.set(index, e);
        time = System.nanoTime() - time;
        System.out.println("Время затраченное на замену элемента по индексу, нс: " + time);
    }

    public void testAddLast(T e){
        long time = System.nanoTime();
        this.objectTest.addLast(e);
        time=System.nanoTime()-time;
        System.out.println("Время затраченное на добавление элемента в конец списка, нс: "+time);
    }
    public void testAddFirst(T e){
        long time = System.nanoTime();
        this.objectTest.addFirst(e);
        time=System.nanoTime()-time;
        System.out.println("Время затраченное на добавление элемента в начало списка, нс: "+time);
    }
}
