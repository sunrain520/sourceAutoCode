import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
/**
 * balance 
 * 
 * @author  	xn071376
 * @since   	2017-7-26 1:09:51
 * @version 	v1.0
 */
 @Service
public interface BalanceService {

    // 查询
	List<Map<String, Object>> queryBalance(Balance balance) ;

	// 新增
	int addBalance(Balance balance);
	
	// 修改
	int updateBalance(Balance balance);
	
	// 删除
	int delBalance(Balance balance);

}
