<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="headscripts.jsp"/>
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
                                        <h2>Formulário de Turmas <small>Formulário para cadastro e edição de turmas</small></h2>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="x_content">
                                        <br />
                                        <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left">

                                            <div class="form-group">
                                                <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nome">
                                                    Nome<span class="required">*</span>
                                                </label>
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                    <input type="text" id="nome" name="nome" required="required" class="form-control col-md-7 col-xs-12">
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <div class="col-md-6 col-sm-6 col-xs-12">
                                                    <input id="btnsalvar" value="Salvar" type="button" class="btn btn-success"/>
                                                    <a href="listaturma.jsp" class="btn btn-primary">Voltar</a>
                                                </div>
                                            </div>

                                        </form>
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
