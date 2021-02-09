package net.skhu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data // lombok 어노테이션
@Entity // JPA entity 클래스 앞에 @Entity 붙이기
public class Department {
    @Id // 기본키에 해당하는 변수
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키가 Auto Increment 필드이거나 Identity 필드인 경우
    int id;

    String name;
    String shortName;
    String phone;

}

