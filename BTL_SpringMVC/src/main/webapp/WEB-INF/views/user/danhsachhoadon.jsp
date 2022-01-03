<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
    
<!-- Shoping Cart Section Begin -->
    <section class="shoping-cart spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="shoping__cart__table">
                        <table>
                            <thead>
                                <tr>
                                    <th>Mã hóa đơn</th>
                                    <th>Ngày đặt</th>
                                    <th>Tổng tiền</th>
                                    <th>Trạng thái</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                            	<c:forEach var="item" items="${danhSachHoaDon }">
                            	 	 <tr>
	                                    <td>
	                                        <h5>${item.maHoaDon}</h5>
	                                    </td>
	                                    <td >
	                                        ${item.ngayLapHoaDon}
	                                    </td>
	                                    <td >
	                                        ${item.tongTien} VND
	                                    </td>
	                                    <td >
	                                        ${item.trangThai}
	                                    </td>
	                                    <td >
	                                        <a href="<c:url value='/chi-tiet-don-hang/${item.maHoaDon }'/>" style="font-size: 20px;">chi tiết</a>
	                                    </td>
	                                </tr>
                            	</c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Shoping Cart Section End -->