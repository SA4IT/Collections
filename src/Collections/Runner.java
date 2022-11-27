package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Runner {
    public static void main(String[] args) {
        //реверс стека.
        System.out.println();
        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(15);
        stack.push(36);
        stack.push(13);
        stack.push(64);
        stack.push(486);
        stack.push(24);

        System.out.println("Исходный стек: " + stack);

        Iterator itr = stack.iterator();

        int for_find_begin = stack.size()/2;

        int ind = 0;
        while(itr.hasNext() && for_find_begin!=ind){
            int begin = (Integer)itr.next();//первый элемент
            int last = stack.get(stack.size()-ind - 1);//последний элемент
            stack.setElementAt(last,ind);
            stack.setElementAt(begin, stack.size()-ind - 1);
            ind ++;
        }
        System.out.println("Обработанный стек: " + stack);


        System.out.println();
        for(int i: Range.fromTo(0,10)){
            System.out.println(i);
        }
    }
    private static class Range implements Iterable<Integer>{
        int start;
        int end;

        public  static  Range fromTo(int from, int to){
            return  new Range(from, to);
        }
        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public Iterator iterator(){
            return new Iterator(start);
        }

        class Iterator implements  java.util.Iterator<Integer>{
            int current;

            public Iterator(int current) {
                this.current = current;
            }

            @Override
            public boolean hasNext() {
                return current<=end;
            }

            @Override
            public Integer next() {
                return current++;
            }
        }
    }
}
