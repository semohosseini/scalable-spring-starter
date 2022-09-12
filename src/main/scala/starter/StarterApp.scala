package starter

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping


@SpringBootApplication
class StarterApp

object Main extends App {
  SpringApplication.run(classOf[StarterApp])
}
