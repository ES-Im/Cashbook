package com.example.cashbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.cashbook.vo.admin.Admin;
@Mapper
public interface AdminMapper {
	Admin login(Admin admin);
}
