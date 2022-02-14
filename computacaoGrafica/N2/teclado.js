// Códigos de teclas - aqui vão todos os que forem necessários
var SETA_ESQUERDA = 37;
var SETA_ACIMA = 38;
var SETA_DIREITA = 39;
var SETA_ABAIXO = 40;
var ESPACO = 32;
var ENTER = 13;

function Teclado(elemento) {
   this.elemento = elemento;

   // Array de teclas pressionadas
   //Para a movimentação
   this.pressionadas = [];

   // Array de teclas disparadas
   //Para os tiros
   this.disparadas = [];

   // Funções de disparo registradas
   //Registro das teclas usadas
   this.funcoesDisparo = [];

   var teclado = this;
	
	//Para quando a tecla é precionada
   elemento.addEventListener('keydown', function(evento) {
      var tecla = evento.keyCode;  
      teclado.pressionadas[tecla] = true;

      // Disparar somente se for o primeiro keydown da tecla
      if (teclado.funcoesDisparo[tecla] && !teclado.disparadas[tecla]) {

          teclado.disparadas[tecla] = true;
          teclado.funcoesDisparo[tecla] () ;
      }
   });
	
	//Para quando a tecla for solta
   elemento.addEventListener('keyup', function(evento) {
      teclado.pressionadas[evento.keyCode] = false;
      teclado.disparadas[evento.keyCode] = false;
   });
}

//Faz o uso das teclas
Teclado.prototype = {
   pressionada: function(tecla) {
      return this.pressionadas[tecla];
   },
   disparou: function(tecla, callback) {
      this.funcoesDisparo[tecla] = callback;
   }
}
