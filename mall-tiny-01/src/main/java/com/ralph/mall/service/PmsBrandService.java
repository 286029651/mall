package com.ralph.mall.service;

import java.util.List;

import com.ralph.mall.domain.PmsBrand;

/**
 * @author Ralph.Chen
 * @date 2020/11/26
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
