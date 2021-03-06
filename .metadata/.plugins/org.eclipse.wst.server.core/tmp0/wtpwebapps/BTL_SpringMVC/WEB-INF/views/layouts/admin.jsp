<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Admin</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome Icons -->
  <link rel="stylesheet" href="<c:url value='/assets/admin/plugins/fontawesome-free/css/all.min.css'/>">
  <!-- overlayScrollbars -->
  <link rel="stylesheet" href="<c:url value='/assets/admin/plugins/overlayScrollbars/css/OverlayScrollbars.min.css'/>">
  <!-- Theme style -->
  <link rel="stylesheet" href="<c:url value='/assets/admin/dist/css/adminlte.min.css'/>">
  
  <link rel="stylesheet" href="<c:url value='/assets/admin/custom_style.css'/>">
</head>
<body class="hold-transition dark-mode sidebar-mini layout-fixed layout-navbar-fixed layout-footer-fixed">
<div class="wrapper">

	<%@ include file="/WEB-INF/views/layouts/admin/header.jsp"%>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
   <decorator:body></decorator:body>
  </div>
  <!-- /.content-wrapper -->

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- REQUIRED SCRIPTS -->
<!-- jQuery -->
<script src="<c:url value='/assets/admin/custom.js'/>"></script>

<script src="<c:url value='/assets/admin/plugins/jquery/jquery.min.js'/>"></script>
<!-- Bootstrap -->
<script src="<c:url value='/assets/admin/plugins/bootstrap/js/bootstrap.bundle.min.js'/>"></script>
<!-- overlayScrollbars -->
<script src="<c:url value='/assets/admin/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js'/>"></script>
<!-- AdminLTE App -->
<script src="<c:url value='/assets/admin/dist/js/adminlte.js'/>"></script>

<!-- PAGE PLUGINS -->
<!-- jQuery Mapael -->
<script src="<c:url value='/assets/admin/plugins/jquery-mousewheel/jquery.mousewheel.js'/>"></script>
<script src="<c:url value='/assets/admin/plugins/raphael/raphael.min.js'/>"></script>
<script src="<c:url value='/assets/admin/plugins/jquery-mapael/jquery.mapael.min.js'/>"></script>
<script src="<c:url value='/assets/admin/plugins/jquery-mapael/maps/usa_states.min.js'/>"></script>
<!-- ChartJS -->
<script src="<c:url value='/assets/admin/plugins/chart.js/Chart.min.js'/>"></script>

<!-- AdminLTE for demo purposes -->
<script src="<c:url value='/assets/admin/dist/js/demo.js'/>"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="<c:url value='/assets/admin/dist/js/pages/dashboard2.js'/>"></script>
</body>
</html>
