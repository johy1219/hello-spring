package hello.hellospring.controller;

public class MemberForm {
    private String name; // createMemberForm.html에서 입력한 name값이 들어오게 됨

    public String getName() {
        return name; // getter를 통해 값을 꺼냄
    }

    public void setName(String name) {
        this.name = name; // setter를 통해서 값을 넣어줌
    }


}
