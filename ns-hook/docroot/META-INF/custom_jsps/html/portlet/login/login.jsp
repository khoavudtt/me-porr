<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@page pageEncoding="UTF-8" %>

<%@ include file="/html/portlet/login/init.jsp" %>

<c:choose>
	<c:when test="<%= themeDisplay.isSignedIn() %>">

		<%
		String signedInAs = HtmlUtil.escape(user.getFullName());

		if (themeDisplay.isShowMyAccountIcon() && (themeDisplay.getURLMyAccount() != null)) {
			String myAccountURL = String.valueOf(themeDisplay.getURLMyAccount());

			if (PropsValues.DOCKBAR_ADMINISTRATIVE_LINKS_SHOW_IN_POP_UP) {
				signedInAs = "<a href=\"javascript:Liferay.Util.openWindow({dialog: {destroyOnHide: true}, title: '" + LanguageUtil.get(pageContext, "my-account") + "', uri: '" + HtmlUtil.escape(myAccountURL) + "'});\">" + signedInAs + "</a>";
			}
			else {
				myAccountURL = HttpUtil.setParameter(myAccountURL, "controlPanelCategory", PortletCategoryKeys.MY);

				signedInAs = "<a href=\"" + HtmlUtil.escape(myAccountURL) + "\">" + signedInAs + "</a>";
			}
		}
		%>
	<div id="bghome-1">

		<section id="wrapper_login">
			<div class="log_in">
				<img src='<%= themeDisplay.getPathThemeImages() + "/only-logo.png" %>'>
				
				<h2>Chương trình nước sạch <br>và  vệ sinh nông thôn dựa trên kết quả (P<span style="text-transform: lowercase;">for</span>R)</h2>
				
				<aui:form action=""  cssClass="sign-in-form" method="post" name="fm">
						<div class="login">
							<div class="form-1">
								<div class="user">
										<%= signedInAs %>
								</div>
								
								<div>
									<div class="but">
										<a href="/group/guest">Truy cập hệ thống</a>
									</div> 
									<div>
										<a href="/c/portal/logout">Đăng xuất</a>
									</div>
								</div>
								
							</div>
							
						</div>

				</aui:form>
			
			</div>
		</section>
		
		<footer class="diachi">
			<p>TRUNG TÂM QUỐC GIA NƯỚC SẠCH VÀ VỆ SINH MÔI TRƯỜNG NÔNG THÔN
			<br>73 Nguyên Hồng, Đống Đa, Hà Nội
			<br><a href="http://dtt.vn"><img src='<%= themeDisplay.getPathThemeImages() + "/logo_footer.png" %>'></a></p>
		</footer>
	</div>

	</c:when>
	
	<c:otherwise>
		<%
			String redirect = ParamUtil.getString(request, "redirect");
	
			String login = LoginUtil.getLogin(request, "login", company);
			String password = StringPool.BLANK;
			boolean rememberMe = ParamUtil.getBoolean(request, "rememberMe");
	
			if (Validator.isNull(authType)) {
				authType = company.getAuthType();
			}
		%>
		
		<portlet:actionURL secure="<%= PropsValues.COMPANY_SECURITY_AUTH_REQUIRES_HTTPS || request.isSecure() %>" var="loginURL">
			<portlet:param name="struts_action" value="/login/login" />
		</portlet:actionURL>
		
	<div id="bghome-1">

		<section id="wrapper_login">
			<div class="log_in">
				<img src='<%= themeDisplay.getPathThemeImages() + "/only-logo.png" %>'>
				
				<h2>Chương trình nước sạch <br>và  vệ sinh nông thôn dựa trên kết quả (P<span style="text-transform: lowercase;">for</span>R)</h2>
				
				<aui:form action="<%= loginURL %>" autocomplete='<%= PropsValues.COMPANY_SECURITY_LOGIN_FORM_AUTOCOMPLETE ? "on" : "off" %>' cssClass="sign-in-form" method="post" name="fm">
					<aui:input name="saveLastPath" type="hidden" value="<%= false %>" />
					<aui:input name="redirect" type="hidden" value="<%= redirect %>" />
					<aui:input name="doActionAfterLogin" type="hidden" value="<%= portletName.equals(PortletKeys.FAST_LOGIN) ? true : false %>" />
		
					<c:choose>
						<c:when test='<%= SessionMessages.contains(request, "userAdded") %>'>
		
							<%
							String userEmailAddress = (String)SessionMessages.get(request, "userAdded");
							String userPassword = (String)SessionMessages.get(request, "userAddedPassword");
							%>
		
							<div class="alert alert-success">
								<c:choose>
									<c:when test="<%= company.isStrangersVerify() || Validator.isNull(userPassword) %>">
										<%= LanguageUtil.get(pageContext, "thank-you-for-creating-an-account") %>
		
										<c:if test="<%= company.isStrangersVerify() %>">
											<%= LanguageUtil.format(pageContext, "your-email-verification-code-has-been-sent-to-x", userEmailAddress) %>
										</c:if>
									</c:when>
									<c:otherwise>
										<%= LanguageUtil.format(pageContext, "thank-you-for-creating-an-account.-your-password-is-x", userPassword, false) %>
									</c:otherwise>
								</c:choose>
		
								<c:if test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.ADMIN_EMAIL_USER_ADDED_ENABLED) %>">
									<%= LanguageUtil.format(pageContext, "your-password-has-been-sent-to-x", userEmailAddress) %>
								</c:if>
							</div>
						</c:when>
						<c:when test='<%= SessionMessages.contains(request, "userPending") %>'>
		
							<%
							String userEmailAddress = (String)SessionMessages.get(request, "userPending");
							%>
		
							<div class="alert alert-success">
								<%= LanguageUtil.format(pageContext, "thank-you-for-creating-an-account.-you-will-be-notified-via-email-at-x-when-your-account-has-been-approved", userEmailAddress) %>
							</div>
						</c:when>
					</c:choose>
						<%
						String loginLabel = null;
		
						if (authType.equals(CompanyConstants.AUTH_TYPE_EA)) {
							loginLabel = "email-address";
						}
						else if (authType.equals(CompanyConstants.AUTH_TYPE_SN)) {
							loginLabel = "screen-name";
						}
						else if (authType.equals(CompanyConstants.AUTH_TYPE_ID)) {
							loginLabel = "id";
						}
						%>
						<div class="login">
							<div class="form-1">
								<div class="user">
									<img src='<%= themeDisplay.getPathThemeImages() + "/user.png"%>'>
									<aui:input autoFocus="<%= windowState.equals(LiferayWindowState.EXCLUSIVE) || windowState.equals(WindowState.MAXIMIZED) %>" cssClass="clearable" label="" name="login" showRequiredLabel="<%= false %>" type="text" value="<%= login %>">
										<aui:validator name="required" />
									</aui:input>
								</div>
								<div class="pass">
									<img src='<%= themeDisplay.getPathThemeImages() + "/pass.png"%>'>
									<aui:input name="password" showRequiredLabel="<%= false %>" label="" type="password" value="<%= password %>">
										<aui:validator name="required" />
									</aui:input>
		
								</div>	
								<span id="<portlet:namespace />passwordCapsLockSpan" style="display: none;"><liferay-ui:message key="caps-lock-is-on" /></span>
								
								<button type="submit">Đăng nhập</button>
							</div>
							
						</div>

				</aui:form>
			
			</div>
		</section>
		
		<footer class="diachi">
			<p>TRUNG TÂM QUỐC GIA NƯỚC SẠCH VÀ VỆ SINH MÔI TRƯỜNG NÔNG THÔN
			<br>73 Nguyên Hồng, Đống Đa, Hà Nội
			<br><a href="http://dtt.vn"><img src='<%= themeDisplay.getPathThemeImages() + "/logo_footer.png" %>'></a></p>
		</footer>

		<aui:script use="aui-base">
			var password = A.one('#<portlet:namespace />password');

			if (password) {
				password.on(
					'keypress',
					function(event) {
						Liferay.Util.showCapsLock(event, '<portlet:namespace />passwordCapsLockSpan');
					}
				);
			}
		</aui:script>
	</div>
	</c:otherwise>
</c:choose>

<style>
<!--
.aui .alert-danger, .aui .alert-error, .aui .portlet-msg-error {
	background-color: #fee5e2;
	border-color: #fcaca5;
	color: #b50303;
	display: none;
}

.but {
  display: inline-block;
  padding: 10px;
}
-->
</style>