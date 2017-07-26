
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
 * balance 
 * 
 * @author  	xn071376
 * @since   	2017-7-26 1:09:51
 * @version 	v1.0
 */
 @Service
public class BalanceServiceImpl implements BalanceService{
	
	private static final Logger logger = LoggerFactory.getLogger(BalanceServiceImpl.class);
	
	@Autowired
	BalanceDao balanceDao;
	
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
	public List<Map<String, Object>> queryBalance(Balance balance){
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		try {
			list = balanceDao.queryBalance(balance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// 新增
	public int addBalance(Balance balance){
	  	// TODO Auto-generated method stub
		int result = 0;
		try {
			result = balanceDao.addBalance(balance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	// 修改
	public int updateBalance(Balance balance){
	  	int result = 0;
		try {
			result = balanceDao.updateBalance(balance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	// 删除
	public int delBalance(Balance balance){
		int result = 0;
		try {
			result = balanceDao.delBalance(balance);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
