import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${className } 
 * 
 * @author  	${user}
 * @since   	${.now}
 * @version 	v1.0
 */
 @Service
public class ${className?cap_first}ServiceImpl implements ${className?cap_first}Service{
	
	@Autowired
	${className?cap_first}Dao ${className}Dao;
	
    // 分页查询
	public List<Map<String,Object>> queryPageList(${className?cap_first} ${className}){
		List<Map<String,Object>> list = ${className}Dao.queryPageList(${className});
		return list;	  
	}

	// 新增
	public int ${className}Add(${className?cap_first} ${className}){
		// TODO Auto-generated method stub
	  	int result = ${className}Dao.${className}Add(${className});
	  	return result;
	}
	
	// 修改
	public int ${className}Update(${className?cap_first} ${className}){
	  	int result = ${className}Dao.${className}Update(${className});
	  	return result;
	}
	
	// 删除
	public int ${className}Del(${className?cap_first} ${className}){
		int result = ${className}Dao.${className}Del(${className});
		return result;
	}

}
