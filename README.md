## 核心需求
1. 普通用户找到工作日期间价格最便宜的酒店
2. 普通用户找到周末期间价格最便宜的酒店
3. 普通用户找到既包含工作日又包含周末的时间内价格最便宜的酒店
4. 会员用户找到工作日期间价格最便宜的酒店
5. 会员用户找到周末期间价格最便宜的酒店
6. 会员用户找到既包含工作日又包含周末的时间内价格最便宜的酒店

## Task
1. 
    - 描述:酒店预订系统找到普通用户工作期间可预订的最便宜的酒店
    - 动机:实现核心需求的第一条
    - 对象:酒店预订系统、客户、酒店、预订
    - 测试名称:should_return_cheapest_hotel_when_regular_customer_live_in_weekday()
2.
    - 描述:酒店预订系统找到周末时间段普通用户可预订的最便宜的酒店
    - 动机:统计周末时间对于普通用户最便宜的酒店是核心需求,完成该功能比较简单
    - 对象:酒店预订系统、客户、酒店、预订
    - 测试名称:should_return_cheapest_hotel_when_regular_customer_live_in_weekend()
3.
    - 描述:酒店预订系统找到工作日时间段会员用户可预订的最便宜的酒店
    - 动机:这是核心需求,完成该功能比较简单
    - 对象:酒店预订系统、客户、酒店、预订
    - 测试名称:should_return_cheapest_hotel_when_reward_customer_live_in_weekday()
4.
    - 描述:酒店预订系统找到周末时间段会员用户可预订的最便宜的酒店
    - 动机:这是核心需求,完成该功能比较简单
    - 对象:酒店预订系统、客户、酒店、预订
    - 测试名称:should_return_cheapest_hotel_when_reward_customer_live_in_weekend()