
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.eagleeye.sdk.Metric;
import com.xiaoniu.dataplatform.utils.EasyStr;

import org.springframework.beans.factory.annotation.Autowired;

 /**
 * balance 路由控制器 页面跳转
 * 
 * @author  	xn071376
 * @since   	2017-7-26 1:09:51
 * @version 	v1.0
 */
@Controller
@RequestMapping("/temp")
public class BalanceController {

	private static final Logger logger = LoggerFactory.getLogger(BalanceController.class);

	@Autowired
	BalanceService balanceService;
	
	
	/**
	 * 返回结果
	 * 
	 * @return
	 */
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	@ResponseBody
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

	/**
	 * 结果页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView queryRuleResults() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/list");
		return modelAndView;
	}

}