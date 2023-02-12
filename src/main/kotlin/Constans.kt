
object Constans {
    const val START = "/start"
    const val HELP = "/help"
    const val END = "/end"
    const val PARK = "/park"
    const val RETURN = "/return"
    const val PARK_INFO_BY_CAR = "/park_info_by_car"
    const val PARK_INFO_BY_PLACE = "/park_info_by_place"
}
object TextValue {
    const val START_INFO = """
Для того чтобы припарковать автомобиль введите /park и через пробел укажите:
марку, цвет, номер автомобиля и Вашу фамилию и имя.
        """
    const val HELP_INFO = """
        Список команд:
        /start - начало программы.
        /end - завершение программы
        /park - паркует автомобиль
        /return - возвращает автомобиль
        /park_info_by_car - возвращает место, где припаркована машина, по ее номеру
        /park_info_by_place - возвращает информацию о машине по месту на парковке
    """
}