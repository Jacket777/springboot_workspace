package com.itheima;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by 17081290 on 2021/4/30.
 */
@Controller
public class FileController {
    //影片详情页面
    @GetMapping("/detail/{type}/{path}")
    public String toDetail(@PathVariable("type")String type,@PathVariable("path")String path){
        return "detail/"+type+"/"+path;
    }
}
