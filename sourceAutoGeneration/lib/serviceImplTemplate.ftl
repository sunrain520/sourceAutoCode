
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eagleeye.sdk.Metric;
import com.xiaoniu.dataplatform.utils.EasyStr;

/**
 * ${className } 
 * 
 * @author  	${user}
 * @since   	${.now}
 * @version 	v1.0
 */
 @Service
public class ${className?cap_first}ServiceImpl implements ${className?cap_first}Service{
	
	private static final Logger logger = LoggerFactory.getLogger(${className?cap_first}ServiceImpl.class);
	
	@Autowired
	${className?cap_first}Dao ${className}Dao;
	
	public String demo() {
		long startTS = System.currentTimeMillis();
		try {
			logger.info("success");
		} catch (Exception e) {
			logger.error("[syncHandle][{}][同步请求，未知异常：{}]", "【请求参数】", EasyStr.getErrorStack(e));
			Metric.Meter(this.getClass().getName() + ".demo", "【失败原因】", 1);
		}
		long endTS = System.currentTimeMillis();
		logger.debug("[" + startTS + "][requestParam:{}][returnCode:{},耗时:{}ms]", "【请求参数】", "【返回结果】",
				(endTS - startTS));

		return "success";
	}
	
	
    // 查询
	public List<Map<String, Object>> list${className?cap_first}(${className?cap_first} ${className}){
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			list = ${className}Dao.list${className?cap_first}(${className});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// 新增
	public int add${className?cap_first}(${className?cap_first} ${className}){
	  	// TODO Auto-generated method stub
		int result = 0;
		try {
			result = ${className}Dao.add${className?cap_first}(${className});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	// 修改
	public int update${className?cap_first}(${className?cap_first} ${className}){
	  	int result = 0;
		try {
			result = ${className}Dao.update${className?cap_first}(${className});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	// 删除
	public int del${className?cap_first}(${className?cap_first} ${className}){
		int result = 0;
		try {
			result = ${className}Dao.del${className?cap_first}(${className});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

//
	public List<${className?cap_first}> query${className?cap_first}List(${className?cap_first} ${className}) {
		List<${className?cap_first}> list = new ArrayList<${className?cap_first}>();
		try {
			list = ${className}Dao.query${className?cap_first}(${className});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	// 批量插入
	public void insertBatch${className?cap_first}(List<${className?cap_first}> ${className}List) {
		try {
			${className}Dao.insertBatch${className?cap_first}(List<${className?cap_first}> ${className}List);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

 	// 查询总数
	public int queryCount(${className?cap_first} ${className}) {
		int result = 0;
		try {
			result = ${className}Dao.queryCount${className?cap_first}(${className});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	


}
