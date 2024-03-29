

### 技术栈

前端：vue +  Vonic 

后端： Java + Mybatis + MySQL 

代理：nginx



### 本地开发环境配置

- 克隆项目到本地

  ```Git clone git@github.com:persist-xyz/graduation-project.git```

- 创建数据库takeout并导入项目 java_bed/ 目录下的takeout.sql

- 更改数据库配置， java_bed/src/main/resources/jdbc.properties 连接本地

- 打开IDEA，添加Maven配置，tomcat7:run -Dmaven.tomcat.port=8081 -> run

- nginx配置

  ```
  server {
          listen       80;
          server_name  localhost;
          location /ssm {
              rewrite ^/(.+)$ /$1 break;
              include uwsgi_params;
              proxy_pass http://127.0.0.1:8081;
          }
  }
  ```

  命令行启动nginx

- 安装依赖并启动

  - npm install
  - npm start 

  

### 软件截图

#### C端页面：

<img src="./screenshot/01.png" width="375" />

<img src="./screenshot/1.png" width="375" />

<img src="./screenshot/2.png" width="375" />

<img src="./screenshot/3.png" width="375" />

<img src="./screenshot/4.png" width="375" />

<img src="./screenshot/5.png" width="375" />

<img src="./screenshot/7.png" width="375" />

<img src="./screenshot/8.png" width="375" />

<img src="./screenshot/9.png" width="375" />

<img src="./screenshot/10.png" width="375" />

<img src="./screenshot/11.png" width="375" />

<img src="./screenshot/12.png" width="375" />


#### B端页面：

<img src="./screenshot/02.png" width="375" />

<img src="./screenshot/03.png" width="375" />

<img src="./screenshot/04.png" width="375" />

<img src="./screenshot/05.png" width="375" />



### 系统主要功能需求如下：

- B端用户（商家）
  - 商家登录：商家的登录验证，确保信息安全；
  - 商家基本信息设置：登录完成需要完善基本信息后进入菜单界面；
  - 商家菜单信息设置：完善基本信息后可添加菜单类别和单品；
  - 商家的订单处理：可以对用户的提交订单进行处理。

- C端用户（普通用户）管理
  - 用户登录：普通用户的登录安全验证，确保信息安全；
  - 账号设置：显示用户个人的详细信息且可以对已有信息进行简单的修改；
  - 修改密码：用户可以对原有密码就行修改、增加安全性。
  - 修改收货地址：已登录的用户可查看本账户所有已添加收货地址，并且可以添加更多的收货地址和进行相应的操作。

- C端用户（普通用户）
  - 浏览店铺：用户可根据店铺分类进行查看店铺详情；
  - 挑选菜单：用户可随意挑选中意的菜品加入购物车；
  - 提交订单：登录用户可将购物车中商品提生成待处理订单；
  - 查看订单：订单完成后，用户可以查看所有完成的订单，并且可以点击查看订单详情。

