var express = require('express');
var app = express();
var bodyParser = require('body-parser');
app.use(bodyParser.json());

app.get('/', function(req, res) {
  res.send('Oi, mundo :-)');
});

// Função de validação
function validarEntradas(a, b, res) {
    if (a === undefined || b === undefined) {
        res.status(400).send("Erro: Os parâmetros 'a' e 'b' são necessários.");
        return false;
    }
    if (typeof a !== 'number' || typeof b !== 'number') {
        res.status(400).send("Erro: 'a' e 'b' devem ser números.");
        return false;
    }
    return true;
}

// Rota para soma
app.post('/soma', function (req, res) {
    var { a, b } = req.body;
    if (!validarEntradas(a, b, res)) return;
    var resultado = soma(a, b);
    res.send(`O resultado da soma de ${a} e ${b} é ${resultado}`);
});

// Rota para subtração
app.post('/subtracao', function (req, res) {
    var { a, b } = req.body;
    if (!validarEntradas(a, b, res)) return;
    var resultado = subtracao(a, b);
    res.send(`O resultado da subtração de ${a} e ${b} é ${resultado}`);
});

// Rota para multiplicação
app.post('/multiplicacao', function (req, res) {
    var { a, b } = req.body;
    if (!validarEntradas(a, b, res)) return;
    var resultado = multiplicacao(a, b);
    res.send(`O resultado da multiplicação de ${a} e ${b} é ${resultado}`);
});

// Rota para divisão
app.post('/divisao', function (req, res) {
    var { a, b } = req.body;
    if (!validarEntradas(a, b, res)) return;
    if (b === 0) {
        res.status(400).send('Erro: Divisão por zero não é permitida.');
    } else {
        var resultado = divisao(a, b);
        res.send(`O resultado da divisão de ${a} e ${b} é ${resultado}`);
    }
});

// Funções de operações
function soma(a, b) {
  return a + b;
}

function subtracao(a, b) {
  return a - b;
}

function multiplicacao(a, b) {
  return a * b;
}

function divisao(a, b) {
  return a / b;
}

var port = 3001;

// Iniciando o processo do servidor
app.listen(port, function() {
  console.log(`App de Exemplo escutando na porta http://localhost:${port}/`);
});
