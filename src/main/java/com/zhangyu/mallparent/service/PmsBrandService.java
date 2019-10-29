package com.zhangyu.mallparent.service;

import com.zhangyu.mallparent.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author zhangyu
 * @description
 * @date 2019/9/25
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
