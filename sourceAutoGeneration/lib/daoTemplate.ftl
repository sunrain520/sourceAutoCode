import java.util.List;
import java.util.Map;

/**
 * ${className } 
 * 
 * @author  	${user}
 * @since   	${.now}
 * @version 	v1.0
 */
public interface ${className?cap_first}Dao {

    // 分页查询
	List<Map<String,Object>> queryPageList(${className?cap_first} ${className});

	// 新增
	int ${className}Add(${className?cap_first} ${className});
	
	// 修改
	int ${className}Update(${className?cap_first} ${className});
	
	// 删除
	int ${className}Del(${className?cap_first} ${className});

}
