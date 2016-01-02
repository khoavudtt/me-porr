<%@page import="vn.dtt.sol.ns.vesinhmoitruong.dao.service.VeSinhCongTrinhLocalServiceUtil"%>
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

<%@ page pageEncoding="UTF-8" %>

<%@include file="init.jsp" %>

<div id="chartContainer" style="width: 100%; height: 300px">

</div>

<div style="margin: 10px;">

</div>

<div id="chartContainerVs" style="width: 100%; height: 300px">

</div><div style="margin: 10px;">

</div>

<div id="chartContainerCTCC" style="width: 100%; height: 300px">

</div>

<%
	Calendar cal = Calendar.getInstance();

	int year = cal.get(Calendar.YEAR);

	String node1 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiInTinh("27"));
	String node2 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiInTinh("35"));
	String node3 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiInTinh("01"));
	String node4 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiInTinh("33"));
	String node5 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiInTinh("25"));
	String node6 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiInTinh("22"));
	String node7 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiInTinh("38"));
	String node8 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiInTinh("26"));
	
	
	String node12 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiPhanKHInTinh("27"));
	String node22 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiPhanKHInTinh("35"));
	String node32 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiPhanKHInTinh("01"));
	String node42 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiPhanKHInTinh("33"));
	String node52 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiPhanKHInTinh("25"));
	String node62 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiPhanKHInTinh("22"));
	String node72 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiPhanKHInTinh("38"));
	String node82 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiPhanKHInTinh("26"));

	
	String node13 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiDongBoInTinh("27"));
	String node23 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiDongBoInTinh("35"));
	String node33 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiDongBoInTinh("01"));
	String node43 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiDongBoInTinh("33"));
	String node53 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiDongBoInTinh("25"));
	String node63 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiDongBoInTinh("22"));
	String node73 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiDongBoInTinh("38"));
	String node83 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countDauNoiDongBoInTinh("26"));
	
	
	String jode1 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDInTinh("27", year));
	String jode2 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDInTinh("35", year));
	String jode3 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDInTinh("01", year));
	String jode4 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDInTinh("33", year));
	String jode5 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDInTinh("25", year));
	String jode6 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDInTinh("22", year));
	String jode7 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDInTinh("38", year));
	String jode8 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDInTinh("26", year));
	
	
	String jode12 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDPhanKHInTinh("27", year));
	String jode22 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDPhanKHInTinh("35", year));
	String jode32 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDPhanKHInTinh("01", year));
	String jode42 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDPhanKHInTinh("33", year));
	String jode52 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDPhanKHInTinh("25", year));
	String jode62 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDPhanKHInTinh("22", year));
	String jode72 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDPhanKHInTinh("38", year));
	String jode82 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHGDPhanKHInTinh("26", year));

	
	String jode13 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHDGDongBoInTinh("27"));
	String jode23 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHDGDongBoInTinh("35"));
	String jode33 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHDGDongBoInTinh("01"));
	String jode43 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHDGDongBoInTinh("33"));
	String jode53 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHDGDongBoInTinh("25"));
	String jode63 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHDGDongBoInTinh("22"));
	String jode73 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHDGDongBoInTinh("38"));
	String jode83 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countHDGDongBoInTinh("26"));

	String zode1 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhInTinh("27"));
	String zode2 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhInTinh("35"));
	String zode3 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhInTinh("01"));
	String zode4 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhInTinh("33"));
	String zode5 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhInTinh("25"));
	String zode6 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhInTinh("22"));
	String zode7 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhInTinh("38"));
	String zode8 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhInTinh("26"));
	
	
	String zode12 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhPhanKHInTinh("27"));
	String zode22 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhPhanKHInTinh("35"));
	String zode32 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhPhanKHInTinh("01"));
	String zode42 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhPhanKHInTinh("33"));
	String zode52 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhPhanKHInTinh("25"));
	String zode62 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhPhanKHInTinh("22"));
	String zode72 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhPhanKHInTinh("38"));
	String zode82 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhPhanKHInTinh("26"));

	
	String zode13 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhDongBoInTinh("27"));
	String zode23 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhDongBoInTinh("35"));
	String zode33 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhDongBoInTinh("01"));
	String zode43 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhDongBoInTinh("33"));
	String zode53 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhDongBoInTinh("25"));
	String zode63 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhDongBoInTinh("22"));
	String zode73 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhDongBoInTinh("38"));
	String zode83 = Integer.toString(VeSinhCongTrinhLocalServiceUtil.countCongTrinhDongBoInTinh("26"));
%>

<script type="text/javascript">

AUI().ready(function(A){
	var updateInterval = 1000;

	setInterval(function(){chart()}, updateInterval); 

	var ns_dps1 = [
				{ label: "Bắc Ninh", y: <%= node1 %>},
				{ label: "Hà Nam", y: <%= node2 %>},
				{ label: "Hà Nội", y: <%= node3 %>},
				{ label: "Hưng Yên", y: <%= node4 %>},
				{ label: "Phú Thọ", y: <%= node5 %>},
				{ label: "Quảng Ninh", y: <%= node6 %>},
				{ label: "Thanh Hóa", y: <%= node7 %>},
				{ label: "Vĩnh Phúc", y: <%= node8 %>}
			];
	
	var ns_dps2 = [
					{ label: "Bắc Ninh", y: <%= node12 %>},
					{ label: "Hà Nam", y: <%= node22 %>},
					{ label: "Hà Nội", y: <%= node32 %>},
					{ label: "Hưng Yên", y: <%= node42 %>},
					{ label: "Phú Thọ", y: <%= node52 %>},
					{ label: "Quảng Ninh", y: <%= node62 %>},
					{ label: "Thanh Hóa", y: <%= node72 %>},
					{ label: "Vĩnh Phúc", y: <%= node82 %>}
				];

	var ns_dps3 = [
					{ label: "Bắc Ninh", y: <%= node13 %>},
					{ label: "Hà Nam", y: <%= node23 %>},
					{ label: "Hà Nội", y: <%= node33 %>},
					{ label: "Hưng Yên", y: <%= node43 %>},
					{ label: "Phú Thọ", y: <%= node53 %>},
					{ label: "Quảng Ninh", y: <%= node63 %>},
					{ label: "Thanh Hóa", y: <%= node73 %>},
					{ label: "Vĩnh Phúc", y: <%= node83 %>}
				];
	var vs_dps1 = [
					{ label: "Bắc Ninh", y: <%= jode1 %>},
					{ label: "Hà Nam", y: <%= jode2 %>},
					{ label: "Hà Nội", y: <%= jode3 %>},
					{ label: "Hưng Yên", y: <%= jode4 %>},
					{ label: "Phú Thọ", y: <%= jode5 %>},
					{ label: "Quảng Ninh", y: <%= jode6 %>},
					{ label: "Thanh Hóa", y: <%= jode7 %>},
					{ label: "Vĩnh Phúc", y: <%= jode8 %>}
				];
	var vs_dps2 = [
					{ label: "Bắc Ninh", y: <%= jode12 %>},
					{ label: "Hà Nam", y: <%= jode22 %>},
					{ label: "Hà Nội", y: <%= jode32 %>},
					{ label: "Hưng Yên", y: <%= jode42 %>},
					{ label: "Phú Thọ", y: <%= jode52 %>},
					{ label: "Quảng Ninh", y: <%= jode62 %>},
					{ label: "Thanh Hóa", y: <%= jode72 %>},
					{ label: "Vĩnh Phúc", y: <%= jode82 %>}
				];
	var vs_dps3 = [
					{ label: "Bắc Ninh", y: <%= jode13 %>},
					{ label: "Hà Nam", y: <%= jode23 %>},
					{ label: "Hà Nội", y: <%= jode33 %>},
					{ label: "Hưng Yên", y: <%= jode43 %>},
					{ label: "Phú Thọ", y: <%= jode53 %>},
					{ label: "Quảng Ninh", y: <%= jode63 %>},
					{ label: "Thanh Hóa", y: <%= jode73 %>},
					{ label: "Vĩnh Phúc", y: <%= jode83 %>}
				];
	var ct_dps1 = [
					{ label: "Bắc Ninh", y: <%= zode1 %>},
					{ label: "Hà Nam", y: <%= zode2 %>},
					{ label: "Hà Nội", y: <%= zode3 %>},
					{ label: "Hưng Yên", y: <%= zode4 %>},
					{ label: "Phú Thọ", y: <%= zode5 %>},
					{ label: "Quảng Ninh", y: <%= zode6 %>},
					{ label: "Thanh Hóa", y: <%= zode7 %>},
					{ label: "Vĩnh Phúc", y: <%= zode8 %>}
				];
	var ct_dps2 = [
					{ label: "Bắc Ninh", y: <%= zode12 %>},
					{ label: "Hà Nam", y: <%= zode22 %>},
					{ label: "Hà Nội", y: <%= zode32 %>},
					{ label: "Hưng Yên", y: <%= zode42 %>},
					{ label: "Phú Thọ", y: <%= zode52 %>},
					{ label: "Quảng Ninh", y: <%= zode62 %>},
					{ label: "Thanh Hóa", y: <%= zode72 %>},
					{ label: "Vĩnh Phúc", y: <%= zode82 %>}
				];
	var ct_dps3 = [
					{ label: "Bắc Ninh", y: <%= zode13 %>},
					{ label: "Hà Nam", y: <%= zode23 %>},
					{ label: "Hà Nội", y: <%= zode33 %>},
					{ label: "Hưng Yên", y: <%= zode43 %>},
					{ label: "Phú Thọ", y: <%= zode53 %>},
					{ label: "Quảng Ninh", y: <%= zode63 %>},
					{ label: "Thanh Hóa", y: <%= zode73 %>},
					{ label: "Vĩnh Phúc", y: <%= zode83 %>}
				];


	var chart = new CanvasJS.Chart("chartContainer", {
		title: {
			text: "Thông tin đồng bộ đấu nối nước"
		},
		axisY: {
			title: "Số đấu nối"
		},
		toolTip: {
			content: "{name} : {y} "
		},
		data: [
				{
					type: "stackedColumn",
					name: "Tổng đấu nối",
					showInLegend: true,
					dataPoints: ns_dps1
				},
				{
					type: "stackedColumn",
					name: "Đã lập kế hoạch",
					showInLegend: true,
					dataPoints: ns_dps2
				},
				{
					type: "stackedColumn",
					name: "Đã đồng bộ",
					showInLegend: true,
					dataPoints: ns_dps3
				}
			]
	});
	
	var chartVs = new CanvasJS.Chart("chartContainerVs", {
		title: {
			text: "Thông tin đồng bộ vệ sinh"
		},
		axisY: {
			title: "Số hộ gia đình"
		},
		toolTip: {
			content: "{name} : {y} "
		},
		data: [
				{
					type: "stackedColumn",
					name: "Tổng hộ gia đình",
					showInLegend: true,
					dataPoints: vs_dps1
				},
				{
					type: "stackedColumn",
					name: "Đã lập kế hoạch",
					showInLegend: true,
					dataPoints: vs_dps2
				},
				{
					type: "stackedColumn",
					name: "Đã đồng bộ",
					showInLegend: true,
					dataPoints: vs_dps3
				}
				]
	});

	var chartCtcc = new CanvasJS.Chart("chartContainerCTCC", {
		title: {
			text: "Thông tin đồng bộ Công trình công cộng"
		},
		axisY: {
			title: "Số công trình công cộng"
		},
		toolTip: {
			content: "{name} : {y} "
		},
		data: [
				{
					type: "stackedColumn",
					name: "Tổng số công trình",
					showInLegend: true,
					dataPoints: ct_dps1
				},
				{
					type: "stackedColumn",
					name: "Đã lập kế hoạch",
					showInLegend: true,
					dataPoints: ct_dps2
				},
				{
					type: "stackedColumn",
					name: "Đã đồng bộ",
					showInLegend: true,
					dataPoints: ct_dps3
				}
				]
	});

	chart.render();
	chartVs.render();
	chartCtcc.render();
})
</script>
