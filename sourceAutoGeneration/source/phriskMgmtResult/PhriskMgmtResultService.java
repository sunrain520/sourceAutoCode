import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
/**
 * phriskMgmtResult 
 * 
 * @author  	xn071376
 * @since   	2017-7-25 23:43:44
 * @version 	v1.0
 */
 @Service
public interface PhriskMgmtResultService {

    // 查询
	List<Map<String,Object>> queryPhriskMgmtResult(PhriskMgmtResult phriskMgmtResult) ;

	// 新增
	int addPhriskMgmtResult(PhriskMgmtResult phriskMgmtResult);
	
	// 修改
	int updatePhriskMgmtResult(PhriskMgmtResult phriskMgmtResult);
	
	// 删除
	int delPhriskMgmtResult(PhriskMgmtResult phriskMgmtResult);

}
