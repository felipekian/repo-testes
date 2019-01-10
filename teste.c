#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

int soma(int x, int y){
    return x+y;
}

int main(){
    assert(soma(2,2) == 4);
    return 0;
}
