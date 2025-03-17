package img.camera.tools.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class MainController {

  @GetMapping("/")
  public RedirectView index() {
    return new RedirectView("/index.html"); // 정적 파일로 리디렉트
  }

  @GetMapping("/login")
  public RedirectView login() {
    return new RedirectView("/login.html"); // 정적 파일로 리디렉트
  }
}
