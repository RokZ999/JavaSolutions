package Repl;

public class Solution065 {
	public static void main(String[] args) {



		Stock google = new Stock("GOOG","Google",800, 3000);
		google.adjustPrice(20);
		System.out.println(google);
		}
	}
	class Stock
	{
		String tickerSymbol;
		String companyName;
		int price;
		int oldPrice;
		double percentChange; 
		int totalShares;
		long marketCap;

		public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
			this.tickerSymbol = tickerSymbol;
			this.companyName = companyName;
			this.oldPrice = this.price = price;
			this.totalShares = totalShares;
			percentChange = 0;
			marketCap = totalShares*price;
		}
		public void adjustPrice(int change){
			this.price +=change;

			this.percentChange = change==0 ? 0 : change >= 0 ? this.price/this.oldPrice : this.oldPrice/this.price;

			this.marketCap = totalShares*this.price;
			
		}
		@Override
		public String toString() {
			return String.format("Ticker Symbol: %s%nCompany: %s%nCurrent Price: $%d  (%s%.2f%%)%nMarket Cap: $%d", this.tickerSymbol,this.companyName,this.price,(this.price>this.oldPrice) ? "+" : "-",this.percentChange, marketCap);
		}

	}