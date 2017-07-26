
import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * phriskMgmtResult 实体类
 * 
 * @author  	xn071376
 * @since   	2017-7-25 23:43:44
 * @version 	v1.0
 */
public class PhriskMgmtResult implements Serializable{

	//此处需要手动修改
	private static final long serialVersionUID = 1L;

	// 自增主键id
	private  Integer  mgmtResultId;
	// 普惠申请的进件id
	private  String  applyId;
	// 接口类型：1.存储过程返回 2.准入模型返回 3.授信模型返回
	private  Integer  type;
	// A或B
	private  String  solution;
	// 评分卡得分
	private  BigDecimal  score;
	// 额度
	private  BigDecimal  quota;
	// 等级,由低到高；1：极低风险	2：低风险	3：中等风险	4：高风险	5：极高风险
	private  Integer  grade;
	// 结果状态: 0：失败；1：成功
	private  Integer  resultStatus;
	// 结果备注信息
	private  String  remark;
	// 创建时间
	private  Date  createTime;
	// 更新时间
	private  Date  updateTime;


	
	public Integer getMgmtResultId() {
		return mgmtResultId;
    }
    
	public void setMgmtResultId(Integer mgmtResultId) {
		this.mgmtResultId = mgmtResultId;
    }
        
	
	public String getApplyId() {
		return applyId;
    }
    
	public void setApplyId(String applyId) {
		this.applyId = applyId;
    }
        
	
	public Integer getType() {
		return type;
    }
    
	public void setType(Integer type) {
		this.type = type;
    }
        
	
	public String getSolution() {
		return solution;
    }
    
	public void setSolution(String solution) {
		this.solution = solution;
    }
        
	
	public BigDecimal getScore() {
		return score;
    }
    
	public void setScore(BigDecimal score) {
		this.score = score;
    }
        
	
	public BigDecimal getQuota() {
		return quota;
    }
    
	public void setQuota(BigDecimal quota) {
		this.quota = quota;
    }
        
	
	public Integer getGrade() {
		return grade;
    }
    
	public void setGrade(Integer grade) {
		this.grade = grade;
    }
        
	
	public Integer getResultStatus() {
		return resultStatus;
    }
    
	public void setResultStatus(Integer resultStatus) {
		this.resultStatus = resultStatus;
    }
        
	
	public String getRemark() {
		return remark;
    }
    
	public void setRemark(String remark) {
		this.remark = remark;
    }
        
	
	public Date getCreateTime() {
		return createTime;
    }
    
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
    }
        
	
	public Date getUpdateTime() {
		return updateTime;
    }
    
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
    }
        

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
}
