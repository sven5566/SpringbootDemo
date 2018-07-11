package com.gvt.sas.backend.dao;

import com.gvt.sas.backend.entity.Integral;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface IntegralMapper {

	/**
	 * 检查手机号是否被绑定
	 * @param phone
	 * @return
	 */
	Integral checkPhone(@Param("phone") String phone);
	
	
	/**
	 * 检查是否存在脱绑数据
	 * @param clientId
	 * @return
	 */
	Integral checkExist(@Param("clientId") String clientId);
	
	/**
	 * 绑定手机号注册会员（享有积分服务）
	 * @param integral
	 * @return
	 */
	int bindingPhone(Integral integral);
	
	
	/**
	 * 修改绑定手机号，积分合并
	 * @param integral
	 * @return
	 */
	int modifyBindingPhone(Integral integral);
	
	
	/**
	 * 删除旧会员
	 * @param pk
	 * @return
	 */
	int deleteMember(@Param("integralpk") String pk);
	
	/**
	 * 积分变更
	 * @param integral
	 * @return
	 */
	int modifyIntegral(Integral integral);
	
	/**
	 * 扣减积分
	 * @param value
	 * @return
	 */
	int minusIntegral(@Param("integralpk") String pk, @Param("value") Integer value);
}
