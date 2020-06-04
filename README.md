# spring-security-oauth2
# 基于spring-security和oauth2进行单点登录
# 数据库表分为单点登录信息表 和 用户信息和权限表
# 四种认证方式：authorization code（授权码模式），implicit（简化模式），resource owner password credentials（密码模式），client credentials（客户端模式）
# token的管理方式 1.内存模式 2.redis 3.数据库 4.jwt（jwt是不需要访问认证服务器进行验证的）
