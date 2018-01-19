# language: zh-CN
@admin
功能: 登陆admin系统

  @please_login
  场景: 登录admin
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面

  @register_source_statistic
  场景: admin页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面
    同时 点击数据统计下注册来源统计
    那么 进入注册来源统计页面
    并且 点击注册来源统计页面搜索按钮


  @userinfo_search
  场景: admin用户信息页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面
    并且 点击用户管理
    那么 进入用户信息页面
    同时 输入手机号
    并且 单击查询

  @market_config
  场景: admin市场配置来源信息页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面
    并且 点击市场配置来源信息
    那么 进入来源信息页面
    并且 清空搜索栏并输入来源名称
    同时 单击搜索进行查询

  @market_config
  场景: admin权限管理下权限分配页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面
    并且 点击权限管理下权限分配
    那么 进入权限分配页面
    并且 清空搜索栏并输入用户名
    同时 单击搜索进行权限管理查询

  @custom_reqirement_auditing
  场景: admin质检融资需求书页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面
    并且 点击运营管理质检融资需求书
    那么 进入质检融资需求书页面
    同时 输入融资人用户手机号
    并且 单击查询按钮
    那么 拨打客服电话

  @please_logout
  场景: 登出admin
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面
    并且 退出登陆
    那么 返回登陆页面


