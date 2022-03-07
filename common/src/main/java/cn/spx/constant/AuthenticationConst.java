package cn.spx.constant;

/**
 * @author mlmdflr
 * @date 2022-03-04 15:07
 */
public final class AuthenticationConst {

    /**
     * 没有登陆
     */
    public static final Integer SPX_NOT_LOGIN = 3503;

    /**
     * token无效
     */
    public static final Integer SPX_INVALID_TOKEN = 3504;

    /**
     * token 过期
     */
    public static final Integer SPX_TOKEN_TIMEOUT = 3505;

    /**
     * token 被踢下线
     */
    public static final Integer SPX_BE_REPLACED = 3506;

    /**
     * 没有提供token
     */
    public static final Integer SPX_NOT_TOKEN = 3507;

    /**
     * 角色校验不通过
     */
    public static final Integer SPX_AUTH_NOT_ROLE = 2501;

    /**
     * 权限校验不通过
     */
    public static final Integer SPX_AUTH_NOT_PERM = 2502;
}
