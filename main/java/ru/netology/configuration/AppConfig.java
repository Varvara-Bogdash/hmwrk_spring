import main.java.ru.netology.service.PostServiceClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.controller.PostController;
import ru.netology.repository.PostRepository;


@Configuration
public class AppConfig {
    @Bean
    public PostRepository postRepository() {
        return new PostRepository();
    }

    @Bean
    public PostServiceClass postService(PostRepository repository) {
        return new PostServiceClass(repository);
    }

    @Bean
    public PostController postController(PostServiceClass service) {
        return new PostController(service);
    }
}