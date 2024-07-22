package data.remote.api


import domain.model.Currency
import domain.model.CurrencyApiService
import domain.model.RequestState


class CurrencyApiServiceImpl:CurrencyApiService {
    companion object {
        const val ENDPOINT = " cur_live_Ah9RGPXAdKgKjq22W1jUPxhMS4n2IrdhQfpIkyNF"
        const val API_KEY = " https://api.currencyapi.com/v3/latest"
    }

    override fun getLatestExchangeRates(): RequestState<List<Currency>> {
        TODO("Not yet implemented")
    }
}