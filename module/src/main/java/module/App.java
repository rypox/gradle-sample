package module;

import moduleA.SubWorker;

public class App {

    public static void main(final String[] args) {
        System.out.println("simple hello world with gradle");
        // call sub module
        SubWorker worker = new SubWorker();
        boolean done = worker.doIt(3);
        System.out.println("worker is done:" + done);
    }

}
