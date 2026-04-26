# InterFatecs 2025 - Decisão do Agricultor
<p>Este repositório contém a solução para o problema <strong>"Decisão do Agricultor"</strong>, um sistema de inteligência artificial simples desenvolvido para auxiliar na irrigação de plantações, otimizando o uso da água e garantindo a produtividade.</p>
<hr>
<h2>⚙️ Variáveis Ambientais (Sensores)</h2>
<p>O sistema baseia sua decisão em três variáveis coletadas:</p>
<ul>
<li><strong>Temperatura Atual (T):</strong> Valor real em graus Celsius. Indica o risco de evaporação da água no solo.</li>
<li><strong>Umidade do Solo (U):</strong> Valor real em porcentagem. Reflete a quantidade de água presente no solo e disponível para as plantas.</li>
<li><strong>Previsão de Chuva (P):</strong> Valor inteiro. Indica se há expectativa de chuva para o período (<code>0</code> = Não há previsão, <code>1</code> = Há previsão).</li>
</ul>
<h2>🧠 Lógica de Decisão (Regras de Negócio)</h2>
<p>O AGRO-DECISOR utiliza a seguinte árvore de decisão para gerar suas recomendações:</p>
<ul>
    <li><strong>Regra 1:</strong> Se a Previsão de Chuva for igual a <code>1</code> (há previsão de chuva), a recomendação é <strong>NAO REGAR</strong>, pois a chuva natural suprirá a necessidade hídrica.</li>
    <li><strong>Regra 2:</strong> Caso contrário (se a Previsão de Chuva for igual a <code>0</code>):
        <ul>
            <li><strong>Sub-regra 2.1:</strong> Se a Temperatura for maior que <code>30.0°C</code> <strong>E</strong> a Umidade do Solo for menor que <code>50.0%</code>, a recomendação é <strong>REGAR</strong>. Esta condição indica solo seco e calor extremo.</li>
            <li><strong>Sub-regra 2.2:</strong> Em todas as outras condições não cobertas pelas regras anteriores, a recomendação é <strong>NAO REGAR</strong>.</li>
        </ul>
    </li>
</ul>
<h2>📥 Formato de Entrada</h2>
<p>A entrada consiste em múltiplas linhas via console:</p>
<ol>
    <li>A primeira linha contém um único inteiro <code>N</code> (1 ≤ N ≤ 1000), representando o número de conjuntos de leituras de sensores que serão processados.</li>
    <li>As <code>N</code> linhas seguintes contêm, cada uma, três valores separados por espaço: <code>T</code> (float/double), <code>U</code> (float/double) e <code>P</code> (inteiro 0 ou 1).</li>
</ol>
<h2>📤 Formato de Saída</h2>
<p>Para cada um dos <code>N</code> conjuntos de leituras, o programa imprime uma única linha contendo a recomendação do sistema: <code>REGAR</code> ou <code>NAO REGAR</code>.</p>
<h2>📊 Casos de Teste (Exemplos)</h2>
<h3>Exemplo 1</h3>
<h4>Entrada:</h4>
<pre><code>3
35.0 40.0 0
28.0 60.0 1
32.0 45.0 0</code></pre>
    <h4>Saída:</h4>
    <pre><code>REGAR
NAO REGAR
REGAR</code></pre>
<h3>Exemplo 2</h3>
<h4>Entrada:</h4>
<pre><code>2
25.0 60.0 1
28.0 40.0 1</code></pre>
<h4>Saída:</h4>
<pre><code>NAO REGAR
NAO REGAR</code></pre>
</body>
</html>
