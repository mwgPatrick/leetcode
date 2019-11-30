import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

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

        Semaphore z = new Semaphore(1);
        Semaphore e = new Semaphore(0);
        Semaphore o = new Semaphore(0);

        public void zero(IntConsumer printNumber) throws InterruptedException {
            for(int i=0; i<n;i++) {
                z.acquire();
                printNumber.accept(0);
                if((i&1)==0) {
                    o.release();
                }else {
                    e.release();
                }
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for(int i=2; i<=n; i+=2) {
                e.acquire();
                printNumber.accept(i);
                z.release();
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for(int i=1; i<=n; i+=2) {
                o.acquire();
                printNumber.accept(i);
                z.release();
            }
        }
    }
}
