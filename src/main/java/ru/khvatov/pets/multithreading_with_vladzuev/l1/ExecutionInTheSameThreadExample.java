package ru.khvatov.pets.multithreading_with_vladzuev.l1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExecutionInTheSameThreadExample {
    public static void main(String[] args) {
        Thread th = new Thread(
            () -> log.info("I'm executing in `{}`.", Thread.currentThread().getName())
        );
        th.run();
    }
}
