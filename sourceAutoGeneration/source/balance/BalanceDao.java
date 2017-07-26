import java.util.List;
import java.util.Map;

/**
 * balance 
 * 
 * @author  	xn071376
 * @since   	2017-7-26 1:09:51
 * @version 	v1.0
 */
public interface BalanceDao {

    // 查询
	List<Map<String, Object>> queryBalance(Balance balance) throws Exception;

	// 新增
	int addBalance(Balance balance) throws Exception;
	
	// 修改
	int updateBalance(Balance balance) throws Exception;
	
	// 删除
	int delBalance(Balance balance) throws Exception;

}
