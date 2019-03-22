<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#include "/macro.include"/>
package ${basepackage}.service.impl.${module};

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import ${basepackage}.entity.${module}.${className}Entity;
import ${basepackage}.mapper.${module}.${className}Mapper;
import ${basepackage}.service.intf.${module}.${className}Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


/**
 * @version V1.0
 * @Description: (${table.remarks} Service Impl)
 * @Author ${author}
 * @Date ${now?date}
 */
@Service
@Slf4j
public class ${className}ServiceImpl extends ServiceImpl<${className}Mapper, ${className}Entity> implements ${className}Service {

}
