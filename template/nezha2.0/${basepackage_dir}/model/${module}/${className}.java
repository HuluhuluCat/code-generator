<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
<#include "/macro.include"/>
package ${basepackage}.model.${module};

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * @version V1.0
 * @Description: ${table.remarks}
 * @Author ${author}
 * @Date ${now?date}
 */
@TableName("${table.sqlName}")
public class ${className}  implements Serializable {
	
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

<#list table.columns as column>
	<@genGetterAndSetter propertyName="${column.columnNameLower}" javaType="${column.simpleJavaType}" />
</#list>
	
}
