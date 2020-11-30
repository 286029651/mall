package com.ralph.mall.mapper;

import com.ralph.mall.domain.PmsAlbumPic;
import com.ralph.mall.domain.PmsAlbumPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsAlbumPicMapper {
    long countByExample(PmsAlbumPicExample example);

    int deleteByExample(PmsAlbumPicExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbumPic record);

    int insertSelective(PmsAlbumPic record);

    List<PmsAlbumPic> selectByExample(PmsAlbumPicExample example);

    PmsAlbumPic selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsAlbumPic record, @Param("example") PmsAlbumPicExample example);

    int updateByExample(@Param("record") PmsAlbumPic record, @Param("example") PmsAlbumPicExample example);

    int updateByPrimaryKeySelective(PmsAlbumPic record);

    int updateByPrimaryKey(PmsAlbumPic record);
}