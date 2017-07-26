<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >

<!-- 需要手动修改Dao路径 -->
<mapper namespace="${className?cap_first}Dao">

	<!-- 需要手动修改实体路径 -->
	<resultMap id="ResultMap"
		type="${className?cap_first}">
		<#list columnMap as column>
		<result column="${column.remark}" property="${column.columnName}" />
		</#list>
	</resultMap>

	<sql id="Base_Column_List">
	<#list columnMap as column>${column.remark},</#list>
	</sql>

	<select id="idIsExist" parameterType="String"
		resultType="Integer" >
		SELECT COUNT(0) FROM ${tableName} WHERE
		f_apply_id = 1
	</select>

	<insert id="add${className?cap_first}" parameterType="java.util.Map" >
		INSERT INTO ${tableName} SET
		<if test="aplid != null">
			aplid = 1,
		</if>
		update_time = NOW()
	</insert>

	<update id="update${className?cap_first}" parameterType="java.util.Map">
		UPDATE
		${tableName} SET
		apl_id = 1,
		update_time = NOW()
		WHERE
		aplid = 1
	</update>

	<select id="query${className?cap_first}" parameterType="java.util.Map" resultType="java.util.Map" >
		SELECT * FROM ${tableName} 
	</select>
</mapper>
