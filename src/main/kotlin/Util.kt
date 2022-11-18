fun obtenerString(msg: String, err: String? = null): String {
    while (true) {
        print(msg)
        val s = readLine()!!
        if (s != "") return s
        if (err != null) println(err)
    }
}

fun obtenerNum(msg: String, err: String? = null): Int {
    while (true) {
        print(msg)
        val n = readLine()!!.toIntOrNull()
        if (n != null) return n
        if (err != null) println(err)
    }
}

fun obtenerSiNo(msg: String, default: Boolean = true): Boolean {
    while (true) {
        val cartel = if (default) " [Y/n]: " else " [y/N]: "
        print(msg + cartel)
        val n = readLine()!!
        if (n == "") return default
        when (n[0]) {
            'Y', 'y', 'S', 's' -> return true
            'N', 'n' -> return false
        }
    }
}