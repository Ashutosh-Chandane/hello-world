package hello

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.context.annotation.{Configuration, ComponentScan}
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMethod

@RestController
@Configuration
@EnableAutoConfiguration
@ComponentScan
class HelloConfig {
  @RequestMapping(value=Array("/hello"), method=Array(RequestMethod.GET))
  def home() : String = {
    return "Hello World!";
  }
}