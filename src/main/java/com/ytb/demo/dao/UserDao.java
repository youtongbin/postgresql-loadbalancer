package com.ytb.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.ytb.demo.pojo.User;

/**
 * user dao
 *
 * @author you_ybin
 */
@Mapper
public interface UserDao {
	
	@DS("slave")
	@Select("select * from user_ytb where id = #{id}")
	User getUser(@Param("id") Integer id);
	
	@DS("slave")
	@Select("select * from user_ytb")
	List<User> getAll();
	
	@DS("master")
	@Insert("insert into user_ytb (name, sex, age, address) values (#{name}, #{sex}, #{age}, #{address})")
	Boolean addUser(@Param("name") String name, @Param("sex") String sex, @Param("age") Integer age, @Param("address") String address);

	@DS("master")
	@Update("update user_ytb set name =#{name}, sex = #{sex}, age = #{age}, address = #{address} where id = #{id}")
	Boolean updateUser(@Param("id") Integer id, @Param("name") String name, @Param("sex") String sex, @Param("age") Integer age, @Param("address") String address);
	
	@DS("master")
	@Delete("delete from user_ytb where id = #{id}")
	Boolean deleteUser(@Param("id") Integer id);
	
	@DS("slave")
	@Delete("delete from user_ytb where id = #{id}")
	Boolean deleteUserSlave(@Param("id") Integer id);
}
