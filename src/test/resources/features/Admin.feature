# language: zh-CN
@admin
功能: 登陆admin系统

  @please_login
  场景: 登录admin
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 登陆成功

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

  @register_source_statistic
  场景: admin页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面
    同时 点击数据统计下注册来源统计
    那么 进入注册来源统计页面
    并且 点击注册来源统计页面搜索按钮

  @market_config_search
  场景: admin市场配置来源信息页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面
    并且 点击市场配置来源信息
    那么 进入来源信息页面
    并且 清空搜索栏并输入来源名称
    同时 单击搜索进行查询

  @market_config_add_user
  场景: admin权限管理下新增用户页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面
    并且 点击权限管理下新增用户
    那么 进入新增用户页面
    并且 输入信息
    同时 单击确定

  @market_config_edit_user
  场景: admin权限管理下权限分配页面编辑用户
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面
    并且 点击权限管理下权限分配
    那么 进入权限分配页面
    并且 清空搜索栏并输入用户名
    同时 单击搜索进行权限管理查询
    那么 在查询结果列表单击编辑按钮

  @system_manager_modify_password
  场景: admin权限管理下新增用户页面
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面
    并且 点击系统管理下修改密码
    那么 进入修改密码页面
    并且 输入密码信息
    同时 单击确定按钮提交

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
    并且 单击电审按钮
    那么 成功转跳到个人中心页面
    同时 编辑需求书基本信息
    并且 进行打标签操作

  @please_logout
  场景: 登出admin
    假如 我admin登陆页"http://admin.rongzi.com"
    并且 输入登录信息
    同时 单击登陆按钮
    那么 进入admin页面
    并且 退出登陆
    那么 返回登陆页面


