import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
/**
 * ${className } 
 * 
 * @author  	${user}
 * @since   	${.now}
 * @version 	v1.0
 */
 @Service
public interface ${className?cap_first}Service {

    // 查询
	List<Map<String, Object>> query${className?cap_first}(${className?cap_first} ${className}) ;

	// 新增
	int add${className?cap_first}(${className?cap_first} ${className});
	
	// 修改
	int update${className?cap_first}(${className?cap_first} ${className});
	
	// 删除
	int del${className?cap_first}(${className?cap_first} ${className});

}
