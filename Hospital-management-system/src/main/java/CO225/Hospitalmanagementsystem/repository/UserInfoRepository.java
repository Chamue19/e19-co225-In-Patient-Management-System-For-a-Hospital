package CO225.Hospitalmanagementsystem.repository;

import CO225.Hospitalmanagementsystem.entity.UserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository <UserInfo, Long> {
    Optional<UserInfo> findByUserName(String userName);

    @Query(
            value = "select * from user_info where user_name = ?1",
            nativeQuery = true
    )
    UserInfo findByName(String userName);



    @Query(
            value = "select * from user_info where roles = 'ROLE_DOCTOR'",
            nativeQuery = true
    )
    List<UserInfo> findDoctors();

    @Query(
            value = "select * from user_info where roles = 'ROLE_NURSE'",
            nativeQuery = true
    )
    List<UserInfo> findNurses();


}
