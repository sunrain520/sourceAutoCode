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
	public List<Map<String, Object>> list${className?cap_first}(${className?cap_first} ${className}) ;

	// 新增
	public int add${className?cap_first}(${className?cap_first} ${className});
	
	// 修改
	public int update${className?cap_first}(${className?cap_first} ${className});
	
	// 删除
	public int del${className?cap_first}(${className?cap_first} ${className});

	//
	public List<${className?cap_first}> query${className?cap_first}List(${className?cap_first} ${className});
	
	// 批量插入
	public void insertBatch${className?cap_first}(List<${className?cap_first}> ${className}List);

 	// 查询总数
	public int queryCount(${className?cap_first} ${className});
	
}
