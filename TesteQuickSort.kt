package algoritmos

fun main(args: Array<String>) {
/**
 * Comentários do  meu programa
 * */

    var vetor: Array<Int> = Array(11, { i -> 0 })
    vetor[0] = 6
    vetor[1] = 1
    vetor[2] = 2
    vetor[3] = 5
    vetor[4] = 10
    vetor[5] = 13
    vetor[6] = 21
    vetor[7] = 15
    vetor[8] = 13
    vetor[9] = 21
    vetor[10] = 15



    quicksort(vetor, 0, 7)

    for(i in vetor)
        println(i)


}

fun quicksort(vetor: Array<Int>, left: Int, right: Int) {

    if(left < right){
        var j = separar(vetor, left, right)
        quicksort(vetor, left, j-1) // recursividade p/ ordenar lado esquerdo
        quicksort(vetor, j+1, right) // recursividade p/ ordenar lado direito

    }

}

private fun separar(vetor: Array<Int>, left: Int, right: Int): Int {
    var i = left //left é o pivô
    var j = right

    while(i<j){
        while(i<right &&  vetor[i] <= vetor[left]){i++} //enquanto i não chegar ao final do vetor e for menor que o pivô
        while(j>left && vetor[j] >= vetor[left]){j--}//enquanto j for maior que o início do vetor e form maior que o pivô

        if(i<j)//neste ponto, se i é menor que j, então o valor que estáem j é menor do que o que está em i
            trocar(vetor, i, j)
             i++
             j--
    }
        trocar(vetor, left, j)
    return j
}

  private  fun trocar(vetor: Array<Int>, i: Int, j: Int) {
        var aux = vetor[i]
        vetor[i] = vetor[j]
         vetor[j] = aux
    }

