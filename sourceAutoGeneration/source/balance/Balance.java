
import java.io.Serializable;
import java.math.BigInteger;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * balance 实体类
 * 
 * @author  	xn071376
 * @since   	2017-7-26 1:09:51
 * @version 	v1.0
 */
public class Balance implements Serializable{

	//此处需要手动修改
	private static final long serialVersionUID = 1L;

	// 
	private  String  appid;
	// 
	private  Integer  moduleid;
	// 
	private  BigInteger  usecount;
	// 
	private  BigInteger  cachecount;
	// 
	private  Integer  useflag;
	// 
	private  String  modifytime;
	// 
	private  String  inserttime;


	
	public String getAppid() {
		return appid;
    }
    
	public void setAppid(String appid) {
		this.appid = appid;
    }
        
	
	public Integer getModuleid() {
		return moduleid;
    }
    
	public void setModuleid(Integer moduleid) {
		this.moduleid = moduleid;
    }
        
	
	public BigInteger getUsecount() {
		return usecount;
    }
    
	public void setUsecount(BigInteger usecount) {
		this.usecount = usecount;
    }
        
	
	public BigInteger getCachecount() {
		return cachecount;
    }
    
	public void setCachecount(BigInteger cachecount) {
		this.cachecount = cachecount;
    }
        
	
	public Integer getUseflag() {
		return useflag;
    }
    
	public void setUseflag(Integer useflag) {
		this.useflag = useflag;
    }
        
	
	public String getModifytime() {
		return modifytime;
    }
    
	public void setModifytime(String modifytime) {
		this.modifytime = modifytime;
    }
        
	
	public String getInserttime() {
		return inserttime;
    }
    
	public void setInserttime(String inserttime) {
		this.inserttime = inserttime;
    }
        

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
}
