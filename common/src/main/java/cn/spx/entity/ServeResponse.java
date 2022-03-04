package cn.spx.entity;

import lombok.Builder;
import lombok.Data;


/**
 * @author mlmdflr
 */
@Data
@Builder
public class ServeResponse<S, D, M> {
    /**
     * 返回状态代码
     */
    private S return_code;
    /**
     * 返回的数据
     */
    private D return_data;
    /**
     * 返回描述 正常情况下为空
     */
    private M return_desc;
    /**
     * 接口调用情况 默认 true
     */
    private boolean success;
}