package org.yangxin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yangxin.enums.YesNoEnum;
import org.yangxin.pojo.Carousel;
import org.yangxin.service.CarouselService;
import org.yangxin.utils.JSONResult;

import java.util.List;

/**
 * 主页
 *
 * @author yangxin
 * 2019/11/23 15:58
 */
@Api(value = "首页", tags = {"首页展示的相关接口"})
@RestController
@RequestMapping("/index")
public class IndexController {
    private final CarouselService carouselService;

    @Autowired
    public IndexController(CarouselService carouselService) {
        this.carouselService = carouselService;
    }

    /**
     * 获取全部轮播图记录
     */
    @ApiOperation(value = "获取首页轮播图列表", notes = "获取首页轮播图列表", httpMethod = "GET")
    @GetMapping("/carousel")
    public JSONResult carouse() {
        List<Carousel> carouselList = carouselService.queryAll(YesNoEnum.YES.getType());
        return JSONResult.ok(carouselList);
    }
}