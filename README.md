# SoundFlow

SoundFlow é um projeto Java que simula um sistema de streaming de áudio para gerenciar músicas e podcasts. Ele permite registrar reproduções e curtidas, calcular classificações, e destacar os áudios preferidos com base em sua popularidade.

Este projeto foi desenvolvido como um desafio do curso **Java: aplicando a Orientação a Objetos** da **Alura**. Ele aplica os principais conceitos de Programação Orientada a Objetos (POO), como herança, encapsulamento e sobrescrita de métodos.

## Estrutura do Projeto

O projeto é dividido em duas partes principais:

1. **Pacote `lucasbarros.soundflow.principal`**:
   - Contém a classe principal (`Principal`) que realiza a execução do programa.

2. **Pacote `lucasbarros.soundflow.modelos`**:
   - Define as classes fundamentais do sistema:
     - `Audio`: Classe base para músicas e podcasts.
     - `Musica`: Representa uma música com informações como artista, gênero e álbum.
     - `Podcast`: Representa um podcast com informações como host e descrição.
     - `Preferidas`: Gerencia a seleção de conteúdos com base na classificação.

## Funcionalidades

### Classes Principais

1. **`Audio`**
   - Propriedades:
     - `totalReproducoes`: Número total de reproduções.
     - `totalCurtidas`: Número total de curtidas.
     - `classificacao`: Avaliação do áudio com base em critérios definidos.
     - `nome`: Nome do áudio.
   - Métodos:
     - `Curtir()`: Incrementa o número de curtidas.
     - `Reproduz()`: Incrementa o número de reproduções.

2. **`Musica`** (herda de `Audio`)
   - Propriedades adicionais:
     - `genero`: Gênero musical.
     - `artista`: Nome do artista.
     - `album`: Nome do álbum.
   - Sobrescrita de `getClassificacao`: A música recebe classificação 10 se tiver mais de 10 reproduções; caso contrário, 5.

3. **`Podcast`** (herda de `Audio`)
   - Propriedades adicionais:
     - `descricacao`: Descrição do podcast.
     - `host`: Nome do apresentador.
   - Sobrescrita de `getClassificacao`: O podcast recebe classificação 10 se tiver mais de 10 curtidas; caso contrário, 8.

4. **`Preferidas`**
   - Métodos:
     - `Inclui(Audio audio)`: Avalia se um conteúdo é um "hit" ou apenas uma "boa pedida" com base na classificação.

### Classe `Principal`

A classe `Principal` realiza as seguintes ações:

1. Cria objetos de `Musica` e `Podcast` com informações específicas.
2. Simula reproduções e curtidas aleatórias usando a classe `Random`.
3. Exibe informações detalhadas, incluindo nome, reproduções, curtidas e classificação.
4. Avalia quais conteúdos são considerados "hits" utilizando a classe `Preferidas`.

## Exemplo de Saída

```
Música: Eddie
Reproduções: 15
Curtidas: 20
Classificação: 10

Podcast: PeeWee Cast
Reproduções: 12
Curtidas: 15
Classificação: 10

Eddie é considerado um hit.
PeeWee Cast é considerado um hit.
```

## Como Executar

1. Clone o repositório ou copie os arquivos do projeto.
2. Certifique-se de que o JDK (Java Development Kit) esteja instalado.
3. Compile e execute a classe principal (`Principal`) utilizando o comando:
   ```bash
   javac lucasbarros/soundflow/principal/Principal.java
   java lucasbarros.soundflow.principal.Principal
   ```

## Possíveis Melhorias

- Adicionar persistência de dados para salvar o progresso (como reproduções e curtidas).
- Implementar uma interface gráfica (GUI) para interagir com o sistema.
- Ampliar funcionalidades, como criação de playlists ou sistema de busca.
- Expandir os critérios de classificação com base em métricas adicionais.

---

**Autor**: Lucas Barros Simon
