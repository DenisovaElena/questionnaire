<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="fragments/header.jsp"/>
<main>
    <div class="container my-4">
        <div class="card mb-3">
            <div class="card-body">
                <h3 class="alert alert-primary text-center">
                    Опрос удовлетворенности качеством информационного сопровождения
                </h3>
            </div>
        </div>
        <div class="card mb-3">
            <h5 class="alert alert-success">1. Оснащенность рабочего места техникой</h5>
            <div class="card-body d-flex align-items-center">
                <h6 class="mr-3">Ваша&nbsp;оценка:</h6>
                <div class="container mt-n2 mdb-rating">
                    <span id="rateMe1" class="empty-stars"></span>
                </div>
            </div>
        </div>
        <div class="card mb-3">
            <h5 class="alert alert-success">2. Пожелания по оснащению рабочего места техникой</h5>
            <div class="card-body">
                <table class="table table-bordered" id="item2">
                    <thead>
                        <tr class="text-center font-weight-bold">
                            <th scope="col" class="col-6"><h5>Тип оборудования</h5></th>
                            <th scope="col" class="col-5"><h5>Пожелание</h5></th>
                            <th scope="col" class="col-1"><h5>Уд.</h5></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td colspan="3">
                                <div class="row d-flex align-items-center">
                                    <div class="col-6">
                                        <select class="chosen-select" data-placeholder="Выберите из справочника">
                                            <option value="" selected>Выберите из справочника</option>
                                            <option value="1">Оборудование 1</option>
                                            <option value="2">Оборудование 2</option>
                                            <option value="3">Оборудование 3</option>
                                        </select>
                                    </div>
                                    <div class="col-5">
                                        <input type="text" class="form-control form-control-sm" placeholder="Пожелание">
                                    </div>
                                    <div class="col-1 text-center">
                                        <button class="btn btn-sm btn-danger rounded row-remove px-3 py-2"><i class="far fa-trash-alt"></i></button>
                                    </div>
                                </div>
                            </td>
                        </tr>
                    </tbody>
                </table>
                <div class="text-right my-2">
                    <button class="btn btn-primary btn-sm rounded row-add" data-table="item2"><i class="fas fa-plus mr-2"></i>Добавить</button>
                </div>
            </div>
        </div>
        <div class="card mb-3">
            <h5 class="alert alert-success">3. Оцените качество технической поддержки работоспособности оборудования</h5>
            <div class="card-body">
                <div class="row">
                    <div class="col-12 d-flex align-items-center mb-2">
                        <h6 class="mr-3">Ваша&nbsp;оценка:</h6>
                        <div class="container mt-n2 mdb-rating">
                            <span id="rateMe2" class="empty-stars"></span>
                        </div>
                    </div>
                    <div class="col-12">
                        <input type="text" class="form-control form-control-sm" placeholder="Пожелание">
                    </div>
                </div>
            </div>
        </div>
        <div class="card mb-3">
            <h5 class="alert alert-success">4. Используемое программное обеспечение</h5>
            <div class="card-body">
                <table class="table table-bordered" id="item4">
                    <thead>
                    <tr class="text-center font-weight-bold">
                        <th scope="col" class="col-2" rowspan="2"><h5>Наименование программного обеспечения</h5></th>
                        <th scope="col" class="col-2" rowspan="2"><h5>Цель использования (полномочие)</h5></th>
                        <th scope="col" class="col-5" colspan="2"><h5>Удовлетворенность</h5></th>
                        <th scope="col" class="col-2" rowspan="2"><h5>Пожелания</h5></th>
                        <th scope="col" class="col-1" rowspan="2"><h5>Уд.</h5></th>
                    </tr>
                    <tr class="text-center font-weight-bold">
                        <th scope="col" class="col-2 align-middle"><h5>Продукт</h5></th>
                        <th scope="col" class="col-2 align-middle"><h5>Поддержка</h5></th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td colspan="6">
                            <div class="row d-flex align-items-center">
                                <div class="col-2" id="softBlock">
                                    <select class="chosen-select other" id="soft" data-placeholder="Выберите из справочника">
                                        <option value="" selected>Выберите из справочника</option>
                                        <option value="1">Программное обеспечение 1</option>
                                        <option value="2">Программное обеспечение 2</option>
                                        <option value="3">Программное обеспечение 3</option>
                                        <option value="0">Иное</option>
                                    </select>
                                </div>
                                <div class="col-2">
                                    <input type="text" class="form-control form-control-sm" placeholder="Цель использования">
                                </div>
                                <div class="col-5">
                                    <div class="row">
                                        <div class="col-6 text-center">
                                            <div class="container mt-n2 mdb-rating">
                                                <span id="rateMe3" class="empty-stars"></span>
                                            </div>
                                        </div>
                                        <div class="col-6 text-center">
                                            <div class="container mt-n2 mdb-rating">
                                                <span id="rateMe4" class="empty-stars"></span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-2">
                                    <input type="text" class="form-control form-control-sm" placeholder="Пожелание">
                                </div>
                                <div class="col-1 text-center">
                                    <button class="btn btn-sm btn-danger rounded row-remove px-3 py-2"><i class="far fa-trash-alt"></i></button>
                                </div>
                            </div>
                        </td>
                    </tr>
                    </tbody>
                </table>
                <div class="text-right my-2">
                    <button class="btn btn-primary btn-sm rounded row-add" data-table="item4"><i class="fas fa-plus mr-2"></i>Добавить</button>
                </div>
            </div>
        </div>
        <div class="card mb-3">
            <h5 class="alert alert-success">5. Пожелания по приобретению программного обеспечения</h5>
            <div class="card-body">
                <table class="table table-bordered" id="item5">
                    <thead>
                    <tr class="text-center font-weight-bold">
                        <th scope="col" class="col-6"><h5>Планируемая цель использования</h5></th>
                        <th scope="col" class="col-5"><h5>Наименование известных Вам желаемых продуктов</h5></th>
                        <th scope="col" class="col-1"><h5>Уд.</h5></th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td colspan="3">
                            <div class="row d-flex align-items-center">
                                <div class="col-6">
                                    <input type="text" class="form-control form-control-sm" placeholder="Цель использования">
                                </div>
                                <div class="col-5">
                                    <input type="text" class="form-control form-control-sm" placeholder="Наименование софта">
                                </div>
                                <div class="col-1 text-center">
                                    <button class="btn btn-sm btn-danger rounded row-remove px-3 py-2"><i class="far fa-trash-alt"></i></button>
                                </div>
                            </div>
                        </td>
                    </tr>
                    </tbody>
                </table>
                <div class="text-right my-2">
                    <button class="btn btn-primary btn-sm rounded row-add" data-table="item5"><i class="fas fa-plus mr-2"></i>Добавить</button>
                </div>
            </div>
        </div>
        <div class="container my-3 text-center">
            <button class="btn btn-success rounded">ОТПРАВИТЬ</button>
        </div>
    </div>
</main>

<jsp:include page="fragments/footerNew.jsp"/>
<jsp:include page="fragments/footerScriptNew.jsp"/>
<script>
    $(function() {
        // Рейтинг звёздочки
        $('#rateMe1').mdbRate();
        $('#rateMe2').mdbRate();
        $('#rateMe3').mdbRate();
        $('#rateMe4').mdbRate();

        // Добавляем строку
        $(document).on('click', '.row-add', function() {
            var tabId = $(this).attr('data-table');
            $('#'+tabId).find('tbody tr:last').clone().appendTo('#'+tabId).find('td:not(:last)');
        });

        // Удаляем строку
        $(document).on('click', '.row-remove', function() {
            $(this).parents('tr').detach();
        });

        // Меняем по выбору поля
        $('.other').on('change', function() {
            var idParent = $(this).attr('id');
            var idParentNew = idParent+'Block';
            var idValue = $(this).val();
            if(idValue == 0) {
                $('#'+idParentNew).append(
                    '<input type="text" class="form-control form-control-sm '+idParentNew+'" placeholder="Программное обеспечение">'
                );
                $('#'+idParent).chosen("destroy");
            } else {
                $('.'+idParentNew).hide(500).remove();
            }
        });
    });
</script>
<jsp:include page="fragments/footerBasement.jsp"/>