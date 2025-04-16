📁 Projeto: Contagem de Números Pares no Vetor (Recursivo)

📌 Descrição: >
  Aplicação em Java que utiliza uma função recursiva para contar a quantidade de números pares em um vetor de inteiros. O vetor é preenchido pelo usuário e deve conter apenas números naturais maiores que zero. O algoritmo percorre o vetor elemento por elemento, somando 1 sempre que encontra um número par.

🗂️ Estrutura de Arquivos:
  - 📄 src/controller/QtdDeParesNoVetor.java: Contém o método recursivo que realiza a contagem de números pares.
  - 📄 src/view/Principal.java: Responsável pela interação com o usuário, criação do vetor e exibição do resultado.

🧠 Lógica da Recursividade:
  método: contarParesNoVetor(int[] vetor, int i)
  explicação:
    - ✋ Condição de parada: Quando `i == vetor.length`, significa que chegamos ao final do vetor. A função retorna 0.
    - 🔁 Relação recursiva:
        - Se `vetor[i] % 2 == 0` (se o número é par), retorna `1 + chamada recursiva` com `i + 1`.
        - Caso contrário, retorna `0 + chamada recursiva` com `i + 1`.

💬 Exemplo de Execução:
  entrada:
    - Tamanho do vetor: 5
    - Valores: [2, 4, 7, 8, 10]
  saída:
    - A quantidade de números pares no vetor é: 4

📥 Entrada:
  - O usuário informa o tamanho do vetor e os valores de cada posição, com validação para garantir que sejam números naturais maiores que zero.

📤 Saída:
  - Exibe a quantidade de números pares no vetor em uma janela de mensagem (`JOptionPane`).

📌 Observações:
  - A recursão percorre o vetor de forma linear, do índice 0 até o final.
  - O código está estruturado seguindo boas práticas, com separação clara entre lógica de negócio e interface com o usuário.
  - Adicionada validação de entradas para garantir que o tamanho do vetor e os valores inseridos sejam válidos.

👨‍💻 Autor:
  Desenvolvido por **Lucas Bezerra de Macedo**.
