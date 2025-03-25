package img.camera.tools.domain.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tb_user")
public class UserEntity {
  // @GeneratedValue(strategy = GenerationType.IDENTITY) 지금은 안 쓸 건데 자동으로 값 1씩
  // 증가해주며, pk 속성을 가짐
  @Id // primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  @Column(length = 100)
  private String password;

  @Column(length = 100)
  private String username;

  @Column(length = 10)
  private String roles;

  @Column(length = 100)
  private Date regDate;

  @Column(length = 100)
  private Date modDate;
}