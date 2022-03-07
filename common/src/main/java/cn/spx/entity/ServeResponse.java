package cn.spx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author mlmdflr
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
     * 接口调用情况
     */
    private boolean success;

    @NoArgsConstructor
    public static class Builder<S, D, M> {

        private S return_code;

        private D return_data;

        private M return_desc;

        private boolean success;

        public Builder<S, D, M> return_code(S return_code) {
            this.return_code = return_code;
            return this;
        }

        public Builder<S, D, M> return_data(D return_data) {
            this.return_data = return_data;
            return this;
        }

        public Builder<S, D, M> return_desc(M return_desc) {
            this.return_desc = return_desc;
            return this;
        }

        public Builder<S, D, M> success() {
            this.success = true;
            return this;
        }

        public ServeResponse<S, D, M> build() {
            return new ServeResponse<>(this.return_code, this.return_data, this.return_desc, this.success);
        }
    }
}