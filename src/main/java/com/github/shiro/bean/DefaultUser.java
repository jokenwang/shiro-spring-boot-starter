/** * $Id: User.java,v 1.0 2018-12-15 12:52 chenmin Exp $ * <p> */package com.github.shiro.bean;import com.fasterxml.jackson.annotation.JsonProperty;import lombok.AllArgsConstructor;import lombok.Builder;import lombok.Data;import lombok.NoArgsConstructor;import java.io.Serializable;/** * @author chenmin * @version $Id: User.java,v 1.1 2018-12-15 12:52 chenmin Exp $ * Created on 2018-12-15 12:52 */@Data@Builder@NoArgsConstructor@AllArgsConstructorpublic class DefaultUser implements Serializable {    private static final long serialVersionUID = -4772889672158316621L;    /**     * 用户名     */    @JsonProperty(required = true)    private String userName;    /**     * 密码     */    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY, required = true)    private String password;}