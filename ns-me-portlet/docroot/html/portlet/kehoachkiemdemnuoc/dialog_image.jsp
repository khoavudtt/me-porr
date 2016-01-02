<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/init.jsp"%>
<%
String host = PortalUtil.getPortalURL(request);
// String host = PropsUtil.get("vn.ns.host.image");
String image = ParamUtil.getString(request, "imgUrl");
%>
<center>
<img alt="anh-dau-noi" src="<%=host+ image%>" width="500" />
</center>