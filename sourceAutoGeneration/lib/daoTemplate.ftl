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

    // 查询
	List<Map<String, Object>> query${className?cap_first}(${className?cap_first} ${className}) throws Exception;

	// 新增
	int add${className?cap_first}(${className?cap_first} ${className}) throws Exception;
	
	// 修改
	int update${className?cap_first}(${className?cap_first} ${className}) throws Exception;
	
	// 删除
	int del${className?cap_first}(${className?cap_first} ${className}) throws Exception;

}
