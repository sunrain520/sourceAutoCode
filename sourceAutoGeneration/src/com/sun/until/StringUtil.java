package com.sun.until;

/**
 * 替换下划线并让它的下一个字母为大写
 * 
 * @author xn071376
 *
 */
public class StringUtil {
	/**
	 * 将类名转换为文件名，java公共类名与其文件名应该相同，这里将首字母转换为大写 如operateLog 转换后为 OperateLog 首字母大写
	 * 
	 * @param srcStr
	 * @return
	 */
	public static String firstCharacterToUpper(String srcStr) {
		return srcStr.substring(0, 1).toUpperCase() + srcStr.substring(1);
	}

	/**
	 * 将表名转换为类型类名 比如 t_operate_log 转换后为 operate_log
	 * 
	 * @param srcStr
	 * @return
	 */
	public static String delfirstCharacterToUpper(String srcStr) {
		return srcStr.toLowerCase().substring(srcStr.indexOf("_") + 1);
//		return srcStr.substring(0, 1).toUpperCase() + srcStr.substring(1);
	}

	/**
	 * 替换字符串并让它的下一个字母为大写
	 * 
	 * @param srcStr
	 * @param org
	 * @param ob
	 * @return
	 */
	public static String replaceUnderlineAndfirstToUpper(String srcStr, String org, String ob) {
		String newString = "";
		int first = 0;
		while (srcStr.indexOf(org) != -1) {
			first = srcStr.indexOf(org);
			if (first != srcStr.length()) {
				newString = newString + srcStr.substring(0, first) + ob;
				srcStr = srcStr.substring(first + org.length(), srcStr.length());
				srcStr = firstCharacterToUpper(srcStr);
			}
		}
		newString = newString + srcStr;
		return newString;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(replaceUnderlineAndfirstToUpper("ni_hao_abc", "_", ""));
	}
}
