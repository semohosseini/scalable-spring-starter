package starter.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class RootController {
  // @Value("${application.name}")
  // val appName: String = "springtest"

  @RequestMapping(path = Array("/myapp"), method = Array(GET))
  def root(): Map[String, Any] = Map("name" -> "springtest", "message" -> "It works on my machine!")
}