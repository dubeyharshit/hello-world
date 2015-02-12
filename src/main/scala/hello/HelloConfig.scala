package hello


import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation._

//import org.springframework.web.bind.annotation.RequestMapping
//import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.{ResponseBody, RequestMapping, RequestParam, RestController}
/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @harshit dubey
 * @since 1.0
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
class HelloConfig {
  @RequestMapping(value = Array("/"),method=Array(RequestMethod.GET))
  @ResponseBody
  def home(): String = "Hello World!"
}
