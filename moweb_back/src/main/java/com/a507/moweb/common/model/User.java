package com.a507.moweb.common.model;
import lombok.*;

/**
 * 참가자에 대한 정보 담은 클래스
 */
@Data
public class User {
    private String user_name;       //유저 닉네임
    private boolean user_status;    //유저 상태
    private int user_layer;         //유저 레이어

    //유저 이름과 레이어로 생성 상태는 자동 false
    public User(String user_name, int user_layer) {
        this.user_name = user_name;
        this.user_status = false;
        this.user_layer = user_layer;
    }
}
