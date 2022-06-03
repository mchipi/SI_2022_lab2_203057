# SI_2022_lab2_203057
## Марија Чипишкова, индекс 203057

### Група на код:

### Control Flow Graph
![CONTROL FLOW GRAPH IMAGE](https://user-images.githubusercontent.com/100198968/171702716-8d00f18d-bd01-4f2c-ba78-978f7df62cac.png)

### Цикломатска комплексност
Цикломатска комплексност се пресметува со формулата П+1, така што П е бројот на предикатни јазли, односно, јазли од кои има повеќе патеки за избор. Во овој случај комплесноста е 8+1=9.
Втората формула која ја употребив е BrojNaRebra - BrojNaJazli + 2 = 27-20+2=9

### Тест случаи според every statement
Потребни се 2 тест случаи за да се изминат јазлите B и D, при кои се фрлаат exceptions. Третиот случај е одбран така што ги изминува сите останати јазли. 
test1: []
test2: ["0", "#", "0", "0", "0", "#", "0", "#", "#","0"]
test3: ["0", "#", "0", "#", "0", "#", "0", "#", "#"]

C0  test1  test2  test3
A     *      *      *
B     *
C            *      *
D            *
E                   *
F                   *
G                   *
H                   *
I                   *
J                   *
K                   *
L                   *
M                   *
N                   *
O                   *
P                   *
Z                   *


### Тест случаи според every path


### Објаснување на напишаните unit tests
