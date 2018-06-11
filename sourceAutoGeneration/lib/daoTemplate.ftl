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
	public List<Map<String, Object>> list${className?cap_first}(${className?cap_first} ${className}) throws Exception;
	
	// 新增
	public int add${className?cap_first}(${className?cap_first} ${className}) throws Exception;
	
	// 修改
	public int update${className?cap_first}(${className?cap_first} ${className}) throws Exception;
	
	// 删除
	public int del${className?cap_first}(${className?cap_first} ${className}) throws Exception;
	
	//
	public List<${className?cap_first}> query${className?cap_first}List(${className?cap_first} ${className}) throws Exception;
	
	// 批量插入
	public void insertBatch${className?cap_first}(List<${className?cap_first}> ${className}List) throws Exception;

 	// 查询总数
	public int queryCount(${className?cap_first} ${className}) throws Exception;
	
}
