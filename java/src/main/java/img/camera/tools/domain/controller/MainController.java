package img.camera.tools.domain.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import img.camera.tools.domain.entity.UserEntity;
import img.camera.tools.domain.service.MainService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MainController {
  private final MainService mainService;

  @GetMapping("/")
  public RedirectView index() {
    return new RedirectView("/index.html"); // 정적 파일로 리디렉트
  }

  @GetMapping("/login")
  public RedirectView login() {
    return new RedirectView("/login.html"); // 정적 파일로 리디렉트
  }

  @GetMapping("/board")
  public List<UserEntity> board() {

    return mainService.getUserLst();
  }
}
