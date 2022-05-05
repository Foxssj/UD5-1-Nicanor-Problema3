package com.utils;

public class Collection<T> {
     private Object data[] = null;
     private int length = 0 ;

     public Collection(int initialCapacity) {
          data = new Object[initialCapacity];
     }

     public T getElement(int position) {
          return (T) data[position];
     }

     public int length() {return length;}

     public void insert(T element, int position) {
          if (length == data.length ) {
               Object []aux = data;
               data = new Object[data.length *2];

               for (int i = 0; i < aux.length; i++) {
                    data[i] = aux[i];
               }
               aux = null;
          }
          for (int i = length - 1; i >= position ; i--) {
               data[i + 1] = data[i];
          }
          data[position] = element;
          length++;
     }

     public void add(T element) {
          insert(element, length);
     }

     public int search(T element) {
          for (int i = 0; i < length; i++) {
               if (data[i].equals(element)) {
                    return i;
               }
          }
          return -1;
     }

     public T delete(int position) {
          Object aux = data[position];
          for (int i = position; i < length - 1; i++) {
               data[i] = data[i + 1];
          }
          length--;
          return (T)aux;
     }
}
