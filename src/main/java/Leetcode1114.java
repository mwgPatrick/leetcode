/**
 * Leetcode1114
 * https://leetcode-cn.com/problems/print-in-order/submissions/
 * @author Mwg
 * @date 2019/11/30 19:30
 */
public class Leetcode1114 {
    class Foo {
        private volatile int i = 0;
        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            i = 1;
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (i != 1){

            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            i = 2;
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (i != 2){

            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            i = 3;
        }
    }
}
