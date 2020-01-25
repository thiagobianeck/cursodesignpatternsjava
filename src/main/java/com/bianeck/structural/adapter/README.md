# ADAPTER

### Conceito   
**Adapter** (Adaptador, ou também conhecido como Wrapper) é um dos padrões de projeto estruturais do GoF (Gang of Four).
 De forma exemplificável por um adaptadores de cabos, o padrão Adapter converte a interface de uma classe para outra interface que o cliente espera encontrar, "traduzindo" solicitações do formato requerido pelo usuário para o formato compatível com o a classe adaptee e as redirecionando. Dessa forma, o Adaptador permite que classes com interfaces incompatíveis trabalhem juntas.
 
### Descrição das Classes

- Target (Alvo): define a interface do domínio específico que o cliente utiliza.
- Adapter (Adaptador): adapta a interface Adaptee para a interface da classe Target.
- Adaptee (Adaptada): define uma interface existente que necessita ser adaptada.
- Client (Cliente): colabora com os objetos em conformidade com a interface Target.

### Quando Utilizar ?
- se deseja utilizar uma classe existente, porém sua interface não corresponde à interface que se necessita;
- o desenvolvedor quiser criar classes reutilizáveis que cooperem com classes não-relacionadas ou não-previstas, ou seja, classes que não possuem necessariamente interfaces compatíveis;
- (exclusivamente para adaptadores de objetos) é necessário utilizar muitas subclasses existentes, porém, impossível de adaptar essas interfaces criando subclasses para cada uma. Um adaptador de objeto pode adaptar a interface de sua classe mãe.

Fonte: Wikipedia: [Adapter](https://pt.wikipedia.org/wiki/Adapter)