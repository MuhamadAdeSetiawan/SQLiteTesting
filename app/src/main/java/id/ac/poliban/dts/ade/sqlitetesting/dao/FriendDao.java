package id.ac.poliban.dts.ade.sqlitetesting.dao;

import java.util.List;

import id.ac.poliban.dts.ade.sqlitetesting.domain.Friend;

public interface FriendDao {
    void insert(Friend f);
    void update(Friend f);
    void delete(int id);
    Friend getAFriendById(int id);
    List<Friend> getAllFriends();
}
