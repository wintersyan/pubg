// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\\match_subscribe.proto
package com.tencent.protocol.tga.matchsubscribe;

import com.squareup.tga.Message;
import com.squareup.tga.ProtoField;
import okiotga.ByteString;

import static com.squareup.tga.Message.Datatype.BYTES;
import static com.squareup.tga.Message.Datatype.STRING;
import static com.squareup.tga.Message.Datatype.UINT32;
import static com.squareup.tga.Message.Label.REQUIRED;

public final class MatchSubscribeReq extends Message {

  public static final ByteString DEFAULT_USER_ID = ByteString.EMPTY;
  public static final ByteString DEFAULT_MATCH_ID = ByteString.EMPTY;
  public static final Integer DEFAULT_OPERATION_TYPE = 0;
  public static final ByteString DEFAULT_GAME_ID = ByteString.EMPTY;
  public static final ByteString DEFAULT_USER_OPENID = ByteString.EMPTY;
  public static final Integer DEFAULT_ENTRY_TYPE = 0;
  public static final ByteString DEFAULT_JF_GAMEID = ByteString.EMPTY;
  public static final ByteString DEFAULT_PUSH_ID = ByteString.EMPTY;
  public static final Integer DEFAULT_NEED_CHECK_AWARD = 0;
  public static final String DEFAULT_CHECK_SUBSCRIBE_TEAMID = "";

  @ProtoField(tag = 1, type = BYTES, label = REQUIRED)
  public final ByteString user_id;

  /**
   * 订阅用户id
   */
  @ProtoField(tag = 2, type = BYTES, label = REQUIRED)
  public final ByteString match_id;

  /**
   * 订阅赛事id
   */
  @ProtoField(tag = 3, type = UINT32, label = REQUIRED)
  public final Integer operation_type;

  /**
   * 操作类型,参见SubscribeOperationType
   */
  @ProtoField(tag = 4, type = BYTES, label = REQUIRED)
  public final ByteString game_id;

  /**
   * 游戏id
   */
  @ProtoField(tag = 5, type = BYTES, label = REQUIRED)
  public final ByteString user_openid;

  /**
   * 用户openid
   */
  @ProtoField(tag = 6, type = UINT32)
  public final Integer entry_type;

  /**
   * 入口类型: 1-默认,即普通订阅,2-浮层订阅,3-竞猜H5
   */
  @ProtoField(tag = 7, type = BYTES)
  public final ByteString jf_gameid;

  /**
   * 经分gameid, 无逻辑,上报经分统计用, 和经分同事协定
   */
  @ProtoField(tag = 8, type = BYTES)
  public final ByteString push_id;

  /**
   * 上报push id
   */
  @ProtoField(tag = 9, type = UINT32)
  public final Integer need_check_award;

  /**
   * 王者专用， 检查是否需要奖励
   */
  @ProtoField(tag = 10, type = STRING)
  public final String check_subscribe_teamid;

  public MatchSubscribeReq(ByteString user_id, ByteString match_id, Integer operation_type, ByteString game_id, ByteString user_openid, Integer entry_type, ByteString jf_gameid, ByteString push_id, Integer need_check_award, String check_subscribe_teamid) {
    this.user_id = user_id;
    this.match_id = match_id;
    this.operation_type = operation_type;
    this.game_id = game_id;
    this.user_openid = user_openid;
    this.entry_type = entry_type;
    this.jf_gameid = jf_gameid;
    this.push_id = push_id;
    this.need_check_award = need_check_award;
    this.check_subscribe_teamid = check_subscribe_teamid;
  }

  private MatchSubscribeReq(Builder builder) {
    this(builder.user_id, builder.match_id, builder.operation_type, builder.game_id, builder.user_openid, builder.entry_type, builder.jf_gameid, builder.push_id, builder.need_check_award, builder.check_subscribe_teamid);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MatchSubscribeReq)) return false;
    MatchSubscribeReq o = (MatchSubscribeReq) other;
    return equals(user_id, o.user_id)
        && equals(match_id, o.match_id)
        && equals(operation_type, o.operation_type)
        && equals(game_id, o.game_id)
        && equals(user_openid, o.user_openid)
        && equals(entry_type, o.entry_type)
        && equals(jf_gameid, o.jf_gameid)
        && equals(push_id, o.push_id)
        && equals(need_check_award, o.need_check_award)
        && equals(check_subscribe_teamid, o.check_subscribe_teamid);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = user_id != null ? user_id.hashCode() : 0;
      result = result * 37 + (match_id != null ? match_id.hashCode() : 0);
      result = result * 37 + (operation_type != null ? operation_type.hashCode() : 0);
      result = result * 37 + (game_id != null ? game_id.hashCode() : 0);
      result = result * 37 + (user_openid != null ? user_openid.hashCode() : 0);
      result = result * 37 + (entry_type != null ? entry_type.hashCode() : 0);
      result = result * 37 + (jf_gameid != null ? jf_gameid.hashCode() : 0);
      result = result * 37 + (push_id != null ? push_id.hashCode() : 0);
      result = result * 37 + (need_check_award != null ? need_check_award.hashCode() : 0);
      result = result * 37 + (check_subscribe_teamid != null ? check_subscribe_teamid.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<MatchSubscribeReq> {

    public ByteString user_id;
    public ByteString match_id;
    public Integer operation_type;
    public ByteString game_id;
    public ByteString user_openid;
    public Integer entry_type;
    public ByteString jf_gameid;
    public ByteString push_id;
    public Integer need_check_award;
    public String check_subscribe_teamid;

    public Builder() {
    }

    public Builder(MatchSubscribeReq message) {
      super(message);
      if (message == null) return;
      this.user_id = message.user_id;
      this.match_id = message.match_id;
      this.operation_type = message.operation_type;
      this.game_id = message.game_id;
      this.user_openid = message.user_openid;
      this.entry_type = message.entry_type;
      this.jf_gameid = message.jf_gameid;
      this.push_id = message.push_id;
      this.need_check_award = message.need_check_award;
      this.check_subscribe_teamid = message.check_subscribe_teamid;
    }

    public Builder user_id(ByteString user_id) {
      this.user_id = user_id;
      return this;
    }

    /**
     * 订阅用户id
     */
    public Builder match_id(ByteString match_id) {
      this.match_id = match_id;
      return this;
    }

    /**
     * 订阅赛事id
     */
    public Builder operation_type(Integer operation_type) {
      this.operation_type = operation_type;
      return this;
    }

    /**
     * 操作类型,参见SubscribeOperationType
     */
    public Builder game_id(ByteString game_id) {
      this.game_id = game_id;
      return this;
    }

    /**
     * 游戏id
     */
    public Builder user_openid(ByteString user_openid) {
      this.user_openid = user_openid;
      return this;
    }

    /**
     * 用户openid
     */
    public Builder entry_type(Integer entry_type) {
      this.entry_type = entry_type;
      return this;
    }

    /**
     * 入口类型: 1-默认,即普通订阅,2-浮层订阅,3-竞猜H5
     */
    public Builder jf_gameid(ByteString jf_gameid) {
      this.jf_gameid = jf_gameid;
      return this;
    }

    /**
     * 经分gameid, 无逻辑,上报经分统计用, 和经分同事协定
     */
    public Builder push_id(ByteString push_id) {
      this.push_id = push_id;
      return this;
    }

    /**
     * 上报push id
     */
    public Builder need_check_award(Integer need_check_award) {
      this.need_check_award = need_check_award;
      return this;
    }

    /**
     * 王者专用， 检查是否需要奖励
     */
    public Builder check_subscribe_teamid(String check_subscribe_teamid) {
      this.check_subscribe_teamid = check_subscribe_teamid;
      return this;
    }

    @Override
    public MatchSubscribeReq build() {
      checkRequiredFields();
      return new MatchSubscribeReq(this);
    }
  }
}