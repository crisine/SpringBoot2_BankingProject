package com.crisine.bankapp.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/*
    JpaRepository 상속 시 <Entity 클래스, PK타입> 을 넘겨주게 된다.
    이렇게 상속을 하고 나면, 기본적인 CRUD 메소드가 자동으로 생성된다.

    또한, @Repository 어노테이션을 추가할 필요도 없다.
    그리고 중요한 점은, Entity 클래스와 Entity Repository는 함께 위치해야 한다!
*/
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
