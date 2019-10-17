package com.zuovx.book.dao;

import com.zuovx.book.model.Friend;
import com.zuovx.book.model.FriendExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface FriendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbg.generated
     */
    long countByExample(FriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbg.generated
     */
    int deleteByExample(FriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbg.generated
     */
    int insert(Friend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbg.generated
     */
    int insertSelective(Friend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbg.generated
     */
    List<Friend> selectByExample(FriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbg.generated
     */
    Friend selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Friend record, @Param("example") FriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Friend record, @Param("example") FriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Friend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table friend
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Friend record);


    /**
     * 检查是否已经是好友
     * @param userId
     * @param friendUserId
     * @return
     */
    @Select("SELECT EXISTS(SELECT 1 FROM friend WHERE user_id = #{userId} and friend_user_id = #{friendUserId} and is_deleted = 0) ")
    boolean checkFriendExists(@Param("userId") Integer userId,@Param("friendUserId") Integer friendUserId);
}