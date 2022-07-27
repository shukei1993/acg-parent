package com.hoki.zj.acg.controller;

import com.hoki.zj.acg.properties.EurekaProperty;
import com.hoki.zj.acg.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/property")
public class PropertyTest {

    @Autowired
    private EurekaProperty property;

    /**
     * githubに置いて、本プロジェクトのsettingでweb　hook（NAT越えを使う）を設定する
     * @return AjaxResult
     */
    @GetMapping
    public AjaxResult getPropertyTest() {
        return new AjaxResult().setResultObj(property);
    }
}
