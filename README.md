# hashtable
Projeto desenvolvido na disciplina de Resolução de Problemas Estruturados em Computação, durante o curso de Eng. de Software na PUCPR.

O projeto visa o estudo da implementação da estrutura de espalhamento com tabela Hash, onde foi utilizado uma função Hash que pode ser observada no método hashCode(int id)

![image](https://github.com/Josemussy/hashtable/assets/101639053/8648aaa3-e4c4-491c-873d-f7ced150e6c9)

Com duas implementações de tratamento de colisões, a primeira por sondagem linear e identificada nos métodos insertLinearProbing(Student student), searchLinearProbing(int id), removeLinearProbing(int id), printLinearProbing() e o resultado da impressão do exemplo pode ser visto a seguir:

![image](https://github.com/Josemussy/hashtable/assets/101639053/2359f42a-d041-4372-9e1b-0b1c87db82ee)

O segundo método de tratamento de colisões foi feito por Encadeamento Exterior e pode ser localizado nos métodos insertChaining(Student student), searchChaining(int id), removeChaining(int id), printChaining() e o resultado da impressão do exemplo pode ser visto a seguir:

![image](https://github.com/Josemussy/hashtable/assets/101639053/283f2a3a-ce14-4b83-bcf1-900247aed59a)

Como o intuito é verificar a eficiência da busca em cada um dos tratamentos, ao realizá-la é impresso o número de iterações feitas, onde para o exemplo testado os métodos tiveram a mesma eficiência.

![image](https://github.com/Josemussy/hashtable/assets/101639053/176335fe-190b-47b4-9f82-faa7f7fd3fe4)

Ao realizar a remoção de algum estudante presente na tabela também é realizado a impressão do novo estado da tabela e a confirmação de que a exclusão do aluno foi feita.

![image](https://github.com/Josemussy/hashtable/assets/101639053/a09ee962-0854-4ccd-8442-e981196d967b)





