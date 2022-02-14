var SOM_EXPLOSAO = new Audio();
SOM_EXPLOSAO.src = 'snd/explosao.mp3';
SOM_EXPLOSAO.volume = 0.4;
SOM_EXPLOSAO.load();

//Função que faz os negócio das explosão :)
function Explosao(context, imagem, x, y) {
   this.context = context;
   this.imagem = imagem;
   this.spritesheet = new Spritesheet(context, imagem, 1, 5);
   this.spritesheet.intervalo = 75;
   this.x = x;
   this.y = y;
   this.animando = false;
   
   var explosao = this;
   this.fimDaExplosao = null; //Termina a explosão impedindo que de loop
   this.spritesheet.fimDoCiclo = function() {
      explosao.animacao.excluirSprite(explosao);
      if (explosao.fimDaExplosao) explosao.fimDaExplosao();//Se terminar a explosão ele a apaga da tela
   }
   //executa o som da explosão
   SOM_EXPLOSAO.currentTime = 0.0;
   SOM_EXPLOSAO.play();
}
Explosao.prototype = {
   atualizar: function() {
		//Está vazio de forma intencional, não há o que por, mas deve existir, senão não funciona
   },
   desenhar: function() {
      this.spritesheet.desenhar(this.x, this.y);
      this.spritesheet.proximoQuadro();
   }
}