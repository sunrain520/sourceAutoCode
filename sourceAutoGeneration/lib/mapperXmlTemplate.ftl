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

	<!-- 字段 -->
	<sql id="Base_Column_List">
		<#list columnMap as column>${column.remark}<#if column_has_next>,</#if></#list>
	</sql>

	<select id="idIsExist" parameterType="String"
		resultType="Integer" >
		SELECT COUNT(0) FROM ${tableName} WHERE
		f_apply_id = ${r"#{"}f_apply_id${r"}"}
	</select>

	<insert id="add${className?cap_first}" parameterType="java.util.Map" >
		INSERT INTO ${tableName} SET
		<#list columnMap as column>
		<if test="${column.columnName} != null">
			${column.remark} = ${r"#{"}${column.columnName}${r"}"},
		</if>
		</#list>
		create_time = NOW()
	</insert>

	<update id="update${className?cap_first}" parameterType="java.util.Map">
		UPDATE
		${tableName} SET
		<#list columnMap as column>
		<if test="${column.columnName} != null">
			${column.remark} = ${r"#{"}${column.columnName}${r"}"},
		</if>
		</#list>
		create_time = NOW()
		WHERE
		f_apply_id = ${r"#{"}f_apply_id${r"}"}
	</update>

	<select id="query${className?cap_first}" parameterType="java.util.Map" resultType="java.util.Map" >
		SELECT <include refid="Field"></include> FROM ${tableName} 
	</select>
	
	<insert id="insertBatch${className?cap_first}" parameterType="java.util.List">
		insert into
		t_ph_risk_rule_result
		(<include refid="Field"></include>)
		values
		<foreach collection="list" index="index" item="item"
			separator=",">
			(<#list columnMap as column>item.${column.columnName}<#if column_has_next>,</#if></#list>)
		</foreach>
	</insert>
	
</mapper>
