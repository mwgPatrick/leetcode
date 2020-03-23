import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

import static java.lang.Thread.yield;

/**
 * Leetcode1116
 *
 * @author Mwg
 * @date 2019/11/30 19:44
 */
public class Leetcode1116 {
    /*
    信号量
     */

    class ZeroEvenOdd {
        private int n;

        public ZeroEvenOdd(int n) {
            this.n = n;
        }
        private  Semaphore e = new Semaphore(0);
        private  Semaphore o = new Semaphore(0);
        private Semaphore z = new Semaphore(1);
        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 0;i<n;i++){
                printNumber.accept(0);
                o.release();
                e.release();
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            int m = 2;
            while (m<=n) {
                e.acquire();
                printNumber.accept(m);
                m+=2;
                o.release();
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            int m = 1;
            while (m<=n) {
                o.acquire();
                printNumber.accept(m);
                m+=2;
                e.release();
            }
        }
    }

}
