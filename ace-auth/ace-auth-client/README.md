# 功能
- 嵌入客户端jar包

1. @EnableAceAuthClient  开启鉴权


## 作为服务端
### 判断调用方是否有权限调用本服务
1. 定时刷新获取可以访问的客户端列表。根据服务id，密钥去鉴权服务查询。
1. 每次调用的时候都判断客户端是否在允许列表里面，不允许的话直接拒绝
1. 可以用@IgnoreClientToken 注解 忽略服务鉴权  在controller类or方法上面注解
1. 可通过管理系统配置服务允许的客户端

### 判断用户是否有权限调用本服务
1. 
1. 每次调用的时候都判断用户是否有权限，不允许的话直接拒绝
1. 可以用@IgnoreUserToken 注解 忽略用户鉴权 在controller类or方法上面注解

## 作为客户端
### 每次作为客户端调用其它服务转发user token，生成并传送客户端token
1. 定时更新客户端token
1. 调用返回权限过期的话，自动更新客户端tokin重试。


## 定时调用鉴权服务更新用户和服务公钥，
没有的话会调用rsa生成密钥，并存入redis，有的话取缓存
```java
    @Scheduled(cron = "0 0/1 * * * ?")
    public void refreshUserPubKey(){

    @Scheduled(cron = "0 0/1 * * * ?")
    public void refreshServicePubKey(){
```