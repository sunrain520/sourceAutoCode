import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * phriskMgmtResult 
 * 
 * @author  	xn071376
 * @since   	2017-7-25 23:43:44
 * @version 	v1.0
 */
 @Service
public class PhriskMgmtResultServiceImpl implements PhriskMgmtResultService{
	
	private static final Logger logger = LoggerFactory.getLogger(PhriskMgmtResultServiceImpl.class);
	
	@Autowired
	PhriskMgmtResultDao phriskMgmtResultDao;
	
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
	public List<Map<String,Object>> queryPhriskMgmtResult(PhriskMgmtResult phriskMgmtResult){
		List<Map<String,Object>> list = phriskMgmtResultDao.queryPhriskMgmtResult(phriskMgmtResult);
		return list;	  
	}

	// 新增
	public int addPhriskMgmtResult(PhriskMgmtResult phriskMgmtResult){
		// TODO Auto-generated method stub
	  	int result = phriskMgmtResultDao.addPhriskMgmtResult(phriskMgmtResult);
	  	return result;
	}
	
	// 修改
	public int updatePhriskMgmtResult(PhriskMgmtResult phriskMgmtResult){
	  	int result = phriskMgmtResultDao.updatePhriskMgmtResult(phriskMgmtResult);
	  	return result;
	}
	
	// 删除
	public int delPhriskMgmtResult(PhriskMgmtResult phriskMgmtResult){
		int result = phriskMgmtResultDao.delPhriskMgmtResult(phriskMgmtResult);
		return result;
	}

}
