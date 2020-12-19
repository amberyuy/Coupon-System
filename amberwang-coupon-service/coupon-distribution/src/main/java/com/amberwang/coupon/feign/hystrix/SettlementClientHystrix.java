package com.amberwang.coupon.feign.hystrix;

import com.amberwang.coupon.exception.CouponException;
import com.amberwang.coupon.feign.SettlementClient;
import com.amberwang.coupon.vo.CommonResponse;
import com.amberwang.coupon.vo.SettlementInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <h1>结算微服务熔断策略实现</h1>
 */
@Slf4j
@Component
public class SettlementClientHystrix implements SettlementClient {

    /**
     * <h2>优惠券规则计算</h2>
     * @param settlement {@link SettlementInfo}
     */
    @Override
    public CommonResponse<SettlementInfo> computeRule(SettlementInfo settlement)
            throws CouponException {

        log.error("[eureka-client-coupon-settlement] computeRule" +
                "request error");

        settlement.setEmploy(false);
        settlement.setCost(-1.0);

        return new CommonResponse<>(
                -1,
                "[eureka-client-coupon-settlement] request error",
                settlement
        );
    }
}
