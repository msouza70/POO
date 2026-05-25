public class Aluno {
   private String nome;
   private int media;
   
   public void setNome(String nome) {
      this.nome = nome;
   }
   
   public void setMedia(int media) {
      this.media = media;
   }
   
   public String toString() {
      return "Nome: " + nome + "\nMedia: " + media;
   }
}   
   
