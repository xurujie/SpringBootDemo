package com.shangxue.demo05.controller;

import com.shangxue.demo05.dao.DepartmentDao;
import com.shangxue.demo05.dao.EmployeeDao;
import com.shangxue.demo05.entities.Department;
import com.shangxue.demo05.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    //查询所有员工返回列表页面
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> all = employeeDao.getAll();
        model.addAttribute("emps",all);
        return "emp/list";
    }


    //添加员工页面
    @GetMapping("/emp")
    public String add(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }
}
