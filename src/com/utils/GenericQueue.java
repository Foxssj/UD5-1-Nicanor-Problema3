package com.utils;

import com.utils.*;

public class GenericQueue<T> {
        private static final int CAPACIDAD_INICIAL = 5;
        private static final int TOP = 0;

        private Collection<T> collection = new Collection<T>(CAPACIDAD_INICIAL);

        public void enqueue(T element) {
                collection.add(element);
        }

        public T dequeue(){
                return collection.delete(TOP);
        }

}
