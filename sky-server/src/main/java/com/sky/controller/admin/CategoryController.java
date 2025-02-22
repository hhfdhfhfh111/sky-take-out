package com.sky.controller.admin;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Api(tags = "分相关接口")
@RequestMapping(" /admin/category")
public class CategoryController {


    @GetMapping("/page")
    @ApiOperation("分页查询")
    Public Result<PageResult> page(){

    }
}
