# 权限认证服务
# 功能
1. jwt鉴权
## 验证用户账户，密码
1. jwt解密后调用admin服务验证账户密码
## 配置服务授信客户端权限
1. 在数据库中配置服务密钥，会验证客户端服务名，密钥。
1. 可配置授信客户端
## 生成用户，和服务的publickey
1. 每次启动判断redis是否有，没有rsa生成并缓存
# 表
auth_client 服务列表
auth_client_service  授权服务表
