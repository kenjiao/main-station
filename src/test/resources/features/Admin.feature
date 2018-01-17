# language: zh-CN
@admin
功能: 登陆admin系统测试

  @please_login
  场景: 登录admin
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面

  @index
  场景: admin页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面"RegisterSource"
    并且 点击搜索按钮

  @userinfo
  场景: admin页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面"RegisterSource"
    并且 点击用户管理
    那么 进入用户信息页面

  @userinfo_search
  场景: admin页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面"RegisterSource"
    并且 点击用户管理
    那么 进入用户信息页面
    同时 输入手机号

    并且 单击查询







