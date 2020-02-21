// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\\match_subscribe.proto
package com.tencent.protocol.tga.matchsubscribe;

import com.squareup.tga.Message;
import com.squareup.tga.ProtoField;
import okiotga.ByteString;

import static com.squareup.tga.Message.Datatype.BYTES;
import static com.squareup.tga.Message.Datatype.INT32;
import static com.squareup.tga.Message.Datatype.STRING;
import static com.squareup.tga.Message.Datatype.UINT32;
import static com.squareup.tga.Message.Label.REQUIRED;

public final class MatchSubscribeRsp extends Message {

  public static final Integer DEFAULT_RESULT = 0;
  public static final Integer DEFAULT_HAS_AWARD = 0;
  public static final ByteString DEFAULT_WORDING = ByteString.EMPTY;
  public static final ByteString DEFAULT_URL = ByteString.EMPTY;
  public static final String DEFAULT_CHECK_SUBSCRIBE_TEAMID = "";
  public static final Integer DEFAULT_IS_TEAM_SUBSCRIBE = 0;
  public static final ByteString DEFAULT_MATCH_MAIN_TITLE = ByteString.EMPTY;
  public static final ByteString DEFAULT_MATCH_SUB_TITLE = ByteString.EMPTY;
  public static final Integer DEFAULT_CHECK_TEAMID_CAN_SUBSCRIBE = 0;

  @ProtoField(tag = 1, type = UINT32, label = REQUIRED)
  public final Integer result;

  @ProtoField(tag = 2, type = INT32)
  public final Integer has_award;

  /**
   * 此次订阅是否有奖励
   */
  @ProtoField(tag = 3, type = BYTES)
  public final ByteString wording;

  /**
   * 奖励提示文案
   */
  @ProtoField(tag = 4, type = BYTES)
  public final ByteString url;

  /**
   * 奖励提示图
   */
  @ProtoField(tag = 5, type = STRING)
  public final String check_subscribe_teamid;

  /**
   * 王者专用, 检查是否订阅过该战队
   */
  @ProtoField(tag = 6, type = UINT32)
  public final Integer is_team_subscribe;

  /**
   * 0 否 1 是
   */
  @ProtoField(tag = 7, type = BYTES)
  public final ByteString match_main_title;

  /**
   * 主标题
   */
  @ProtoField(tag = 8, type = BYTES)
  public final ByteString match_sub_title;

  /**
   * 副标题
   */
  @ProtoField(tag = 9, type = UINT32)
  public final Integer check_teamid_can_subscribe;

  public MatchSubscribeRsp(Integer result, Integer has_award, ByteString wording, ByteString url, String check_subscribe_teamid, Integer is_team_subscribe, ByteString match_main_title, ByteString match_sub_title, Integer check_teamid_can_subscribe) {
    this.result = result;
    this.has_award = has_award;
    this.wording = wording;
    this.url = url;
    this.check_subscribe_teamid = check_subscribe_teamid;
    this.is_team_subscribe = is_team_subscribe;
    this.match_main_title = match_main_title;
    this.match_sub_title = match_sub_title;
    this.check_teamid_can_subscribe = check_teamid_can_subscribe;
  }

  private MatchSubscribeRsp(Builder builder) {
    this(builder.result, builder.has_award, builder.wording, builder.url, builder.check_subscribe_teamid, builder.is_team_subscribe, builder.match_main_title, builder.match_sub_title, builder.check_teamid_can_subscribe);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MatchSubscribeRsp)) return false;
    MatchSubscribeRsp o = (MatchSubscribeRsp) other;
    return equals(result, o.result)
        && equals(has_award, o.has_award)
        && equals(wording, o.wording)
        && equals(url, o.url)
        && equals(check_subscribe_teamid, o.check_subscribe_teamid)
        && equals(is_team_subscribe, o.is_team_subscribe)
        && equals(match_main_title, o.match_main_title)
        && equals(match_sub_title, o.match_sub_title)
        && equals(check_teamid_can_subscribe, o.check_teamid_can_subscribe);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = this.result != null ? this.result.hashCode() : 0;
      result = result * 37 + (has_award != null ? has_award.hashCode() : 0);
      result = result * 37 + (wording != null ? wording.hashCode() : 0);
      result = result * 37 + (url != null ? url.hashCode() : 0);
      result = result * 37 + (check_subscribe_teamid != null ? check_subscribe_teamid.hashCode() : 0);
      result = result * 37 + (is_team_subscribe != null ? is_team_subscribe.hashCode() : 0);
      result = result * 37 + (match_main_title != null ? match_main_title.hashCode() : 0);
      result = result * 37 + (match_sub_title != null ? match_sub_title.hashCode() : 0);
      result = result * 37 + (check_teamid_can_subscribe != null ? check_teamid_can_subscribe.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<MatchSubscribeRsp> {

    public Integer result;
    public Integer has_award;
    public ByteString wording;
    public ByteString url;
    public String check_subscribe_teamid;
    public Integer is_team_subscribe;
    public ByteString match_main_title;
    public ByteString match_sub_title;
    public Integer check_teamid_can_subscribe;

    public Builder() {
    }

    public Builder(MatchSubscribeRsp message) {
      super(message);
      if (message == null) return;
      this.result = message.result;
      this.has_award = message.has_award;
      this.wording = message.wording;
      this.url = message.url;
      this.check_subscribe_teamid = message.check_subscribe_teamid;
      this.is_team_subscribe = message.is_team_subscribe;
      this.match_main_title = message.match_main_title;
      this.match_sub_title = message.match_sub_title;
      this.check_teamid_can_subscribe = message.check_teamid_can_subscribe;
    }

    public Builder result(Integer result) {
      this.result = result;
      return this;
    }

    public Builder has_award(Integer has_award) {
      this.has_award = has_award;
      return this;
    }

    /**
     * 此次订阅是否有奖励
     */
    public Builder wording(ByteString wording) {
      this.wording = wording;
      return this;
    }

    /**
     * 奖励提示文案
     */
    public Builder url(ByteString url) {
      this.url = url;
      return this;
    }

    /**
     * 奖励提示图
     */
    public Builder check_subscribe_teamid(String check_subscribe_teamid) {
      this.check_subscribe_teamid = check_subscribe_teamid;
      return this;
    }

    /**
     * 王者专用, 检查是否订阅过该战队
     */
    public Builder is_team_subscribe(Integer is_team_subscribe) {
      this.is_team_subscribe = is_team_subscribe;
      return this;
    }

    /**
     * 0 否 1 是
     */
    public Builder match_main_title(ByteString match_main_title) {
      this.match_main_title = match_main_title;
      return this;
    }

    /**
     * 主标题
     */
    public Builder match_sub_title(ByteString match_sub_title) {
      this.match_sub_title = match_sub_title;
      return this;
    }

    /**
     * 副标题
     */
    public Builder check_teamid_can_subscribe(Integer check_teamid_can_subscribe) {
      this.check_teamid_can_subscribe = check_teamid_can_subscribe;
      return this;
    }

    @Override
    public MatchSubscribeRsp build() {
      checkRequiredFields();
      return new MatchSubscribeRsp(this);
    }
  }
}
