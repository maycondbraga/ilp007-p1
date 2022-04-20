/* Camila Rocha Massoli RA: 20200395
Maycon Douglas Braga dos Santos RA: 20200484 */

public class Divida {
   private double _valor;
   private double _taxaDeJuros;
   private int _totalDeParcelas;
   
   public Divida(double valor, double taxaDeJuros, int totalDeParcelas) throws Exception {
      if (valor <= 0)
         throw (new Exception(String.format("Valor R$%.2f invalido.", valor)));
      else
         setValor(valor);
      
      if (taxaDeJuros <= 0.0)
         throw new Exception(String.format("Taxa de juros %.2f invalido.", taxaDeJuros));
      else
         setTaxaDeJuros(taxaDeJuros);
      
      if (totalDeParcelas <= 0)
         throw new Exception(String.format("Total de prestacoes %d invalida.", totalDeParcelas));
      else
         setTotalDeParcelas(totalDeParcelas);
   }
   
   private void setValor(double valor) {
      _valor = valor;
   }
   
   public double getValor() {
      return _valor;
   }
   
   private void setTaxaDeJuros(double taxaDeJuros) {
      _taxaDeJuros = taxaDeJuros / 100;
   }
   
   public double getTaxaDeJuros() {
      return _taxaDeJuros;
   }
   
   private void setTotalDeParcelas(int totalParcelas) {
      _totalDeParcelas = totalParcelas;
   }
   
   public int getTotalDeParcelas() {
      return _totalDeParcelas;
   }
   
   public String toString() {
      StringBuilder result = new StringBuilder();

      result.append(String.format("\n\nValor: R$%.2f", getValor()));
      result.append("\nTaxa de juros: " + getTaxaDeJuros() * 100 + "%");      
      result.append(String.format("\nTotal de parcelas: %d", getTotalDeParcelas()));

      double dividaTotalAtual = getValor();
      double prestacaoAtual = getTotalDeParcelas();
      double valorPrestacaoAtual = 0;
      double dividaRestanteAtual = 0;
      for (int i = 0; i <= getTotalDeParcelas(); i++) {
         if (i == 0) {
            dividaRestanteAtual = dividaTotalAtual;
            result.append("\n\n-----------------------\n");
            result.append(String.format("Mes            : %d \nDivida Total   : %.2f \nPrestacao      : - \nDivida Restante: %.2f", i, dividaTotalAtual, dividaRestanteAtual));
            result.append("\n-----------------------\n");
         }
         else {
            dividaTotalAtual = dividaRestanteAtual * (1 + getTaxaDeJuros());
            valorPrestacaoAtual = dividaTotalAtual / prestacaoAtual;
            dividaRestanteAtual = dividaTotalAtual - valorPrestacaoAtual;
            
            result.append("\n-----------------------\n");
            result.append(String.format("Mes            : %d \nDivida Total   : %.2f \nPrestacao      : %.2f \nDivida Restante: %.2f", i, dividaTotalAtual, valorPrestacaoAtual, dividaRestanteAtual));
            result.append("\n-----------------------\n");
            
            prestacaoAtual -= 1;
         }
      }
      
      return result.toString();
   }
}