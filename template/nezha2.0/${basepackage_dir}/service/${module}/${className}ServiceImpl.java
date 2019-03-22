<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#include "/macro.include"/>
package ${basepackage}.service.${module};

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${basepackage}.intf.${module}.${className}Service;
import ${basepackage}.mapper.${module}.${className}Mapper;
import ${basepackage}.model.${module}.${className};


/**
 * @version V1.0
 * @Description: (${table.remarks} Service Impl)
 * @Author ${author}
 * @Date ${now?date}
 */
@Service
public class ${className}ServiceImpl extends ServiceImpl<${className}Mapper, ${className}> implements ${className}Service {

}
