package com.zuovx.book.dao;

import com.zuovx.book.model.Desire;
import com.zuovx.book.model.DesireExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface DesireMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table desire
     *
     * @mbg.generated
     */
    long countByExample(DesireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table desire
     *
     * @mbg.generated
     */
    int deleteByExample(DesireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table desire
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer desireId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table desire
     *
     * @mbg.generated
     */
    int insert(Desire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table desire
     *
     * @mbg.generated
     */
    int insertSelective(Desire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table desire
     *
     * @mbg.generated
     */
    List<Desire> selectByExample(DesireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table desire
     *
     * @mbg.generated
     */
    Desire selectByPrimaryKey(Integer desireId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table desire
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Desire record, @Param("example") DesireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table desire
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Desire record, @Param("example") DesireExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table desire
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Desire record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table desire
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Desire record);
}