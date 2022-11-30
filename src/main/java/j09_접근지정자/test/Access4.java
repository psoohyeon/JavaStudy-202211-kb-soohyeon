package j09_접근지정자.test;

import j09_접근지정자.Access1;

public class Access4 extends Access1 {

    protected void access1PrintName(){
        Access1 access = new Access1();
    }


}
//private 클래스안에서만 접근가능
// default: 같은 패키지안에서만
// public : 어디서든  됨
// protected : 상속에서 됨  + 같은패키지
