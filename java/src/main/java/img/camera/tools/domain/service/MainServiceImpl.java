package img.camera.tools.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import img.camera.tools.domain.dao.BoardDao;
import img.camera.tools.domain.entity.UserEntity;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {

  private final BoardDao dao;

  public List<UserEntity> getUserLst() {
    List<UserEntity> r = dao.findAll();
    return r;
  }

}
