<%@page import="com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.store.DLStoreUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.util.DLUtil"%>
<%
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
%>

<%@include file="init.jsp" %>

<%
	long baoCaoDLIId = ParamUtil.getLong(request, "baoCaoDLIId");
	BaoCaoDLI baoCaoDLI = BaoCaoDLIBusiness.getBaoCaoDLI(baoCaoDLIId);
	
	String maTinh = ParamUtil.getString(request, "maTinh");
	int namBaoCao = ParamUtil.getInteger(request, "namBaoCao");
	String soBaoCao = ParamUtil.getString(request, "soBaoCao");
	String nguoiLap = ParamUtil.getString(request, "nguoiLap");
	String nguoiDuyet = ParamUtil.getString(request, "nguoiDuyet");
	
	String ngayBaoCao = ParamUtil.getString(request, "ngayBaoCao");
	
	String tabNameValues = "bao-cao-dli-tong-hop,bao-cao-dli-chi-tiet";
	
	FileEntry luuTruPDF1Entry = null;
	FileEntry luuTruPDF2Entry = null;
	String luuTruPDF1 = StringPool.BLANK;
	String luuTruPDF2 = StringPool.BLANK;
	
	if(baoCaoDLI != null && baoCaoDLI.getLuuTruPDF1Id() > 0 && baoCaoDLI.getTrangThai() > 0) {
		try{
			luuTruPDF1Entry = DLAppLocalServiceUtil.getFileEntry(baoCaoDLI.getLuuTruPDF1Id());
			
			luuTruPDF1 = themeDisplay.getPortalURL() + DLUtil.getPreviewURL(
					luuTruPDF1Entry, luuTruPDF1Entry.getFileVersion(),
				themeDisplay, StringPool.BLANK, false, false);
		} catch(Exception e) {
			
		}
	}
	
	if(baoCaoDLI != null && baoCaoDLI.getLuuTruPDF2Id() > 0 && baoCaoDLI.getTrangThai() > 0) {
		try{
			luuTruPDF2Entry = DLAppLocalServiceUtil.getFileEntry(baoCaoDLI.getLuuTruPDF2Id());
			
			luuTruPDF2 = themeDisplay.getPortalURL() + DLUtil.getPreviewURL(
					luuTruPDF2Entry, luuTruPDF2Entry.getFileVersion(),
				themeDisplay, StringPool.BLANK, false, false);
		} catch(Exception e) {
			
		}
	}
	
	if (!(typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_1_1 || typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_1_2)) {
		tabNameValues = "bao-cao-dli-tong-hop";
	}
	
	if (typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_3 && !isRealTimeReport) {
		tabNameValues = "bao-cao-dli-tong-hop,bao-cao-dli-3-1,bao-cao-dli-3-2";
	}
%>

<c:choose>
	<c:when test="<%= isRealTimeReport %>">
		<c:choose>
			<c:when test="<%= Validator.isNotNull(maTinh) && namBaoCao > 0 %>">
				<fieldset>
					<liferay-ui:tabs names="<%= tabNameValues.toString() %>" refresh="<%= false %>" tabsValues="<%= tabNameValues.toString() %>">
						<liferay-ui:section>
							<c:choose>
								<c:when test="<%= Validator.isNotNull(luuTruPDF1) %>">
									<div align="center">
										<OBJECT data="<%=luuTruPDF1%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
											type="text/html" TITLE="Báo cáo" 
											WIDTH="100%" HEIGHT="1500px"
											style="background: white; min-height: 100%;" >
										</object>
									</div>
								</c:when>
								
								<c:otherwise>
									<liferay-util:include page="/html/common/report_export.jsp" servletContext="<%= application %>" >
										<portlet:param name="maTinh" value="<%= maTinh %>"/>
										<portlet:param name="namBaoCao" value="<%= Integer.toString(namBaoCao)  %>"/>
										<portlet:param name="soBaoCao" value="<%= soBaoCao %>"/>
										<portlet:param name="nguoiLap" value="<%= nguoiLap %>"/>
										<portlet:param name="nguoiDuyet" value="<%= nguoiDuyet %>"/>
										<portlet:param name="ngayBaoCao" value="<%= ngayBaoCao %>"/>
										<portlet:param name="duoiFile" value="<%= ReportConstant.DUOI_PDF%>"/>
										<portlet:param name="thoiGianThuc" value="<%= ReportConstant.THUC %>"/>
										<c:choose>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_1_1 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI1_1_TONGHOP_SO_DAU_NOI_MOI_HOAT_DONG %>"/>
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_1_2 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI1_2_TH %>"/>
												
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_2_1 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI2_1_SNDTCHTCNBV %>"/>
											
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_2_2 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI2_2 %>"/>
											
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_3 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI3 %>"/>
											
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_TH %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI_TH %>"/>
											</c:when>
										</c:choose>
									</liferay-util:include>
								</c:otherwise>
							</c:choose>
						</liferay-ui:section>
						
						<liferay-ui:section>
							<c:choose>
								<c:when test="<%= Validator.isNotNull(luuTruPDF2) %>">
									<div align="center">
										<OBJECT data="<%=luuTruPDF2%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
											type="text/html" TITLE="Báo cáo" 
											WIDTH="100%" HEIGHT="1500px"
											style="background: white; min-height: 100%;" >
										</object>
									</div>
								</c:when>
								
								<c:otherwise>
									<liferay-util:include page="/html/common/report_export.jsp" servletContext="<%= application %>" >
										<portlet:param name="maTinh" value="<%= maTinh %>"/>
										<portlet:param name="namBaoCao" value="<%= Integer.toString(namBaoCao)  %>"/>
										<portlet:param name="soBaoCao" value="<%= soBaoCao %>"/>
										<portlet:param name="nguoiLap" value="<%= nguoiLap %>"/>
										<portlet:param name="nguoiDuyet" value="<%= nguoiDuyet %>"/>
										<portlet:param name="ngayBaoCao" value="<%= ngayBaoCao %>"/>
										<portlet:param name="duoiFile" value="<%= ReportConstant.DUOI_PDF %>"/>
										<portlet:param name="thoiGianThuc" value="<%= ReportConstant.THUC %>"/>
										
										<c:choose>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_1_1 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI1_1_CHITIET_DSDAU_NOI_MOI_CAP_NUOC %>"/>
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_1_2 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI1_2_CT %>"/>
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_3 %>">
												<portlet:param name="type" value="<%= ReportConstant.THDK_DNSDN %>"/>
											</c:when>
										</c:choose>
									</liferay-util:include>
								</c:otherwise>
							</c:choose>
						</liferay-ui:section>
					</liferay-ui:tabs>
				</fieldset>
			</c:when>
			
			<c:otherwise>
				<div class="alert alert-error">
					<liferay-ui:message key="chon-tinh-nam-de-xem-duoc-bao-cao"/>
				</div>
			</c:otherwise>
		</c:choose>
	</c:when>

	<c:otherwise>
		<c:choose>
			<c:when test="<%= Validator.isNotNull(maTinh) && namBaoCao > 0 %>">
				<fieldset>
					<liferay-ui:tabs names="<%= tabNameValues.toString() %>" refresh="<%= false %>" tabsValues="<%= tabNameValues.toString() %>">
						<liferay-ui:section>
							<c:choose>
								<c:when test="<%= Validator.isNotNull(luuTruPDF1) %>">
									<div align="center">
										<a href="<%= luuTruPDF1 %>" target="_blank">Tai</a>
										<OBJECT data="<%=luuTruPDF1%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
											type="text/html" TITLE="Báo cáo" 
											WIDTH="100%" HEIGHT="1500px"
											style="background: white; min-height: 100%;" >
										</object>
									</div>
								</c:when>
								
								<c:otherwise>
									<liferay-util:include page="/html/common/report_export.jsp" servletContext="<%= application %>" >
										<portlet:param name="maTinh" value="<%= maTinh %>"/>
										<portlet:param name="namBaoCao" value="<%= String.valueOf(namBaoCao) %>"/>
										<portlet:param name="soBaoCao" value="<%= soBaoCao %>"/>
										<portlet:param name="nguoiLap" value="<%= nguoiLap %>"/>
										<portlet:param name="nguoiDuyet" value="<%= nguoiDuyet %>"/>
										<portlet:param name="ngayBaoCao" value="<%= ngayBaoCao %>"/>
										<portlet:param name="duoiFile" value="<%= ReportConstant.DUOI_PDF %>"/>
										<portlet:param name="thoiGianThuc" value="<%= ReportConstant.CHOT %>"/>
										
										<c:choose>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_1_1 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI1_1_TONGHOP_SO_DAU_NOI_MOI_HOAT_DONG %>"/>
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_1_2 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI1_2_TH %>"/>
												
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_2_1 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI2_1_SNDTCHTCNBV %>"/>
											
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_2_2 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI2_2 %>"/>
											
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_3 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI3 %>"/>
											
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_TH %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI_TH %>"/>
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_THVG %>">
												<portlet:param name="type" value="<%= ReportConstant.THVG %>"/>
											</c:when>
											
										</c:choose>
										
									</liferay-util:include>
								</c:otherwise>
							</c:choose>
						</liferay-ui:section>
						
						<liferay-ui:section>
							<c:choose>
								<c:when test="<%= Validator.isNotNull(luuTruPDF2) %>">
									<div align="center">
										<OBJECT data="<%=luuTruPDF2%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
											type="text/html" TITLE="Báo cáo" 
											WIDTH="100%" HEIGHT="1500px"
											style="background: white; min-height: 100%;" >
										</object>
									</div>
								</c:when>
								
								<c:otherwise>
									<liferay-util:include page="/html/common/report_export.jsp" servletContext="<%= application %>" >
										<portlet:param name="maTinh" value="<%= maTinh %>"/>
										<portlet:param name="namBaoCao" value="<%= String.valueOf(namBaoCao) %>"/>
										<portlet:param name="soBaoCao" value="<%= soBaoCao %>"/>
										<portlet:param name="nguoiLap" value="<%= nguoiLap %>"/>
										<portlet:param name="nguoiDuyet" value="<%= nguoiDuyet %>"/>
										<portlet:param name="ngayBaoCao" value="<%= ngayBaoCao %>"/>
										<portlet:param name="duoiFile" value="<%= ReportConstant.DUOI_PDF %>"/>
										<portlet:param name="thoiGianThuc" value="<%= ReportConstant.CHOT %>"/>
										
										<c:choose>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_1_1 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI1_1_CHITIET_DSDAU_NOI_MOI_CAP_NUOC %>"/>
											</c:when>
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_1_2 %>">
												<portlet:param name="type" value="<%= ReportConstant.DLI1_2_CT %>"/>
												
											</c:when>
		
											<c:when test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_3 %>">
												<portlet:param name="type" value="<%= ReportConstant.THDK_DNSDN %>"/>
											</c:when>
										</c:choose>
									</liferay-util:include>
								</c:otherwise>
							</c:choose>
							
						</liferay-ui:section>
						
						<c:if test="<%= typeDLI == BaoCaoDLIConstants.BAO_CAO_DLI_3 %>">
							<liferay-ui:section>
								<c:choose>
									<c:when test="<%= Validator.isNotNull(luuTruPDF2) %>">
										<div align="center">
											<OBJECT data="<%=luuTruPDF2%>#view=FitH&scrollbar=0&amp;page=1&toolbar=0&statusbar=0&messages=0&navpanes=0"
												type="text/html" TITLE="Báo cáo" 
												WIDTH="100%" HEIGHT="1500px"
												style="background: white; min-height: 100%;" >
											</object>
										</div>
									</c:when>
									
									<c:otherwise>
										<liferay-util:include page="/html/common/report_export.jsp" servletContext="<%= application %>" >
											<portlet:param name="maTinh" value="<%= maTinh %>"/>
											<portlet:param name="namBaoCao" value="<%= String.valueOf(namBaoCao) %>"/>
											<portlet:param name="soBaoCao" value="<%= soBaoCao %>"/>
											<portlet:param name="nguoiLap" value="<%= nguoiLap %>"/>
											<portlet:param name="nguoiDuyet" value="<%= nguoiDuyet %>"/>
											<portlet:param name="ngayBaoCao" value="<%= ngayBaoCao %>"/>
											<portlet:param name="duoiFile" value="<%= ReportConstant.DUOI_PDF %>"/>
											<portlet:param name="type" value="<%= ReportConstant.THDK_NTHVSXM %>"/>
										</liferay-util:include>
									</c:otherwise>
								</c:choose>
								
							</liferay-ui:section>
						</c:if>
					</liferay-ui:tabs>
				</fieldset>
			</c:when>
			
			<c:otherwise>
				<div class="alert alert-error">
					<liferay-ui:message key="chon-tinh-nam-de-xem-duoc-bao-cao"/>
				</div>
			</c:otherwise>
		</c:choose>
	
	</c:otherwise>
</c:choose>