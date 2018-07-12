package blct.china.service.sticker.service;

import blct.china.common.util.ModelUtil;
import blct.china.interfaces.sticker.service.StickerService;
import blct.china.interfaces.sticker.vo.StickerVo;
import blct.china.service.sticker.dao.StickerMapper;
import blct.china.service.sticker.entity.Sticker;
import blct.china.service.sticker.entity.StickerExample;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(interfaceClass = StickerService.class)
@Component
public class StickerServiceImpl implements StickerService {

    @Autowired
    private StickerMapper stickerMapper;

    @Override
    public List<StickerVo> queryAll() {
        StickerExample stickerExample = new StickerExample();
        stickerExample.createCriteria().andValidEqualTo(1);
        List<Sticker> stickers = stickerMapper.selectByExample(stickerExample);
        return ModelUtil.modelToDto(stickers, StickerVo.class);
    }
}
