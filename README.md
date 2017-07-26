# sourceAutoCode
java 代码成器  自动生成代码

模版路径位于lib文件夹下

需要导入lib下两个jar包

修改main函数中数据库有关配置即可

public class AutoGeneration {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, TemplateException {
		File file=new File("");
		String filePath = file.getAbsolutePath();
		
		// 数据库地址
		String url = "jdbc:mysql://127.0.0.1:3306/test_db";
		// 用户名
		String name = "root";
		// 密码
		String passWord = "123456";
		// 驱动
		String driver = "com.mysql.jdbc.Driver";
		// 表名
		String tableName = "test_table";
		// 模板路径
		String templateDir = filePath+"\\lib";
		// 生成文件路径
		String autoGeneratedFile = filePath+"\\source";
		// 实例化
		AutoGenerationJavaCode autoGenerationJavaCode = new AutoGenerationJavaCode(url, name, passWord, driver,
				tableName, autoGeneratedFile, templateDir);

		// 调用生成java代码方法
		autoGenerationJavaCode.autoGenerationJavaCode();
	}

}
