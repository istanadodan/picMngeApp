package img.camera.tools.domain.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import img.camera.tools.domain.entity.UserEntity;

@Repository
public interface BoardDao extends JpaRepository<UserEntity, Long> {

  @Query(value = "select * from tb_user", nativeQuery = true)
  public List<UserEntity> findAll();

}
