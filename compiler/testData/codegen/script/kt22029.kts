data class Pair(val first: Int, val second: Int)

inline fun CharArray.fold(p: Pair, fn: (Pair, Char) -> Pair): Pair = p

val fstSec = true

val (fst, snd) = charArrayOf().fold(Pair(0, 0), { sumPair, char ->
        when (fstSec) {
            true -> Pair(1, 1)
            else -> Pair(2, 2)
        }
    })

// expected: fst: 0