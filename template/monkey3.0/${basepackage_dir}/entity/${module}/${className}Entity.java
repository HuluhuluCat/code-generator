<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
<#include "/macro.include"/>
package ${basepackage}.entity.${module};

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * @version V1.0
 * @Description: ${table.remarks}
 * @Author ${author}
 * @Date ${now?date}
 */
@Data
@TableName("${table.sqlName}")
public class ${className}Entity  implements Serializable {

	<#list table.columns as column>
	/**
	 * ${column.remarks}
	 */
	<#if column.pk >
	@TableId(value="${column.sqlName}", type= IdType.AUTO)
	<#else>
	@TableField("${column.sqlName}")
	</#if>
	private ${column.simpleJavaType} ${column.columnNameLower};
	</#list>
	
}
