package com.suzl.mapper.mappers;

import com.suzl.mapper.entities.Employee;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Description:具体操作数据库的Mapper接口，需要继承通用Mapper提供的核心接口：Mapper<Employee> 泛型类型就是实体类的类型
 * @author: zhenglongsu@163.com
 * @date: 2018.05.03 14:13
 */
public interface EmployeeMapper extends Mapper<Employee> {

}
