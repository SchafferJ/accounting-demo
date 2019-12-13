package com.fxs.accounting.api.dto.request;

import com.fxs.accounting.api.dto.request.basic.BasicRequestDTO;
import com.fxs.accounting.api.enumeration.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author: suxinfa
 * @Date: 2019/12/10 11:44
 * @Description:
 */
@Setter
@Getter
public class LoanApplyRequestDTO extends BasicRequestDTO {
    /**
     * 授权编号
     * 出账授权编号
     */
    @NotNull
    private String acctAuthNo;
    /**
     * 申请书编号
     * 用于与信贷管理系统关联贷款申请时的信息
     */
    @NotNull
    private String applyNo;
    /**
     * 申请日期
     * 业务申请日期
     */
    @NotNull
    private LocalDateTime applyTime;
    /**
     * 交易流水号
     */
    @NotNull
    private String tradeSeqNo;
    /**
     * 合同编号
     * 贷款合同号
     */
    @NotNull
    private String loanContractNo;
    /**
     * 机构码
     * 出账机构，分支机构代码，在S_BCH中存在
     */
    @NotNull
    private String organNo;
    /**
     * 借据号
     */
    @NotNull
    private String loanNo;
    /**
     * 银行代码
     */
    @NotNull
    private String bankNo;
    /**
     * 客户编号
     */
    @NotNull
    private String customerId;
    /**
     * 客户名称
     * 借款人姓名
     */
    @NotNull
    private String customerName;
    /**
     * 证件类型
     * 借款人证件类型
     */
    @NotNull
    private String idType;
    /**
     * 证件号码
     * 借款人证件号
     */
    @NotNull
    private String idNo;
    /**
     * 发证国家
     * 默认填:CN
     */
    private CountryEnum certificationCountry = CountryEnum.CN;
    /**
     * 经销商代码
     * 经销商代码：消费信贷使用，可以不填
     */
    private String distributorCode;
    /**
     * 币种
     */
    @NotNull
    private String currency;
    /**
     * 贷款申请金额
     * 发放金额，对借新还旧来说申请金额应大于原贷款的所有金额
     */
    @NotNull
    private BigDecimal loanAmt;
    /**
     * 放款日期
     */
    @NotNull
    private LocalDateTime loanTime;
    /**
     * 首次还款日
     * 可以不传，针对特殊情况可以传入，比如固定还款日情况下，30号放款，还款日为1号，在期供情况下，下月1号即为首次还款日，客户首期还款期只有1天，所以有时需要下下期的1号为首次还款日，这种情况下需要管理端传入
     */
    private LocalDate firstRepayDate;
    /**
     * 贷款类型
     */
    @NotNull
    private String loanType;
    /**
     *
     */
    private String loanAccountingType;
    /**
     * 最后到期日
     * 合同到期日
     */
    @NotNull
    private LocalDate lastDueDate;
    /**
     * 起息日
     */
    @NotNull
    private LocalDate intStartDate;
    /**
     * 扣款日
     */
    @NotNull
    private Integer dueDay;
    /**
     * 利率模式
     */
    @NotNull
    private LoanRateModeEnum loanIrMode;
    /**
     * 利率计算基础
     */
    @NotNull
    private LoanRateBaseEnum loanIrBase;

    /**
     * 利率类型
     */
    @NotNull
    private String loanIrType;
    /**
     * 基准利率
     */
    @NotNull
    private BigDecimal loanBir;
    /**
     * 利率浮动比例
     * 基准利率浮动比（浮动比）
     */
    @NotNull
    private BigDecimal birFloatingRatio;
    /**
     * 利差
     * 基准利率浮动值（利差）
     */
    @NotNull
    private BigDecimal birFloatingValue;
    /**
     * 执行利率
     */
    @NotNull
    private BigDecimal loanIr;
    /**
     * 罚息利率基础
     */
    @NotNull
    private LoanRateBaseEnum loanPirBase;
    /**
     * 罚息利率类型
     */
    private String loanPirType;
    /**
     * 罚息基准利率
     */
    private BigDecimal loanPenaltyBir;
    /**
     * 罚息执行利率
     */
    @NotNull
    private BigDecimal loanPir;
    /**
     * 还款间隔单位
     */
    @NotNull
    private FrequencyUnitEnum repayFrequencyUnit;
    /**
     * 还款间隔
     */
    @NotNull
    private Integer repayFrequency;
    /**
     * 还款方式
     */
    @NotNull
    private RepayMode repayMode;
    /**
     * 还款类型
     */
    @NotNull
    private String repayType;
    /**
     * 业务数据来源
     */
    @NotNull
    private String buzSource;
    /**
     * 宽限期类型
     */
    @NotNull
    private String loanGraceType;
    /**
     * 本金宽限期天数
     */
    @NotNull
    private Integer principalGraceDay;
    /**
     * 利息宽限期天数
     */
    @NotNull
    private Integer interestGraceDay;
    /**
     * 扣款方式
     */
    @NotNull
    private RepayMethod repayMethod;
    /**
     * 是否采用固定罚息利率
     */
    @NotNull
    private Boolean fixedPir;
    /**
     * 罚息利率种类
     */
    @NotNull
    private PenaltyInterestRateType pirType;
    /**
     * 罚息利率浮动比
     */
    @NotNull
    private BigDecimal pirFloatingRatio;
    /**
     * 罚息利率浮动点差
     */
    private BigDecimal pirFloatingValue;
    /**
     * 计算罚息部分
     */
    private String calPiPart;
    /**
     * 是否计算罚息
     */
    private Boolean calPi;
    /**
     * 下一次利率调整选项
     */
    private String nextIrAdjustOption;
    /**
     * 下一次利率调整间隔
     */
    private Integer nextIrAdjustInterval;
    /**
     * 下一次利率调整间隔单位
     */
    private String nextIrAdjustIntervalUnit;
    /**
     * 挪用利率浮动比例
     */
    private BigDecimal divertIrFloatingRatio;
    /**
     * 第一次调整日
     * 填发放日期
     */
    private LocalDate firstAdjustDate;
    /**
     * 逾期执行利率
     */
    @NotNull
    private BigDecimal overdueIr;
    /**
     * 逾期利率浮动比
     * 常用于某些银行的对公按期还息贷款，逾期后使用该利率
     * 如果不区分，则与罚息保持一致
     */
    @NotNull
    private BigDecimal overdueIrFloatingRatio;
    /**
     * 是否资产买入
     * true:资产买入,false:普通放款
     */
    @NotNull
    private Boolean assetPurchase;
    /**
     * 委托协议
     * 委托贷款时使用，传入后供参考使用
     */
    @NotNull
    private String entrustLoanNo;
    /**
     * 是否期供
     * 一般等额本金、等额本息填 true
     * 否则填 false
     * 该选项决定系统计算首个还款日的规则，如果是期供类则次月有还款，否则当月有还款
     * 备注：但是对于按周或按天来计的贷款，该标志应该传‘false’
     */
    @NotNull
    private Boolean termPay;
    /**
     * 审批人员ID
     * 最终审批的用户的编号，供参考使用
     */
    @NotNull
    private String approvalUserId;
    /**
     * 审批人员名称
     * 最终审批的用户的名称，供参考使用
     */
    @NotNull
    private String approvalUserName;
    /**
     * 用户机构
     * 最终审批的用户所属的机构名称，供参考使用
     */
    @NotNull
    private String approvalUserOrgan;
    /**
     * 贷款期数
     */
    private Integer totalTerm;

    /**
     * 贴息贷款标志
     */
    private Boolean discount;
    /**
     * 贴息利率
     */
    private BigDecimal discountIr;
    /**
     * 放款渠道
     */
    @NotNull
    private String loanChannel;
    /**
     * 还款渠道
     */
    @NotNull
    private String repayChannel;
    /**
     * 资金划转方式
     */
    @NotNull
    private String capitalDivertWay;
    /**
     * 是否延迟支付
     */
    private boolean delayPay;
    /**
     * 延迟支付日期
     */
    private LocalDate delayPayDate;
    /**
     * 利息折扣天数
     */
    private Integer interestFreeDay;
    /**
     * 利息折扣率
     */
    private BigDecimal discountRate;

    /**
     * 增值税率
     * 使用营改增的必传
     */
    private BigDecimal valueAddedTaxRate;
    /**
     * 业务线
     */
    @NotNull
    private String buzLine;
}
