package com.kikoroc.kit.controller.global;

import com.kikoroc.kit.Const;
import com.kikoroc.kit.dto.HttpRet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project : kit
 * Package : com.kikoroc.kit.controller.global
 * Date : 11/20/14 5:11 PM
 * Author : wangpeng(http://iampeng.wang/)
 * kikoroc@gmail.com
 * https://github.com/kikoroc
 */
//@RestController
@Controller
public class GlobalController {

    @RequestMapping("/")
    public @ResponseBody HttpRet welcome(){
        return new HttpRet(Const.RetCode.OK,"welcome to kit.");
    }

}
