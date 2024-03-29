typealias Predicate<T> = (T) -> Boolean

private fun foo(p: Predicate<Int>) = p(42)

fun main() {
    val f: (Int) -> Boolean = { it > 0 }
    println(foo(f))

    val p: Predicate<Int> = { it > 0 }
    println(listOf(1, -2).filter(p))
}