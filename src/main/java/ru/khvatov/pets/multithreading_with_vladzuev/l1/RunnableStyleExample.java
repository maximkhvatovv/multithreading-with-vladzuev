package ru.khvatov.pets.multithreading_with_vladzuev.l1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RunnableStyleExample {

    public static void main(String[] args) {
        log.info("Starting main() execution...");

        Thread thread = new Thread(
            () -> log.info("I'm executing in {}.", Thread.currentThread().getName()),
            "usingRunnableStyleExample"
        );
        thread.start();

        log.info("Finishing main() execution...");
    }
}