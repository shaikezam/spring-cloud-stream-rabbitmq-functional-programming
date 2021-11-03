package shaike.zam.spring.cloud.stream.rabbitmqhelloworldfunctionalprogramming;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface TaskBinding {
    String TASK_CHANNEL_INPUT = "task-channel-in";
    String TASK_CHANNEL_OUT = "task-channel-out";

    @Input(TASK_CHANNEL_INPUT)
    SubscribableChannel inboundTasks();
    @Output(TASK_CHANNEL_OUT)
    MessageChannel outboundTasks();
}
