/**
 * Leetcode1115
 * https://leetcode-cn.com/problems/print-foobar-alternately/
 * @author Mwg
 * @date 2019/11/30 19:33
 */
public class Leetcode1115 {
    static class FooBar {
        private int n;
        private volatile boolean flag = true;
        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                while (!flag){
                    Thread.yield();
                }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                flag = false;
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                while (flag){
                    Thread.yield();
                }
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                flag = true;
            }
        }
    }

}
