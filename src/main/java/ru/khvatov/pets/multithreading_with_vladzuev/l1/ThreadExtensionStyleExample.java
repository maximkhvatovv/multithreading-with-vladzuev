package ru.khvatov.pets.multithreading_with_vladzuev.l1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadExtensionStyleExample {
    @Slf4j
    private static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            log.info("I'm executing in {}", Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        log.info("main() executing in {}", Thread.currentThread().getName());
        Thread myThread = new MyThread("myThread");
        myThread.start();
    }
}
