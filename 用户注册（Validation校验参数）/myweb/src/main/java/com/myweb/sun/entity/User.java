package com.myweb.sun.entity;

import javax.validation.constraints.*;

public class User {
//    Integer不能用@NotBlank和@NotEmpty
    @NotNull(message = "用户编号不能为空")
    private Integer id;
    @NotBlank(message="用户名不能为空")
    private String userName;
//    @Size(min=6,max=10,message = "密码长度在6~10位之间")
    @Pattern(regexp="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$",message="密码至少八个字符，至少一个字母，一个数字和一个特殊字符")
    private String passWord;
    @NotBlank(message = "邮箱不能为空")
    @Email(message="输入的邮箱格式不正确")
    private String email;
//    为了方便移植，一般将日期格式设置为字符串格式
    @Pattern(regexp="^\\d{4}(\\-|\\/|\\.)\\d{1,2}\\1\\d{1,2}$",message="日期格式不正确，应该为年-月-日")
    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
