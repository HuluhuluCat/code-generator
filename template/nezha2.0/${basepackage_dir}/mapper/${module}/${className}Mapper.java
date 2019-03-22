<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#include "/macro.include"/>
package ${basepackage}.mapper.${module};

import com.baomidou.mybatisplus.mapper.BaseMapper;
import ${basepackage}.model.${module}.${className};
import org.springframework.stereotype.Repository;

/**
 * @version V1.0
 * @Description: ${table.remarks} Mapper
 * @Author ${author}
 * @Date ${now?date}
 */
@Repository
public interface ${className}Mapper extends BaseMapper<${className}>{


}