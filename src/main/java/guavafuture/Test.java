package guavafuture;

import java.util.concurrent.ExecutionException;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyExecutor myExecutor=new MyExecutor();
        myExecutor.testJdkFuture();
        myExecutor.shutdownThreadPool();
    }
}
