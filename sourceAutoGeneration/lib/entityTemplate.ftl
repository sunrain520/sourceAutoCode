
import java.io.Serializable;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * ${className } 实体类
 * 
 * @author  	${user}
 * @since   	${.now}
 * @version 	v1.0
 */
public class ${className?cap_first} implements Serializable{

	//此处需要手动修改
	private static final long serialVersionUID = 1L;

	<#list columnMap  as column>
	// ${column.comment}
	private  ${column.type}  ${column.columnName};
	</#list>


	<#list columnMap as column>
	public ${column.type} get${column.columnName?cap_first}() {
		return ${column.columnName};
    }
    
	public void set${column.columnName?cap_first}(${column.type} ${column.columnName}) {
		this.${column.columnName} = ${column.columnName};
    }
        
	</#list>

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
}
