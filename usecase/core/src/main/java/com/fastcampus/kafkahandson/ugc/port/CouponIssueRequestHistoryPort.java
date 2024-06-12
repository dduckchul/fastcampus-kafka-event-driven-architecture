package com.fastcampus.kafkahandson.ugc.port;

public interface CouponIssueRequestHistoryPort {
    // 해당 쿠폰 이벤트 내에서, 유저의 발급 요청이 없다면 기록
    boolean setHistoryIfNotExists(Long couponEventId, Long userId);

    // 해당 쿠폰 이벤트 내에서, 유저의 발급 요청을 몇번째로 했는지 기록
    Long getRequestSequencialNumber(Long couponEventId);
}
