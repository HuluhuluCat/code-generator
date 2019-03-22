<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#include "/macro.include"/>
package ${basepackage}.mapper.${module};

import com.baomidou.mybatisplus.mapper.BaseMapper;
import ${basepackage}.entity.${module}.${className}Entity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version V1.0
 * @Description: ${table.remarks} Mapper
 * @Author ${author}
 * @Date ${now?date}
 */
@Mapper
public interface ${className}Mapper extends BaseMapper<${className}Entity>{


}