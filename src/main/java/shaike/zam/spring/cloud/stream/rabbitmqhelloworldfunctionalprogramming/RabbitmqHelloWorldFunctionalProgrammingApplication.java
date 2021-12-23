package shaike.zam.spring.cloud.stream.rabbitmqhelloworldfunctionalprogramming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class RabbitmqHelloWorldFunctionalProgrammingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqHelloWorldFunctionalProgrammingApplication.class, args);
    }

    static class Publisher {

        @Bean
        public Supplier<Task> publish() {
            return () -> {
                Task task = new Task.TaskBuilder().build();
                task.setTaskStatus(Status.PUBLISHED);
                System.out.println("Publishing task: " + task);
                return task;
            };
        }
    }

    static class Processor {

        @Bean
        public Function<Task, Task> process() {
            return task -> {
                task.setTaskStatus(Status.PROCESSED);
                System.out.println("Processing task: " + task);
                return task;
            };
        }
    }

    static class Subscriber {

        @Bean
        public Consumer<Task> subscribe() {
            return task -> {
                task.setTaskStatus(Status.SUBSCRIBED);
                System.out.println("Subscribed task: " + task);
            };
        }
    }

}
