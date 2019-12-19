package com.damu.xiaomi.dao;

import com.damu.xiaomi.entry.GoodsConfigure;
import com.damu.xiaomi.entry.GoodsConfigureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsConfigureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_configure
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    long countByExample(GoodsConfigureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_configure
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int deleteByExample(GoodsConfigureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_configure
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_configure
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int insert(GoodsConfigure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_configure
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int insertSelective(GoodsConfigure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_configure
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    List<GoodsConfigure> selectByExample(GoodsConfigureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_configure
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    GoodsConfigure selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_configure
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByExampleSelective(@Param("record") GoodsConfigure record, @Param("example") GoodsConfigureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_configure
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByExample(@Param("record") GoodsConfigure record, @Param("example") GoodsConfigureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_configure
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByPrimaryKeySelective(GoodsConfigure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_configure
     *
     * @mbg.generated Tue Dec 10 19:17:22 CST 2019
     */
    int updateByPrimaryKey(GoodsConfigure record);
}