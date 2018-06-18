<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="headscripts.jsp"/>
        <script type="text/javascript" src="js/aluno/index.js"></script>
    </head>

    <body class="nav-md">
        <div class="container body">
            <div class="main_container">
                <jsp:include page="menu.jsp"/>

                <div class="right_col" role="main">
                    <div class="">
                        <div class="row">
                            <div class="col-md-12 col-sm-12 col-xs-12">
                                <div class="x_panel">
                                    <div class="x_title">
                                        <h2>Listagem de alunos</h2>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">
                                        <br />
                                        
                                        <input type="button" id="btnnovo" value="Novo" onclick="location.href = 'formaluno.jsp'" class="btn btn-primary"><br/><br/>

                                        Buscar<br/>
                                        <input type="text" id="busca" value=""/><input type="button" id="btnbuscar" value="Buscar"><br/><br/>
                                        
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th>#</th>
                                                    <th>Nome</th>
                                                    <th>Sobrenome</th>
                                                    <th>Ações</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <jsp:include page="footer.jsp"/>
            </div>
        </div>

        <jsp:include page="footerscripts.jsp"/>

    </body>
</html>
