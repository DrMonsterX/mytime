package com.sxd.server.mytime.Controller.UserController;

import com.sxd.server.mytime.Entity.Follow;
import com.sxd.server.mytime.Entity.User;
import com.sxd.server.mytime.Service.UserService.FollowService;
import com.sxd.server.mytime.Service.UserService.GetUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FollowController {
    @Autowired
    private FollowService followService;
    @Autowired
    private GetUserService getUserService;

    //获取当前id用户的所有关注人
    @RequestMapping(value = "getFollow",method = RequestMethod.GET)
    public List<User> getFollow(Integer userId){
        List<Follow> follow=null;
        try{
            follow=followService.getFollow(userId);
        }catch (Exception e){
            System.out.println(e);
        }
        List<User> userList=new ArrayList<>();
        if(follow==null){
            return null;
        }else{
            for (Follow nowFollow:follow) {
                User user=null;
                try {
                    user=getUserService.getUser(nowFollow.getFollowedId());
                }catch (Exception e){
                    System.out.println(e);
                }
                userList.add(user);
            }
        }
        return userList;
    }

    //通过自身id和目标id来关注用户
    @RequestMapping(value = "followUser",method = RequestMethod.GET)
    public int followUser(Integer myId,Integer targetId){
        Follow follow=new Follow();
        int result=-1;
        if(myId.equals(targetId)){
            return -2;
        }
        //校验myId用户是否不存在
        User myUser=null;
        try {
            myUser=getUserService.getUser(myId);
        }catch (Exception e){
            System.out.println(e);
        }
        if(myUser==null){
            return -3;
        }else{
            follow.setFollowingId(myId);
        }

        //校验targetId用户是否不存在
        User targetUser=null;
        try {
            targetUser=getUserService.getUser(targetId);
        }catch (Exception e){
            System.out.println(e);
        }
        if(targetUser==null){
            return -4;
        }else{
            follow.setFollowedId(targetId);
        }

        //添加关注
        try {
            result=followService.followUser(follow);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

    //使当前用户取消关注目标用户
    @RequestMapping(value = "deleteFollow",method = RequestMethod.GET)
    public int deleteFollow(Integer myId,Integer targetId){
        //检验当前用户id与目标用户id是否相同
        if(myId.equals(targetId)){
            return -2;
        }
        int result=-1;

        //校验myId用户是否不存在
        User myUser=null;
        try {
            myUser=getUserService.getUser(myId);
        }catch (Exception e){
            System.out.println(e);
        }
        if(myUser==null){
            return -3;
        }

        //校验targetId用户是否不存在
        User targetUser=null;
        try {
            targetUser=getUserService.getUser(targetId);
        }catch (Exception e){
            System.out.println(e);
        }
        if(targetUser==null){
            return -4;
        }

        try{
            result=followService.deleteFollow(myId,targetId);
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
