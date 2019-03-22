<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#include "/macro.include"/>
package ${basepackage}.intf.${module};

import com.baomidou.mybatisplus.service.IService;
import ${basepackage}.model.${module}.${className};

import java.util.List;

/**
 * @version V1.0
 * @Description: (${table.remarks} Service)
 * @Author ${author}
 * @Date ${now?date}
 */
public interface ${className}Service extends IService<${className}> {

}
