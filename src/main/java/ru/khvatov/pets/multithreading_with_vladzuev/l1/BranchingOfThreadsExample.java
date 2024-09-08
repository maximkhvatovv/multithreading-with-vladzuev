package ru.khvatov.pets.multithreading_with_vladzuev.l1;

import java.util.stream.IntStream;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BranchingOfThreadsExample {

    public static final int NUM_OF_THREADS = 100;

    public static void main(String[] args) {
        final Runnable task = () -> log.info("I'm executing in {}", Thread.currentThread().getName());

        IntStream.range(0, NUM_OF_THREADS).forEach(i -> createThreadAndStart(task));
    }

    private static void createThreadAndStart(Runnable runnable) {
        new Thread(runnable).start();
    }
}
