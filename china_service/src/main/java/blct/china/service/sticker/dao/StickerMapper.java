package blct.china.service.sticker.dao;

import java.util.List;

import blct.china.service.sticker.entity.Sticker;
import blct.china.service.sticker.entity.StickerExample;
import org.apache.ibatis.annotations.Param;

public interface StickerMapper {
    int countByExample(StickerExample example);

    int deleteByExample(StickerExample example);

    int deleteByPrimaryKey(Integer stickerid);

    int insert(Sticker record);

    int insertSelective(Sticker record);

    List<Sticker> selectByExample(StickerExample example);

    Sticker selectByPrimaryKey(Integer stickerid);

    int updateByExampleSelective(@Param("record") Sticker record, @Param("example") StickerExample example);

    int updateByExample(@Param("record") Sticker record, @Param("example") StickerExample example);

    int updateByPrimaryKeySelective(Sticker record);

    int updateByPrimaryKey(Sticker record);
}