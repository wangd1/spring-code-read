package com.wang.mapper;

import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

	@Select("select 'order'")
	String selectById();

}
