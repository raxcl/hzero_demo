package org.hand.training.domain.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotBlank;

import io.choerodon.mybatis.domain.AuditDomain;
        import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 
 *
 * @author chen.long08@hand-china.com 2021-07-28 15:14:35
 */
@ApiModel("")
@VersionAudit
@ModifyAudit
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Table(name = "hand_iam_user")
public class IamUser extends AuditDomain{

        public static final String FIELD_ID ="id";
            public static final String FIELD_LOGIN_NAME ="loginName";
            public static final String FIELD_EMAIL ="email";
            public static final String FIELD_ORGANIZATION_ID ="organizationId";
            public static final String FIELD_HASH_PASSWORD ="hashPassword";
            public static final String FIELD_REAL_NAME ="realName";
            public static final String FIELD_PHONE ="phone";
            public static final String FIELD_INTERNATIONAL_TEL_CODE ="internationalTelCode";
            public static final String FIELD_IMAGE_URL ="imageUrl";
            public static final String FIELD_PROFILE_PHOTO ="profilePhoto";
            public static final String FIELD_LANGUAGE ="language";
            public static final String FIELD_TIME_ZONE ="timeZone";
            public static final String FIELD_LAST_PASSWORD_UPDATED_AT ="lastPasswordUpdatedAt";
            public static final String FIELD_LAST_LOGIN_AT ="lastLoginAt";
            public static final String FIELD_IS_ENABLED ="isEnabled";
            public static final String FIELD_IS_LOCKED ="isLocked";
            public static final String FIELD_IS_LDAP ="isLdap";
            public static final String FIELD_IS_ADMIN ="isAdmin";
            public static final String FIELD_LOCKED_UNTIL_AT ="lockedUntilAt";
            public static final String FIELD_PASSWORD_ATTEMPT ="passwordAttempt";
                                public static final String FIELD_USER_TYPE ="userType";
            public static final String FIELD_ATTRIBUTE1 ="attribute1";
            public static final String FIELD_ATTRIBUTE2 ="attribute2";
            public static final String FIELD_ATTRIBUTE3 ="attribute3";
            public static final String FIELD_ATTRIBUTE4 ="attribute4";
            public static final String FIELD_ATTRIBUTE5 ="attribute5";
            public static final String FIELD_ATTRIBUTE6 ="attribute6";
            public static final String FIELD_ATTRIBUTE7 ="attribute7";
            public static final String FIELD_ATTRIBUTE8 ="attribute8";
            public static final String FIELD_ATTRIBUTE9 ="attribute9";
            public static final String FIELD_ATTRIBUTE10 ="attribute10";
            public static final String FIELD_ATTRIBUTE11 ="attribute11";
            public static final String FIELD_ATTRIBUTE12 ="attribute12";
            public static final String FIELD_ATTRIBUTE13 ="attribute13";
            public static final String FIELD_ATTRIBUTE14 ="attribute14";
            public static final String FIELD_ATTRIBUTE15 ="attribute15";
    
//
// 业务方法(按public protected private顺序排列)
// ------------------------------------------------------------------------------

//
// 数据库字段
// ------------------------------------------------------------------------------


                    @ApiModelProperty("")
        @Id
        @GeneratedValue
            private Long id;
                                        @ApiModelProperty(value = "用户名", required = true)
                                @NotBlank
                                        private String loginName;
                                        @ApiModelProperty(value = "")
                        private String email;
                                        @ApiModelProperty(value = "组织ID", required = true)
                                @NotNull
                                        private Long organizationId;
                                        @ApiModelProperty(value = "Hash后的用户密码")
                        private String hashPassword;
                                        @ApiModelProperty(value = "用户真实姓名")
                        private String realName;
                                        @ApiModelProperty(value = "手机号")
                        private String phone;
                                        @ApiModelProperty(value = "国际电话区号。")
                        private String internationalTelCode;
                                        @ApiModelProperty(value = "用户头像地址")
                        private String imageUrl;
                                        @ApiModelProperty(value = "用户二进制头像")
                        private String profilePhoto;
                                        @ApiModelProperty(value = "")
                        private String language;
                                        @ApiModelProperty(value = "时区", required = true)
                                @NotBlank
                                        private String timeZone;
                                        @ApiModelProperty(value = "上一次密码更新时间", required = true)
                                @NotNull
                                        private Date lastPasswordUpdatedAt;
                                        @ApiModelProperty(value = "上一次登陆时间")
                        private Date lastLoginAt;
                                        @ApiModelProperty(value = "用户是否启用。1启用，0未启用", required = true)
                                @NotNull
                                        private Integer isEnabled;
                                        @ApiModelProperty(value = "是否锁定账户", required = true)
                                @NotNull
                                        private Integer isLocked;
                                        @ApiModelProperty(value = "是否是LDAP来源。1是，0不是")
                        private Integer isLdap;
                                        @ApiModelProperty(value = "是否为管理员用户。1表示是，0表示不是")
                        private Integer isAdmin;
                                        @ApiModelProperty(value = "锁定账户截止时间")
                        private Date lockedUntilAt;
                                        @ApiModelProperty(value = "密码输错累积次数")
                        private Integer passwordAttempt;
                                                            @ApiModelProperty(value = "用户类型(P/C)，平台用户/C端用户，默认P", required = true)
                                @NotBlank
                                        private String userType;
                                        @ApiModelProperty(value = "")
                        private String attribute1;
                                        @ApiModelProperty(value = "")
                        private String attribute2;
                                        @ApiModelProperty(value = "")
                        private String attribute3;
                                        @ApiModelProperty(value = "")
                        private String attribute4;
                                        @ApiModelProperty(value = "")
                        private String attribute5;
                                        @ApiModelProperty(value = "")
                        private String attribute6;
                                        @ApiModelProperty(value = "")
                        private String attribute7;
                                        @ApiModelProperty(value = "")
                        private String attribute8;
                                        @ApiModelProperty(value = "")
                        private String attribute9;
                                        @ApiModelProperty(value = "")
                        private String attribute10;
                                        @ApiModelProperty(value = "")
                        private String attribute11;
                                        @ApiModelProperty(value = "")
                        private String attribute12;
                                        @ApiModelProperty(value = "")
                        private String attribute13;
                                        @ApiModelProperty(value = "")
                        private String attribute14;
                                        @ApiModelProperty(value = "")
                        private String attribute15;
    
//
// 非数据库字段
// ------------------------------------------------------------------------------

//
// getter/setter
// ------------------------------------------------------------------------------

        /**
     * @return 
     */
    public Long getId(){
            return id;
            }

    public IamUser setId(Long id) {
            this.id = id;
            return this;
            }
            /**
     * @return 用户名
     */
    public String getLoginName(){
            return loginName;
            }

    public IamUser setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
            }
            /**
     * @return 
     */
    public String getEmail(){
            return email;
            }

    public IamUser setEmail(String email) {
            this.email = email;
            return this;
            }
            /**
     * @return 组织ID
     */
    public Long getOrganizationId(){
            return organizationId;
            }

    public IamUser setOrganizationId(Long organizationId) {
            this.organizationId = organizationId;
            return this;
            }
            /**
     * @return Hash后的用户密码
     */
    public String getHashPassword(){
            return hashPassword;
            }

    public IamUser setHashPassword(String hashPassword) {
            this.hashPassword = hashPassword;
            return this;
            }
            /**
     * @return 用户真实姓名
     */
    public String getRealName(){
            return realName;
            }

    public IamUser setRealName(String realName) {
            this.realName = realName;
            return this;
            }
            /**
     * @return 手机号
     */
    public String getPhone(){
            return phone;
            }

    public IamUser setPhone(String phone) {
            this.phone = phone;
            return this;
            }
            /**
     * @return 国际电话区号。
     */
    public String getInternationalTelCode(){
            return internationalTelCode;
            }

    public IamUser setInternationalTelCode(String internationalTelCode) {
            this.internationalTelCode = internationalTelCode;
            return this;
            }
            /**
     * @return 用户头像地址
     */
    public String getImageUrl(){
            return imageUrl;
            }

    public IamUser setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
            }
            /**
     * @return 用户二进制头像
     */
    public String getProfilePhoto(){
            return profilePhoto;
            }

    public IamUser setProfilePhoto(String profilePhoto) {
            this.profilePhoto = profilePhoto;
            return this;
            }
            /**
     * @return 
     */
    public String getLanguage(){
            return language;
            }

    public IamUser setLanguage(String language) {
            this.language = language;
            return this;
            }
            /**
     * @return 时区
     */
    public String getTimeZone(){
            return timeZone;
            }

    public IamUser setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
            }
            /**
     * @return 上一次密码更新时间
     */
    public Date getLastPasswordUpdatedAt(){
            return lastPasswordUpdatedAt;
            }

    public IamUser setLastPasswordUpdatedAt(Date lastPasswordUpdatedAt) {
            this.lastPasswordUpdatedAt = lastPasswordUpdatedAt;
            return this;
            }
            /**
     * @return 上一次登陆时间
     */
    public Date getLastLoginAt(){
            return lastLoginAt;
            }

    public IamUser setLastLoginAt(Date lastLoginAt) {
            this.lastLoginAt = lastLoginAt;
            return this;
            }
            /**
     * @return 用户是否启用。1启用，0未启用
     */
    public Integer getIsEnabled(){
            return isEnabled;
            }

    public IamUser setIsEnabled(Integer isEnabled) {
            this.isEnabled = isEnabled;
            return this;
            }
            /**
     * @return 是否锁定账户
     */
    public Integer getIsLocked(){
            return isLocked;
            }

    public IamUser setIsLocked(Integer isLocked) {
            this.isLocked = isLocked;
            return this;
            }
            /**
     * @return 是否是LDAP来源。1是，0不是
     */
    public Integer getIsLdap(){
            return isLdap;
            }

    public IamUser setIsLdap(Integer isLdap) {
            this.isLdap = isLdap;
            return this;
            }
            /**
     * @return 是否为管理员用户。1表示是，0表示不是
     */
    public Integer getIsAdmin(){
            return isAdmin;
            }

    public IamUser setIsAdmin(Integer isAdmin) {
            this.isAdmin = isAdmin;
            return this;
            }
            /**
     * @return 锁定账户截止时间
     */
    public Date getLockedUntilAt(){
            return lockedUntilAt;
            }

    public IamUser setLockedUntilAt(Date lockedUntilAt) {
            this.lockedUntilAt = lockedUntilAt;
            return this;
            }
            /**
     * @return 密码输错累积次数
     */
    public Integer getPasswordAttempt(){
            return passwordAttempt;
            }

    public IamUser setPasswordAttempt(Integer passwordAttempt) {
            this.passwordAttempt = passwordAttempt;
            return this;
            }
                                /**
     * @return 用户类型(P/C)，平台用户/C端用户，默认P
     */
    public String getUserType(){
            return userType;
            }

    public IamUser setUserType(String userType) {
            this.userType = userType;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute1(){
            return attribute1;
            }

    public IamUser setAttribute1(String attribute1) {
            this.attribute1 = attribute1;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute2(){
            return attribute2;
            }

    public IamUser setAttribute2(String attribute2) {
            this.attribute2 = attribute2;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute3(){
            return attribute3;
            }

    public IamUser setAttribute3(String attribute3) {
            this.attribute3 = attribute3;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute4(){
            return attribute4;
            }

    public IamUser setAttribute4(String attribute4) {
            this.attribute4 = attribute4;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute5(){
            return attribute5;
            }

    public IamUser setAttribute5(String attribute5) {
            this.attribute5 = attribute5;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute6(){
            return attribute6;
            }

    public IamUser setAttribute6(String attribute6) {
            this.attribute6 = attribute6;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute7(){
            return attribute7;
            }

    public IamUser setAttribute7(String attribute7) {
            this.attribute7 = attribute7;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute8(){
            return attribute8;
            }

    public IamUser setAttribute8(String attribute8) {
            this.attribute8 = attribute8;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute9(){
            return attribute9;
            }

    public IamUser setAttribute9(String attribute9) {
            this.attribute9 = attribute9;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute10(){
            return attribute10;
            }

    public IamUser setAttribute10(String attribute10) {
            this.attribute10 = attribute10;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute11(){
            return attribute11;
            }

    public IamUser setAttribute11(String attribute11) {
            this.attribute11 = attribute11;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute12(){
            return attribute12;
            }

    public IamUser setAttribute12(String attribute12) {
            this.attribute12 = attribute12;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute13(){
            return attribute13;
            }

    public IamUser setAttribute13(String attribute13) {
            this.attribute13 = attribute13;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute14(){
            return attribute14;
            }

    public IamUser setAttribute14(String attribute14) {
            this.attribute14 = attribute14;
            return this;
            }
            /**
     * @return 
     */
    public String getAttribute15(){
            return attribute15;
            }

    public IamUser setAttribute15(String attribute15) {
            this.attribute15 = attribute15;
            return this;
            }
            }
