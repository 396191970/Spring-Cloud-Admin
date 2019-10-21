# Cloud-Admin(`开源项目`）
2.0  Cloud-Admin是国内首个基于`Spring Cloud`微`服务`化`开发平台`，具有统一授权、认证后台管理系统，其中包含具备用户管理、资源权限管理、网关API管理等多个模块，支持多业务系统并行开发，可以作为后端服务的开发脚手架。代码简洁，架构清晰，适合学习和直接项目中使用。核心技术采用`Spring Boot2`以及`Spring Cloud (Finchley.M8)`相关核心组件，前端采用`vue-element-admin`组件。 

# 模块说明
![image.png](http://upload-images.jianshu.io/upload_images/5700335-8d69f4e885a4ec85.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 架构摘要
#### 服务鉴权
通过`JWT`的方式来加强服务之间调度的权限验证，保证内部服务的安全性。

#### 监控
利用Spring Boot Admin 来监控各个独立Service的运行状态；利用Hystrix Dashboard来实时查看接口的运行状态和调用频率等。

#### 负载均衡
将服务保留的rest进行代理和网关控制，除了平常经常使用的node.js、nginx外，Spring Cloud系列的zuul和ribbon，可以帮我们进行正常的网关管控和负载均衡。其中扩展和借鉴国外项目的扩展基于JWT的`Zuul限流插件`，方面进行限流。

#### 服务注册与调用
基于Eureka来实现的服务注册与调用，在Spring Cloud中使用Feign, 我们可以做到使用HTTP请求远程服务时能与调用本地方法一样的编码体验，开发者完全感知不到这是远程方法，更感知不到这是个HTTP请求。

#### 熔断机制
因为采取了服务的分布，为了避免服务之间的调用“雪崩”，采用了`Hystrix`的作为熔断器，避免了服务之间的“雪崩”。

------

# `启动指南`

## 项目结构
```
├─Spring-Cloud-Admin
│  │  
│  ├─ace-modules--------------公共服务模块（基础系统、搜索、OSS）
      │ 
      ├─ace-admin-----------------管理系统 提供菜单，权限，用户等管理
      │ 
      ├─ace-generator-----------------根据表生成代码
      │ 
      ├─ace-interface-----------------公用接口 jar包
      │ 
      ├─ace-tool-----------------集成阿里云等工具 
│  │ 
│  ├─ace-auth-----------------服务鉴权中心
│  │ 
      │ 
      ├─ace-auth-client----------------客户端，jar包，嵌入需要鉴权的服务
      │ 
      ├─ace-auth-common----------------公共jar包
      │ 
      ├─ace-auth-server-----------------鉴权服务
│  │ 
│  ├─ace-gate-----------------网关负载中心
│  │ 
      │ 
      ├─ace-gate-ratelimit----------------zuul 网关限流 jar包
      │ 
      ├─ace-gate-zuul----------------zuul 网关  两个网关2选一
      │ 
      ├─ace-auth-server-----------------gate way 网关  两个网关2选一
│  ├      
│  ├─ace-common---------------通用脚手架，其他服务依赖的jar包
│  │ 
│  ├─ace-center---------------服务注册中心 eruake
│  │ 
│  ├─ace-control--------------运维中心（监控、链路）
│  │
      │ 
      ├─ace-monitor----------------- spring admin 监控服务
      │ 
      ├─ace-trace----------------zipkin 调用链追踪服务
│  │   
│  └─ace-sidebar--------------调用第三方语言
│
```

## 环境须知
- mysql一个，redis一个，rabbitmq一个
- jdk1.8
- IDE插件一个，`lombok插件`，

## 运行步骤
启动redis

启动rabbitmq

启动eureka

启动数据库
1. 启动数据库，
1. 运行数据库脚本：ace-admin/db/init.sql、ace-auth-server/db/init.sql、ace-trace
1. 修改配置数据库配置：ace-admin/src/main/resources/application.yml、ace-gate/src/main/resources/application.yml

按`顺序`启动服务
1. CenterBootstrap eureka
1. AuthBootstrap（ace-auth-server）、
1. AdminBootstrap（ace-admin）、
1. GatewayServerBootstrap（ace-gateway-v2）

## 须知
因为AG-Admin是一个`前后端分离`的项目，所以后端的服务必须先启动，在后端服务启动完成后，再启动前端的工程。

UI工程启动[Cloud-Admin-UI][点击打开](https://github.com/396191970/Cloud-Admin-UI)

## 添加功能
1. ace-generator 根据数据库生成curd 代码 http接口 和vue js 前端文件
1. 将生成的文件放入相关的后端，和前端项目中
1. 管理系統配置菜单，按钮，资源
1. 管理系统配置菜单到用户的授权
1. 如果增加应用的的话，需要配置应用相关的密钥, 管理系統数据库配置，和应用配置文件配置
1. 配置网关转发
