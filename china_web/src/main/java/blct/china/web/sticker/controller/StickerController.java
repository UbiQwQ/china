package blct.china.web.sticker.controller;

import blct.china.common.util.Result;
import blct.china.interfaces.sticker.service.StickerService;
import blct.china.interfaces.sticker.vo.StickerVo;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/sticker")
public class StickerController {

    @Reference(check = false)
    private StickerService stickerService;

    @GetMapping
    public String index(){
        return "sticker/index";
    }

    @GetMapping({"/init"})
    @ResponseBody
    public Result init() {
        List<StickerVo> stickerVos = stickerService.queryAll();
        List<String> messages = stickerVos.stream().map(StickerVo::getMessage).collect(Collectors.toList());
        return Result.buildSuccessResult(messages);
    }
}
