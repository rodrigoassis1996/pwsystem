<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="headscripts.jsp"/>
    </head>

    <body class="nav-md">
        <div class="container body">
            <div class="main_container">
                <jsp:include page="menu.jsp"/>

                <!-- page content -->
                <div class="right_col" role="main">
                    <!-- top tiles -->
                    <div class="row tile_count">
                        <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
                            <span class="count_top"><i class="fa fa-mortar-board"></i> Total Alunos</span>
                            <div class="count">2500</div>
                        </div>
                        <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
                            <span class="count_top"><i class="fa fa-users"></i> Total turmas</span>
                            <div class="count">5</div>
                        </div>
                        <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
                            <span class="count_top"><i class="fa fa-male"></i> Total Professores</span>
                            <div class="count green">2,500</div>
                        </div>
                        <div class="col-md-2 col-sm-4 col-xs-6 tile_stats_count">
                            <span class="count_top"><i class="fa fa-calendar-check-o"></i> Total Disciplinas</span>
                            <div class="count">4,567</div>
                        </div>
                    </div>
                    <!-- /top tiles -->
                </div>
                <!-- /page content -->

                <jsp:include page="footer.jsp"/>
            </div>
        </div>

        <jsp:include page="footerscripts.jsp"/>

    </body>
</html>
