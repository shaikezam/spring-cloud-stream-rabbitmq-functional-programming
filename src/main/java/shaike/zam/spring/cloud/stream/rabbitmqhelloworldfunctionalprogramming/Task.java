package shaike.zam.spring.cloud.stream.rabbitmqhelloworldfunctionalprogramming;

import org.apache.commons.lang3.RandomStringUtils;

public class Task {

    private String id;
    private String title;
    private String description;

    public Task() {
    }

    public Task(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class TaskBuilder {

        private String id = RandomStringUtils.randomAlphanumeric(10);
        private String title = RandomStringUtils.randomAlphanumeric(10);
        private String description = RandomStringUtils.randomAlphanumeric(10);

        public TaskBuilder() {
        }

        public TaskBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public TaskBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public TaskBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Task build() {
            return new Task(id, title, description);
        }

    }
}
